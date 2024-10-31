package com.para.todos.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.para.todos.Model.Food;
import com.para.todos.Repository.FoodRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    public FoodController(FoodRepository repository) {
        this.repository = repository;
    }

    
    @PostMapping("/save")
    public void saveFood(@RequestBody FoodRequestDTO data) {
        
        Food foodData = new Food(data.getTitle(),data.getImage(),data.getPrice());
        repository.save(foodData);
    }
    
   
    @GetMapping("/foods")
    public List<Food> getAll(){
        List <Food> foodList = repository.findAll();
        return foodList;    
    }
}
