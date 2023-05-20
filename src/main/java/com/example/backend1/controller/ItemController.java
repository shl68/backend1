package com.example.backend1.controller;


import com.example.backend1.entity.Item;
import com.example.backend1.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemRepository itemRepository;
    @GetMapping("/api/items")
    public List<Item> getItems(){
        List<Item> items = itemRepository.findAll();


        return items;
    }
}
