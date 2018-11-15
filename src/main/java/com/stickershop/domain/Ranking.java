package com.stickershop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "ranking")
@Getter
@Setter
public class Ranking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30,nullable = false)
    private String name;

    @Column
    private int saleMoney;

    @Column
    private double saleRatio;

    @OneToOne(fetch = FetchType.LAZY)
    private Member member;
}
