package com.codingdojo.dojos_and_ninjas.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="dojos")
public class Dojo {
    // ID
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    // Name
    @NotNull
    @Size(min=3,max=200,message="Dojo Name must not be empty")
    private String name;

    // CreatedAt UpdatedAt
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;

    @OneToMany(mappedBy="dojo",fetch = FetchType.LAZY)
    private List<Ninja> ninjas;
    
    public Dojo() {
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Ninja> getNinjas() {
        return this.ninjas;
    }

    public void setNinjas(List<Ninja> ninjas) {
        this.ninjas = ninjas;
    }


}
