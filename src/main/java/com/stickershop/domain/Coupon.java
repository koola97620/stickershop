package com.stickershop.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "coupon")
@Getter
@Setter
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(length = 100 , nullable = false)
    private String name;

    @Lob
    private String description;

    @Column
    private int totalQty;

    @Column
    private int curQty;

    @Column()
    private int saleMoney;

    @Column
    private double saleRatio;

    @Column
    private Date expireDate;

    private Integer durationPeriod;

    @ManyToOne
    @JoinColumn(name = "expiretype_id" , referencedColumnName = "id")
    private ExpireType expireType;

}
