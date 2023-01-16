/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.helman.consumoRest.service;

import com.helman.consumoRest.dto.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author helma
 */
@Service
@RequiredArgsConstructor
public class ProductService {
     private final RestTemplate restTemplate;
    public List<ProductResponse> getAllProduct(){
        List<ProductResponse> lista1 = new ArrayList();
        ProductDTO [] response = restTemplate.getForObject("https://api.escuelajs.co/api/v1/products", ProductDTO[].class);
        List<ProductDTO> lista = Arrays.asList(response);
        for(ProductDTO elemento :lista) {
            ProductResponse elem = new ProductResponse();
            elem.setPid(elemento.getId());
            elem.setName(elemento.getTitle());
            elem.setPriceFinal(elemento.getPrice());
            elem.setDescription(elemento.getDescription());
            lista1.add(elem);
    }
        return lista1;
    }
    public int newProduct(ProductNewDTO product){
        ProductResponseNew response =restTemplate.postForObject("https://api.escuelajs.co/api/v1/products", product, ProductResponseNew.class);
        return response.getId();

    }
}
