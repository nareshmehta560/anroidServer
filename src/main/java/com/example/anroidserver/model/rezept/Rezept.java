package com.example.anroidserver.model.rezept;

import com.example.anroidserver.model.zutat.Zutat;
import com.example.anroidserver.model.kategorie.Kategorie;
import com.sun.istack.NotNull;
import com.sun.istack.Nullable;

import javax.persistence.*;
import java.sql.Time;
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
    @Column
    private List<Kategorie> categories = new LinkedList<>();
    @Column
    private String zubereitung;
    @ManyToMany
    @JoinTable(name = "rezeptZutaten")
    @Column
    private List<Zutat> zutats = new LinkedList<>();

    @Column
    private int portion;

    @Column
    private String duration;



    public Rezept(String titel, List<Kategorie> categories, List<Zutat> zutats, String zubereitung,int portion,String duration) {
        this.titel = titel;
        this.categories = categories;
        this.zutats = zutats;
        this.zubereitung= zubereitung;
        this.portion = portion;
        this.duration = duration;
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

    public String getZubereitung() {
        return zubereitung;
    }

    public void setZubereitung(String zubereitung) {
        this.zubereitung = zubereitung;
    }

    public List<Zutat> getZutats() {
        return zutats;
    }

    public void setZutats(List<Zutat> zutats) {
        this.zutats = zutats;
    }

    public int getPortion() {
        return portion;
    }

    public void setPortion(int portion) {
        this.portion = portion;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
