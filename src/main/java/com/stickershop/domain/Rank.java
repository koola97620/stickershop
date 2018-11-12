package com.stickershop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "rank")
@Getter
@Setter
public class Rank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30,nullable = false)
    private String name;

    @Column
    private int saleMoney;

    @Column
    private double saleRatio;

    @OneToOne
    private Member member;
}