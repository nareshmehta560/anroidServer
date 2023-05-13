package com.example.anroidserver.controller;

import com.example.anroidserver.model.kategorie.Kategorie;
import com.example.anroidserver.model.kategorie.KategorieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping
public class KategorieController {
    @Autowired
    private KategorieDao kategorieDao;
    @PostMapping("/kategorie/save")
    public Kategorie saveKategorie(@RequestBody Kategorie kategorie) {
        return kategorieDao.saveKategoire(kategorie);
    }
    @GetMapping("/kategorie/get")
    public List<Kategorie> getKategorie() {
        return kategorieDao.getKategorie();
    }
    @DeleteMapping("/kategorie/{rezeptid}")
    public void deleteKategorie(@PathVariable("kategorieid") int id){
        kategorieDao.deleteKategorie(id);
    }
}
