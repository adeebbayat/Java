package com.codingdojo.burger_tracker.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="burgers")
public class Burger {
    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Burger Name
    @NotNull
    @Size(min=5,max=200, message="Burger name must not be empty")
    private String burgerName;

    // Restaurant Name
    @NotNull
    @Size(min=5,max=200, message = "Restaurant name must not be empty")
    private String restaurantName;

    // Rating (1-5)
    @NotNull
    @Min(0)
    @Max(5)
    private Integer rating;

    // Notes
    @NotNull
    @Size(min=5,max=200,message="Notes must not be empty")
    private String notes;


    public Burger() {
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBurgerName() {
        return this.burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public String getRestaurantName() {
        return this.restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Integer getRating() {
        return this.rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    

    
}
