package com.helman.consumoRest.dto;


import lombok.Data;

@Data
public class ProductResponseNew {
    private  Integer id;
    private String title;
    private Integer price;
    private String description;
    private CategoryDTO category;
    private String[] images;
}
