package com.example.anroidserver.controller;

import com.example.anroidserver.model.zutat.Zutat;
import com.example.anroidserver.model.zutat.ZutatDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping
public class ZutatController {
    @Autowired
    private ZutatDao zutatDao;
    @PostMapping("/zutat/save")
    public Zutat saveKategorie(@RequestBody Zutat kategorie) {
        return zutatDao.saveZutat(kategorie);
    }
    @GetMapping("/zutat/get")
    public List<Zutat> getZutat() {
        return zutatDao.getAllZutat();
    }
    @DeleteMapping("/zutat/{rezeptid}")
    public void deleteZutat(@PathVariable("kategorieid") int id){
        zutatDao.deleteZutat(id);
    }

}
