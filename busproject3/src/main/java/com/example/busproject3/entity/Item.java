package com.example.busproject3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.w3c.dom.Text;

import java.time.LocalDateTime;

public class Item {
    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String itemNm;


    //출도착 터미널 이름
    @Column(name = "dep_Terminal")
    private String depterminal;

    @Column(name = "arr_Terminal")
    private String arrterminal;

    //목적지 이름
    @Column(name = "tg_area")
    private String areaNm;

    //출발일,시간
    @Column(name = "dep_time")
    private LocalDateTime depTime;

    //도착일,시간
    @Column
    private LocalDateTime arrTime;
    //성인 요금
    @Column(nullable = false)
    private Integer adultprice;
    //중고생
    @Column(nullable = false)
    private Integer studentprice;

    //아동
    @Column(nullable = false)
    private Integer childprice;

    //상품 소개문
    @Column(nullable = false)
    private Text itemDetail;
}
