package com.brixton.basedatos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product extends Audit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 50)
    private String productName;

    @ManyToOne
    @JoinColumn(name = "category_id",foreignKey = @ForeignKey(name = "fk_product_category_id"))
    private Category category;

    private float quantity;

    private float priceSupplier;

    private float priceSale;

    @Column(length = 20)
    private String codeProduct;


}
