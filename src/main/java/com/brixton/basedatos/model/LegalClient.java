package com.brixton.basedatos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class LegalClient extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 11)
    private String ruc;

    @Column(length = 50)
    private String razonSocial;

    private boolean supplier;

}
