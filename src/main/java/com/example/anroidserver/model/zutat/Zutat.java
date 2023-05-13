package com.example.anroidserver.model.zutat;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "zutaten")
public class Zutat {
        @Id
        @GeneratedValue
        @Column(name = "zutat_id")
        private int id;

        /**
         * Der Name des Rezepts.
         */
        @NotNull
        private String name;


        /**
         * Das Erstellungsdatum, wird von der Datenbank automatisch gesetzt.
         */
        @CreationTimestamp
        @Column(updatable = false,nullable = false)
        @Temporal(TemporalType.TIMESTAMP)
        private Date erstellungsdatum;

    // other fields and methods

        /**
         * @param zutatId      ID
         * @param zutatName    Name
         * @param creationDate Erstellungsdatum
         */
        public Zutat( int zutatId, final String zutatName,
                     final Date creationDate) {
            this.id = zutatId;
            this.name = zutatName;
            this.erstellungsdatum = creationDate;
        }

    public Zutat() {

    }

    /**
         * @param id           ID
         * @param name         Name
         * @param creationDate Erstellungsdatum
         * @return Zutat
         */
        public static Zutat zutat(final int id, final String name,
                                  final Date creationDate) {
            return new Zutat(id, name, creationDate);
        }

        /**
         * @param zutatName Name der Zutat
         */
        public  void setName(final String zutatName) {
            this.name = zutatName;
        }

        /**
         * @param date Datum
         */


        /**
         * @param date Loeschdatum
         */


        /**
         * @return int
         */
        public int getId() {
            return id;
        }

        /**
         * @return aenderungsdatum
         */


        /**.
         * @param zId id der Zutat;
         */
        public  void setId(final int zId) {
            this.id = zId;
        }

        /**
         * @return String
         */
        public  String getName() {
            return name;
        }

        /**
         * @return Date
         */
        public Date getCreationDate() {
            return erstellungsdatum;
        }


        /*
         * Changed: Entfernen der getRecipes Funktion, da die Zutat keine
         * Ahnung hat, in welchen Rezepten sie vorkommt.
         */

        /**
         * Keine Ahnung was die machen soll.
         */
        private void delete() {

        }


        /**
         * @return String toString-Methode
         */
        @Override
        public  String toString() {
            return name;
        }
    @PrePersist
    protected void onCreate() {
        if (this.erstellungsdatum == null) {
            this.erstellungsdatum = new Date();
        }
        }

}
