package com.codingdojo.savetravels.controllers;

import java.util.List;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.savetravels.models.Expense;
import com.codingdojo.savetravels.services.ExpenseService;



@Controller
public class ExpenseController {
    @Autowired
    ExpenseService expenseService;

    @GetMapping("/")
    public String home(@ModelAttribute("expense") Expense expense, Model model){
        List<Expense> expenses = expenseService.allExpenses();
        model.addAttribute("expenses", expenses);
        return "index.jsp";
    }

    @PostMapping("/addExpense")
    public String home(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model ){
        if(result.hasErrors()){
            List<Expense> expenses = expenseService.allExpenses();
            model.addAttribute("expenses", expenses);
            return "index.jsp";
        }
        expenseService.addExpense(expense);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
	public String editExpense(@PathVariable("id") Long id, @ModelAttribute("expense") Expense expense, Model model) {
		model.addAttribute("expense", expenseService.findExpense(id));
		return "edit.jsp";
	}
	
	@PostMapping("/edit/{id}")
	public String updateExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, @PathVariable("id") Long id, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("expense", expense);
			return "index.jsp";
		}
		expenseService.updateExpense(expense);
		return "redirect:/";
	}



    @DeleteMapping("/delete/{id}")
    public String destroy(@PathVariable("id") Long id) {
        expenseService.deleteExpense(id);
        return "redirect:/";
    }


    @GetMapping("/expenses/{id}")
    public String find(@PathVariable("id") Long id, Model model) {
    Expense expense = expenseService.findExpense(id);
    model.addAttribute("expense", expense);
    return "view.jsp";
}




    

}
