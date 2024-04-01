package com.ecom.item.service;

import com.ecom.item.dto.ItemDTO;

import java.util.List;

public interface ItemService {
    ItemDTO getItem(String itemCode);
    List<ItemDTO> getAllItems();
    String saveItem(ItemDTO itemDTO);
    ItemDTO updateItem(String itemCode, ItemDTO itemDTO);
    String deleteItem(String itemCode);
}
