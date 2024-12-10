package com.pluralsight.NorthwindTradersSpringBoot.interfaces;

import com.pluralsight.NorthwindTradersSpringBoot.models.Product;

import java.util.List;

public interface ProductDao {
    void add(Product product);
    List<Product> getAll();
}