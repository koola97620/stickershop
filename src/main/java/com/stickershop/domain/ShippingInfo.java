package com.stickershop.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "shipping_info")
@Getter
@Setter
public class ShippingInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Shopping shopping;

    @Column
    private String userName;

    @Column
    private int zipCode;

    @Column
    private String addr;

    @Column
    private String phone;

    @Column
    private int shippingFee;

    @Column
    private String memo;
}
