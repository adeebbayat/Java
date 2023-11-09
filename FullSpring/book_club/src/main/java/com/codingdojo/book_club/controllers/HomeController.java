package com.codingdojo.book_club.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.book_club.models.Book;
import com.codingdojo.book_club.models.LoginUser;
import com.codingdojo.book_club.models.User;
import com.codingdojo.book_club.services.BookService;
import com.codingdojo.book_club.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {
 
    
    @Autowired
    UserService userService;

    @Autowired
    BookService bookService;

    @GetMapping("/")
    public String index(Model model){
        // Why do we need this? 
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());

        return "index.jsp";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        
                // Add once service is implemented:
                if(result.hasErrors()) {
                    model.addAttribute("newUser", new User());
                    return "index.jsp";
                }
                User user = userService.login(newLogin, result);
                if(user == null) {
                    model.addAttribute("newUser", new User());
                    return "index.jsp";
                }
                
                // No errors! 
        // TO-DO Later: Store their ID from the DB in session, 
        // in other words, log them in.
        session.setAttribute("userId", user.getId());
        session.setAttribute("user", user);
    
        return "redirect:/books";
    }

    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser,BindingResult result, Model model, HttpSession session){
        User user = userService.register(newUser, result);
        if(result.hasErrors()) {
            // Be sure to send in the empty LoginUser before 
            // re-rendering the page.
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }
        
        // No errors! 
        // TO-DO Later: Store their ID from the DB in session, 
        // in other words, log them in.
        session.setAttribute("userId", user.getId());
        session.setAttribute("user", user);
        return "redirect:/books";
    }

    @GetMapping("/books")
    public String home(Model model, HttpSession session){
        if(session.getAttribute("user") == null){
            return "redirect:/";
        }
        List<Book> books = bookService.allBooks();
        model.addAttribute("user", session.getAttribute("user"));
        model.addAttribute("books", books);
        return "home.jsp";
    }

    @GetMapping("/books/new")
    public String newBook(@ModelAttribute Book book, Model model,HttpSession session){
        if(session.getAttribute("user") == null){
            return "redirect:/";
        }
        model.addAttribute("userId", session.getAttribute("userId"));
        return "newBook.jsp";

    }

    @PostMapping("/newbook")
    public String createBook(@Valid @ModelAttribute("book") Book book,BindingResult result){
        if(result.hasErrors()){
            return "newBook.jsp";
        }
        Book newBook = bookService.addBook(book);
        return String.format("redirect:/books/%d",newBook.getId());
    }

    @GetMapping("/books/{bookId}")
    public String showBook(@PathVariable("bookId") Long bookId,Model model,HttpSession session){
        if(session.getAttribute("user") == null){
            return "redirect:/";
        }
        Book book = bookService.findBook(bookId);
        User user = book.getUser();
        User currentUser = (User) session.getAttribute("user");
        model.addAttribute("currentUser", currentUser);
        model.addAttribute("book", book);
        model.addAttribute("user", user);

        return "showBook.jsp";
    }

    @DeleteMapping("/delete/{bookId}")
    public String destroy(@PathVariable("bookId") Long bookId){
        bookService.deleteBook(bookId);
        return "redirect:/books";
    }

    @GetMapping("/books/{bookId}/edit")
    public String editBook(@PathVariable("bookId") Long id, Model model,HttpSession session){
        if(session.getAttribute("user") == null){
            return "redirect:/";
        }
        model.addAttribute("book", bookService.findBook(id));
        return "edit.jsp";
    }

    @PostMapping("/books/{bookId}/edit")
    public String updateBook(@Valid @ModelAttribute("book") Book book, BindingResult result, @PathVariable("bookId") Long id, Model model){
        if(result.hasErrors()){
            return "edit.jsp";
        }
        bookService.updateBook(book);
        return "redirect:/books/" + id;
    }



}
