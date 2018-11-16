package com.stickershop.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order_info")
@Getter
@Setter
public class OrderInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id" , referencedColumnName = "id")
    private Member member;


    @OneToMany(mappedBy = "orderInfo")
    private List<OrderInfoProduct> orderInfoProductList;


    @Column
    private Integer totalPrice;

    @Column
    private Date orderDate;

    @OneToOne
    @JoinColumn(name="order_status_id")
    private OrderStatus orderStatus;

    @OneToOne
    @JoinColumn(name="shipping_info_id")
    private ShippingInfo shippingInfo;


    @OneToMany(mappedBy = "orderInfo")
    private List<MemberCoupon> memberCouponList;




}
