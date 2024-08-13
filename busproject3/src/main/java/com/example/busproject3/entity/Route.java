package com.example.busproject3.entity;

import jakarta.persistence.*;

public class Route {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false, length = 50)
    private String routeNm;

    @Column(nullable = false)
    private Integer price;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "terminal_id")
    private Terminal terminal;

    @Column String arrStationId;

}
