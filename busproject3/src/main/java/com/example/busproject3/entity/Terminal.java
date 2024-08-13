package com.example.busproject3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Terminal {

    @Id
    @Column(name = "terminal_id")
    private Long Id;

    @Id
    @Column(name = "terminal_name")
    private String terminalNm;

    @Id
    @Column(name = "city_name")
    private String cityName;
}
