package com.ecom.item.service.Impl;

import com.ecom.item.dto.ItemDTO;
import com.ecom.item.mapper.ItemMapper;
import com.ecom.item.model.Item;
import com.ecom.item.repository.ItemRepository;
import com.ecom.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    @Override
    public ItemDTO getItem(String itemCode) {
        Optional<Item> item = itemRepository.findById(itemCode);
        return item.map(itemMapper::modelToDto).orElse(new ItemDTO());
    }

    @Override
    public List<ItemDTO> getAllItems() {
        List<Item> items = itemRepository.findAll();
        List<ItemDTO> itemDTOS = new ArrayList<>();
        items.forEach(item -> itemDTOS.add(itemMapper.modelToDto(item)));
        return itemDTOS;
    }

    @Override
    public String saveItem(ItemDTO itemDTO) {
        Item item = itemRepository.save(itemMapper.dtoToModel(itemDTO));
        return item.getItemCode();
    }

    @Override
    public ItemDTO updateItem(String itemCode, ItemDTO itemDTO) {
        if (itemRepository.existsById(itemCode)) {
            Item item = itemMapper.dtoToModel(itemDTO);
            item.setItemCode(itemCode);
            Item model = itemRepository.save(item);
            return itemMapper.modelToDto(model);
        } else {
            return null;
        }
    }

    @Override
    public String deleteItem(String itemCode) {
        itemRepository.deleteById(itemCode);
        return itemCode;
    }
}
