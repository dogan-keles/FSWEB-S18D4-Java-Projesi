package com.workintech.accountapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="adress", schema = "fsweb")
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name="street")
    private String street;

    @Column(name = "no")
    private int no;

    @Column(name="city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name="description")
    private String description;

@OneToOne(mappedBy = "adress", cascade = {CascadeType.DETACH, CascadeType.MERGE,
        CascadeType.MERGE, CascadeType.REFRESH} )
    private Customer customer;


}
