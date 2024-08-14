package com.example.busproject3.entity;

import jakarta.persistence.*;


public class Ticket {


    @Id
    @Column(name = "ticket_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column
    private Long depDate;

    @Column
    private Long arrDate;

    @Column
    private










}
