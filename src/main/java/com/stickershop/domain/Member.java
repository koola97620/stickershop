package com.stickershop.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "member")
@Getter
@Setter
public class Member {
    @Id
    private String id;

    @Column(length = 30, nullable = false)
    private String userName;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 20, nullable = false)
    private String password;

    @Column(length = 30, nullable = false)
    private String nickname;


    @OneToMany(mappedBy = "member")
    private List<MemberCoupon> memberCouponList;


    @OneToOne(mappedBy = "member")
    @JoinColumn(name="cart_id", referencedColumnName = "id")
    private Cart cart;


    @OneToOne
    @JoinColumn(name="wishlist_id", referencedColumnName = "id")
    private Wishlist wishlist;


    @OneToOne(mappedBy = "member")
    @JoinColumn(name="rank_id")
    private Rank rank;

    @ManyToMany
    @JoinTable(name="member_role",
            joinColumns = @JoinColumn(name="member_id", referencedColumnName = "id") ,
            inverseJoinColumns = @JoinColumn(name="role_id" , referencedColumnName = "id"))
    private Set<Role> roleSet;



    @OneToMany(mappedBy = "member")
    private List<Order> orderList;



    private String addr;
    private int zipCode;
    private String phone;
    private int miliage;
    private Date regDate;
    private Date modDate;


}
