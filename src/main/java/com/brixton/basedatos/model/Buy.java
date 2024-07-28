package com.brixton.basedatos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Buy extends Audit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "buystatus_id", foreignKey = @ForeignKey(name = "fk_buy_buystatus_id"))
    private BuyStatus buyStatus;

    @Column(name = "motivostatus")
    private String motivoStatus;

    @ManyToOne
    @JoinColumn(name = "buyemployee_id", foreignKey = @ForeignKey(name = "fk_buy_employee_id"))
    private Employee employee;

}
