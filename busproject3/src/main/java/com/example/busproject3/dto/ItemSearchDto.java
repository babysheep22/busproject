package com.example.busproject3.dto;

import com.example.busproject3.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class
ItemSearchDto {

    private String searchDateType;

    private ItemSellStatus searchSellStatus;

    private String searchBy;

    private String searchQuery= "";

    private String category1;
    private String category2;


}
