package com.para.todos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.para.todos.Model.Food;
import com.para.todos.Repository.FoodRepository;

public class FoodService implements FoodServiceInt {

    @Autowired
    private FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }


    @Override
    public List<Food> buscarFood() {        
        return foodRepository.findAll();
    }


    
    
}
