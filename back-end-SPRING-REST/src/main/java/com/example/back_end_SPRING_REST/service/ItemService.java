package com.example.back_end_SPRING_REST.service;

import com.example.back_end_SPRING_REST.model.Item;

import java.util.List;

public interface ItemService {
    Item createItem(Item item);
    Item getItemById(Long id);
    List<Item> getAllItems();
    Item updateItem(Long id, Item item);
    void deleteItem(Long id);
}