package com.workintech.accountapp.service;

import com.workintech.accountapp.entity.Adress;
import com.workintech.accountapp.repository.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdressServiceImp implements AdressService{
    private AdressRepository adressRepository;
@Autowired
    public AdressServiceImp(AdressRepository adressRepository) {
        this.adressRepository = adressRepository;
    }

    @Override
    public List<Adress> findAll() {
        return adressRepository.findAll();
    }

    @Override
    public Adress find(long id) {
    Optional<Adress> optionalAdress = adressRepository.findById(id);
    if (optionalAdress.isPresent()){
        return optionalAdress.get();
    }
    return null;
    }

    @Override
    public Adress save(Adress adress) {
        return adressRepository.save(adress);
    }

    @Override
    public Adress delete(long id) {
        Adress adress =  find(id);

        if(adress != null) {
            adressRepository.delete(adress);
            return adress;
        }
        return null;
    }
}
