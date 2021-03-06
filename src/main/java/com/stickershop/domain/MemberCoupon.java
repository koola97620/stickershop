package com.stickershop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "member_coupon")
@Getter
@Setter
public class MemberCoupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="member_id", referencedColumnName = "id")
    private Member member;

    @ManyToOne
    @JoinColumn(name="coupon_id", referencedColumnName = "id")
    private Coupon coupon;

    @ManyToOne
    @JoinColumn(name="order_info_id" , referencedColumnName = "id")
    private OrderInfo orderInfo;

    private Date regDate;

    private Date expireDate;

    private int useCheck;

}
