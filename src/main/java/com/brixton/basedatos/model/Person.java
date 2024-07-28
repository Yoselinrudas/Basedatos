package com.brixton.basedatos.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class Person extends Audit {

    @Column(length = 50)
    private String address;

    @Column(length = 20)
    private String phone;

    @Column(length = 20)
    private String email;
}
