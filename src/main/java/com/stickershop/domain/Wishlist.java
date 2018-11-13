package com.stickershop.domain;


import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "wishlist")
@Getter
@Setter
public class Wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Member member;

    @ManyToMany
    @JoinTable(name = "wishlist_product",
            joinColumns = @JoinColumn(name = "wishlist_id", referencedColumnName = "id") ,
            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id") )
    private List<Product> productList;


}
