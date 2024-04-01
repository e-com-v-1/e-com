package com.ecom.item.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemDTO {
    private String itemCode;
    private String itemName;
    private Long quantityOnHand;
    private BigDecimal price;
}
