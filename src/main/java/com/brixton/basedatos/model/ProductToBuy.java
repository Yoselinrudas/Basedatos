package com.brixton.basedatos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProductToBuy extends Audit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "product_id", foreignKey = @ForeignKey(name = "fk_producttobuy_product"))
    private Product product;

    @Column(length = 30)
    private String nameProduct;
    private float quantityStock;
    private float quantityInTransit;
    private float requiredQuantity;
    private float expectedAmount;

    @ManyToOne
    @JoinColumn(name = "buy_id", foreignKey = @ForeignKey(name = "fk_producttobuy_buy"))
    private  Buy buy;
}
