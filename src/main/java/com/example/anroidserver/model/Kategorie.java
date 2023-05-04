package com.example.anroidserver.model;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Kategorie {
    @Id
    @GeneratedValue
    private int kategorie_id;

    @NotNull
    private String name;

    @CreationTimestamp
    private Date erstellungsdatum;

    public Kategorie(String name) {
        this.name = name;
    }
    public Kategorie() {

    }

    public int getKategorie_id() {
        return kategorie_id;
    }

    public void setKategorie_id(int kategorie_id) {
        this.kategorie_id = kategorie_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getErstellungsdatum() {
        return erstellungsdatum;
    }

    public void setErstellungsdatum(Date erstellungsdatum) {
        this.erstellungsdatum = erstellungsdatum;
    }
}
