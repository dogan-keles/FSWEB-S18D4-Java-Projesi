package com.workintech.accountapp.service;

import com.workintech.accountapp.entity.Adress;

import java.util.List;

public interface AdressService {
    List<Adress> findAll();
    Adress find(long id);
    Adress save(Adress adress);
    Adress delete(long id);


}
