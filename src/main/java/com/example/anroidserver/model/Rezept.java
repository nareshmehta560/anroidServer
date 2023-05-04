package com.example.anroidserver.model;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Rezept {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rezept_id;
    @NotNull
    private String titel;
    @ManyToMany
    @JoinTable(name = "rezeptcategorie")
    @Nullable
    private List<Kategorie> categories = new LinkedList<>();

    public Rezept(String titel, List<Kategorie> categories) {
        this.titel = titel;
        this.categories = categories;
    }

    public Rezept() {

    }

    public Rezept(String titel) {
        this.titel = titel;
    }

    public int getRezept_id() {
        return rezept_id;
    }

    public void setRezept_id(int rezept_id) {
        this.rezept_id = rezept_id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public List<Kategorie> getCategories() {
        return categories;
    }

    public void setCategories(List<Kategorie> categories) {
        this.categories = categories;
    }
}
