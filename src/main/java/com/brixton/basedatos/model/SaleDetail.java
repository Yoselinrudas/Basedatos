package com.brixton.basedatos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "sale_detail")
@Getter
@Setter
public class SaleDetail extends Audit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "product_id", foreignKey = @ForeignKey(name = "fk_saledetail_product"))
    private Product product;

    @Column(name = "sale_price")
    private float salePrice;
    private float quantity;

    @ManyToOne
    @JoinColumn(name = "statussale_id", foreignKey = @ForeignKey(name = "fk_saledetail_statusdetail_id"))
    private StatusSale statusSale;

    @ManyToOne
    @JoinColumn(name = "proforma_id", foreignKey = @ForeignKey(name = "fk_saledetail_proforma_id"))
    private Proforma proforma;

}
