/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.helman.consumoRest.dto;

import lombok.Data;

/**
 *
 * @author helma
 */
@Data
public class ProductDTO {
    private Integer id;
    private String title;
    private Integer price;
    private String description;

}
