package com.ecom.item.service.Impl;

import com.ecom.item.dto.ItemDTO;
import com.ecom.item.repository.ItemRepository;
import com.ecom.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public ItemDTO getItem(String itemCode) {
        return null;
    }

    @Override
    public List<ItemDTO> getAllItems() {
        return null;
    }

    @Override
    public String saveItem(ItemDTO itemDTO) {
        return null;
    }

    @Override
    public ItemDTO updateItem(String itemCode, ItemDTO itemDTO) {
        return null;
    }

    @Override
    public String deleteItem(String itemCode) {
        return null;
    }
}
