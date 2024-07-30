package com.example.busproject3.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.busproject3.service.*;

@RestController
public class BusController {

    @Autowired
    private ODsayService oDsayService;

    @GetMapping("/api/terminals")
    public String getTerminals() {
        return oDsayService.getExpressBusTerminals();
    }
}