package com.example.anroidserver.model.kategorie;

import com.example.anroidserver.repositories.KategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KategorieDao {
    @Autowired
    private KategorieRepository kategorieRepository;

    public Kategorie saveKategoire(Kategorie kategorie) {
        return kategorieRepository.save(kategorie);
    }

    public List<Kategorie> getKategorie() {
        List<Kategorie> kategories = new ArrayList<>();
        Streamable.of(kategorieRepository.findAll())
                .forEach(kategories::add);
        return kategories;
    }
    public void deleteKategorie(int kategorieid) {
       kategorieRepository.deleteById(kategorieid);
    }

}
