package com.brixton.basedatos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class StatusLogistic extends Audit{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte id;
    @Column(length = 20)
    private String description;
    @Column(name = "statuslogistic", length = 20)
    private String statusLogistic;

}
