package com.workintech.accountapp.repository;

import com.workintech.accountapp.entity.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepository extends JpaRepository<Adress, Long> {
}
