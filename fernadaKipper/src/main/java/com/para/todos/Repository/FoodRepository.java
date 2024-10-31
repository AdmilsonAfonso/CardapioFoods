package com.para.todos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.para.todos.Model.Food;

public interface FoodRepository extends JpaRepository<Food,Long>{

}
