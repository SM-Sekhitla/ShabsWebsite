package dev.hecto.shabskitchen.dto;

import lombok.Data;

@Data
public class MenuItemDto {
    private Integer id;
    private String name;
    private String description;
    private Double price;
}
