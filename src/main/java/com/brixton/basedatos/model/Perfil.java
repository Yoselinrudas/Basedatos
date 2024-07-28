package com.brixton.basedatos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Perfil extends Audit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte id;

    @Column(length = 20)
    private String perfilName;

    @OneToMany(mappedBy = "perfil")
    private Set<EmployeexPerfil> employeexPerfil = new HashSet<>();

}
