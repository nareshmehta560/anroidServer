package com.example.anroidserver.model.kategorie;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@NoArgsConstructor
@Getter
@Setter

@Entity
public class Kategorie {
    @Id
    @GeneratedValue
    private int kategorie_id;

    @NotNull
    private String name;

    @CreationTimestamp
    private Date erstellungsdatum;
}
