package com.brixton.basedatos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DetailTicket extends Audit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "product_id", foreignKey = @ForeignKey(name = "fk_detailticket_product_id"))
    private Product product;

    private float salePrice;
    private float quantity;
    private float total;

    @ManyToOne
    @JoinColumn(name = "ticket_id", foreignKey = @ForeignKey(name = "fk_detailticket_ticket_id"))
    private Ticket ticket;
}
