package com.stickershop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "shopping_product")
@Getter
@Setter
public class ShoppingProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="shopping_id")
    private Shopping shopping;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

    private String name;

    private int quantity;

    private int price;

    private int mileage;

}
