package com.brixton.basedatos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bill extends Audit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "legalclient_ruc", foreignKey = @ForeignKey(name = "fk_bill_legalclient_ruc"))
    private LegalClient legalClient;

    @ManyToOne
    @JoinColumn(name = "proforma_id", foreignKey = @ForeignKey(name = "fk_bill_proforma_id"))
    private Proforma proforma;

    private float subtotal;
    private float igv;
    private float total;
}
