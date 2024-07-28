package com.brixton.basedatos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrderBuy extends Audit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "buy_id", foreignKey = @ForeignKey(name = "fk_orderbuy_buy"))
    private Buy buy;

    @ManyToOne
    @JoinColumn(name = "supplier_id", foreignKey = @ForeignKey(name = "fk_orderbuy_legalclient_id"))
    private LegalClient legalClient;

    @ManyToOne
    @JoinColumn(name = "employee_id", foreignKey = @ForeignKey(name = "fk_orderbuy_employee"))
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "statuslogistic_id", foreignKey = @ForeignKey(name = "fk_orderbuy_statuslogistic"))
    private StatusLogistic statusLogistic;

}
