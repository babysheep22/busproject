package com.example.busproject3.controller;

import com.example.busproject3.dto.ItemFormDto;
import com.example.busproject3.service.ItemService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class ItemContorller {

    private final ItemService itemService;


    @GetMapping(value = "/admin/item/new")
    public String itemForm(Model model) {
        model.addAttribute("itemFromDto", new ItemFormDto());
        return "item/itemForm";
    }
}
