package com.brixton.basedatos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DetailBill extends Audit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "product_id", foreignKey = @ForeignKey(name = "fk_detailbill_product_id"))
    private Product product;

    @Column(name = "sale_price")
    private float salePrice;
    private float quantity;
    private float total;

    @ManyToOne
    @JoinColumn(name = "bill_id", foreignKey = @ForeignKey(name = "fk_detailbill_bill_id"))
    private Bill bill;
}
