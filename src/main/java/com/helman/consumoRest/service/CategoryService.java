/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.helman.consumoRest.service;

import com.helman.consumoRest.dto.CategoryDTO;
import com.helman.consumoRest.dto.CategoryResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author helma
 */
@Service
@RequiredArgsConstructor
public class CategoryService {
    
    private final RestTemplate restTemplate;
    public List<CategoryResponse> getAllCategories(){
        List<CategoryResponse> lista1 = new ArrayList();
        CategoryDTO [] response = restTemplate.getForObject("https://api.escuelajs.co/api/v1/categories", CategoryDTO[].class);
        List<CategoryDTO> lista = Arrays.asList(response);
        for(CategoryDTO elemento :lista) {
            CategoryResponse elem = new CategoryResponse();
            elem.setCid(elemento.getId());
            elem.setTitle(elemento.getName());
            lista1.add(elem);
    }
        
        return lista1;
    }
}
