package com.stickershop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "order_info_product")
@Getter
@Setter
public class OrderInfoProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="order_info_id")
    private OrderInfo orderInfo;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

    private String name;

    private int quantity;

    private int price;

    private int mileage;

}
