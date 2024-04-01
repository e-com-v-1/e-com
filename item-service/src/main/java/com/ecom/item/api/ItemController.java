package com.ecom.item.api;

import com.ecom.item.dto.ItemDTO;
import com.ecom.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/{itemCode}")
    public ItemDTO getItem(@PathVariable String itemCode) {
        return itemService.getItem(itemCode);
    }

    @GetMapping
    public List<ItemDTO> getAllItems() {
        return itemService.getAllItems();
    }

    @PostMapping("/")
    public String saveItem(@RequestBody ItemDTO itemDTO) {
        return itemService.saveItem(itemDTO);
    }

    @PutMapping("/{itemCode}")
    public ItemDTO updateItem(@PathVariable String itemCode, @RequestBody ItemDTO itemDTO) {
        return itemService.updateItem(itemCode, itemDTO);
    }

    @DeleteMapping("/{itemCode}")
    public String deleteItem(@PathVariable String itemCode) {
        return itemService.deleteItem(itemCode);
    }
}
