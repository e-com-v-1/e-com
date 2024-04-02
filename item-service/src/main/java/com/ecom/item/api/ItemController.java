package com.ecom.item.api;

import com.ecom.item.dto.ItemDTO;
import com.ecom.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/{itemCode}")
    public ResponseEntity<ItemDTO> getItem(@PathVariable String itemCode) {
        ItemDTO data = itemService.getItem(itemCode);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ItemDTO>> getAllItems() {
        List<ItemDTO> data = itemService.getAllItems();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> saveItem(@RequestBody ItemDTO itemDTO) {
        String data = itemService.saveItem(itemDTO);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @PutMapping("/{itemCode}")
    public ResponseEntity<ItemDTO> updateItem(@PathVariable String itemCode, @RequestBody ItemDTO itemDTO) {
        ItemDTO data = itemService.updateItem(itemCode, itemDTO);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @DeleteMapping("/{itemCode}")
    public ResponseEntity<String> deleteItem(@PathVariable String itemCode) {
        String data = itemService.deleteItem(itemCode);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
