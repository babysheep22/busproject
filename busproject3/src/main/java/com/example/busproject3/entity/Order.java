package com.example.busproject3.entity;

import com.example.busproject3.constant.OrderStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    private LocalDateTime orderDate;

    public void addOrderItem(OrderItem orderItem){
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

}
