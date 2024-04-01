package com.ecom.item.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "item")
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    @Id
    @Column(name = "item_code")
    private String itemCode;
    @Column(name = "item_name")
    private String itemName;
    @Column(name = "quantity_on_hand")
    private Long quantityOnHand;
    @Column(name = "price")
    private BigDecimal price;
}
