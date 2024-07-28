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

    @Column(name = "nameproduct", length = 30)
    private String nameProduct;

    @Column(name = "quantitystock")
    private float quantityStock;

    @Column(name = "quantityintransit")
    private float quantityInTransit;

    @Column(name = "requiredquantity")
    private float requiredQuantity;

    @Column(name = "expectedamount")
    private float expectedAmount;

    @ManyToOne
    @JoinColumn(name = "buy_id", foreignKey = @ForeignKey(name = "fk_producttobuy_buy"))
    private  Buy buy;
}
