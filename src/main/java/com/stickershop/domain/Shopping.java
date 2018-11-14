package com.stickershop.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "shopping")
@Getter
@Setter
public class Shopping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id" , referencedColumnName = "id")
    private Member member;


    @OneToMany(mappedBy = "shopping")
    private List<ShoppingProduct> shoppingProductList;


    @Column
    private Integer totalPrice;

    @Column
    private Date orderDate;

    @OneToOne(mappedBy = "shopping")
    @JoinColumn(name="order_status_id")
    private ShoppingStatus shoppingStatus;

    @OneToOne(mappedBy = "shopping")
    @JoinColumn(name="shipping_info_id")
    private ShippingInfo shippingInfo;





}
