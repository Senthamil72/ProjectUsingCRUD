package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Prodect;

public interface ProductRepo extends JpaRepository<Prodect, Integer>{

}
