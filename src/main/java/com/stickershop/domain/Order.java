package com.stickershop.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id" , referencedColumnName = "id")
    private Member member;


    @OneToMany(mappedBy = "order")
    private List<OrderProduct> orderProductList;


    @Column
    private Integer totalPrice;

    @Column
    private Date orderDate;

    @OneToOne(mappedBy = "order")
    @JoinColumn(name="order_status_id")
    private OrderStatus orderStatus;

    @OneToOne(mappedBy = "order")
    @JoinColumn(name="shipping_info_id")
    private ShippingInfo shippingInfo;





}
