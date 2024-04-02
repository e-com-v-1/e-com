package com.ecom.item.mapper;

import com.ecom.item.dto.ItemDTO;
import com.ecom.item.model.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {

    public ItemDTO modelToDto(Item item) {
        ItemDTO dto = new ItemDTO();
        dto.setItemCode(item.getItemCode());
        dto.setItemName(item.getItemName());
        dto.setQuantityOnHand(item.getQuantityOnHand());
        dto.setPrice(item.getPrice());
        return dto;
    }

    public Item dtoToModel(ItemDTO itemDTO) {
        Item model = new Item();
        model.setItemCode(itemDTO.getItemCode());
        model.setItemName(itemDTO.getItemName());
        model.setQuantityOnHand(itemDTO.getQuantityOnHand());
        model.setPrice(itemDTO.getPrice());
        return model;
    }
}
