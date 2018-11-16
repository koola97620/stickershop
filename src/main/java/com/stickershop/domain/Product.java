package com.stickershop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
@Setter
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length=50, nullable = false)
    private String name;

    @Column(nullable = false)
    private int price;

    @Column(nullable=false)
    private int totalQty;

    @Column(nullable=false)
    private int curQty;

    @Column(nullable = false)
    private int mileage;

    @OneToMany(mappedBy = "product")
    private List<CartProduct> cartProductList;

    @ManyToMany
    @JoinTable(name = "product_category",
            joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id") ,
            inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "id") )
    private List<Category> categoryList;

    @OneToMany(mappedBy = "product")
    private List<Image> imageList;

    @OneToMany(mappedBy = "product")
    private List<OrderInfoProduct> orderInfoProductList;


}
