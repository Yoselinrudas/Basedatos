package com.brixton.basedatos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Proforma extends Audit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "employee_id", foreignKey = @ForeignKey(name = "fk_proforma_employee_id"))
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "statussale_id", foreignKey = @ForeignKey(name = "fk_proforma_statussale_id"))
    private StatusSale statusSale;

    private float total;

}
