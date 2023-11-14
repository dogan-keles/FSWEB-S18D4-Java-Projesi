package com.workintech.accountapp.controller;

import com.workintech.accountapp.entity.Adress;
import com.workintech.accountapp.service.AdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adress")
public class AdressController   {

    private AdressService adressService;
    @Autowired
    public AdressController(AdressService adressService) {
        this.adressService = adressService;
    }
    @GetMapping("/")
    public List<Adress> findAll(){
        return adressService.findAll();
    }

    @GetMapping("/{id}")
    public Adress find(@PathVariable long id){
        return adressService.find(id);
    }
    @PostMapping("/")
    public Adress save(@RequestBody Adress adress) {
        return adressService.save(adress);
    }
    @PutMapping("/{id}")
    public Adress save(@RequestBody Adress adress, @PathVariable long id) {
        Adress foundAdress = adressService.find(id);
        if (foundAdress != null) {
            adress.setId(id);
            return adressService.save(adress);
        }
        return null;
        //Exceptions.
    }
    @DeleteMapping("/{id}")
    public Adress remove(@PathVariable long id) {
        return adressService.delete(id);
    }
}
