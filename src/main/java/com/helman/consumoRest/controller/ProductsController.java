/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.helman.consumoRest.controller;


import com.helman.consumoRest.dto.ProductNewDTO;
import com.helman.consumoRest.dto.ProductResponse;
import com.helman.consumoRest.dto.ProductResponseNew;
import com.helman.consumoRest.service.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author helma
 */
@RestController
@RequestMapping("/nexsys/v1/products")
@RequiredArgsConstructor
public class ProductsController {
     private final ProductService productService;
    @GetMapping
    public ResponseEntity<List<ProductResponse>> getAll(){
        return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public int newProduct (@RequestBody ProductNewDTO product){
       return productService.newProduct(product);
    }
}
