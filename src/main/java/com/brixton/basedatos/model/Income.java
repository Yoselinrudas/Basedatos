package com.brixton.basedatos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Income extends Audit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "employee_id", foreignKey = @ForeignKey(name = "fk_income_employee"))
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "orderbuy_id", foreignKey = @ForeignKey(name = "fk_income_orderbuy"))
    private OrderBuy orderBuy;

    @ManyToOne
    @JoinColumn(name = "statuslogistic_id", foreignKey = @ForeignKey(name = "fk_income_statuslogistic"))
    private StatusLogistic statusLogistic;


}
