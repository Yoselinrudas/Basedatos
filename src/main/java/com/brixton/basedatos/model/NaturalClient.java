package com.brixton.basedatos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "natural_client")
@Getter
@Setter
public class NaturalClient extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "documentnumber", length = 20)
    private String documentNumber;

    @ManyToOne
    @JoinColumn(name = "typedocument_id",foreignKey = @ForeignKey(name = "fk_naturalclient_typedocument_id"))
    private TypeDocument typeDocument;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String lastName;

}
