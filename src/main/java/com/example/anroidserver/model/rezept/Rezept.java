package com.example.anroidserver.model.rezept;

import com.example.anroidserver.model.zutat.Zutat;
import com.example.anroidserver.model.kategorie.Kategorie;
import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter

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

}
