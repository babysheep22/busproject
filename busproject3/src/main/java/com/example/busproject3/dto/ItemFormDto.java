package com.example.busproject3.dto;

import com.example.busproject3.constant.ItemSellStatus;
import com.example.busproject3.entity.Item;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class ItemFormDto {

    private Long id;

    @NotNull(message = "상품명은 필수 입력값입니다.")
    private String itenNm;

    @NotNull(message = "출발지는 필수 입력값입니다.")
    private String depterminal;

    @NotBlank(message = "도착지는 필수 입력값입니다.")
    private String arrterminal;

    @NotBlank(message = "목적지는 필수 입력값입니다.")
    private String areaNm;

    @NotNull(message = "재고는 필수 입력 값입니다.")
    private Integer stockNumber;

    private List<ItemImgDto> itemImgDtoList = new ArrayList<>();

    private List<Long> itemImgIds = new ArrayList<>();



    private ItemSellStatus itemSellStatus;
    private static ModelMapper modelMapper = new ModelMapper();


    public Item createItem(){
        return modelMapper.map(this, Item.class);
    }

    public static ItemFormDto of(Item item){
        return modelMapper.map(item, ItemFormDto.class);
    }

}