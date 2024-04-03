package com.myshopping.My.Shopping.repository;

import com.myshopping.My.Shopping.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
    @Query(value = "select* from product where category=:category and name=:name",nativeQuery=true)
    public List<Product> getProductByCategoryAndName(String category,String name);

    @Query(value = "select * from product where category=:category", nativeQuery = true)
    public List<Product> getProductsByCategory(String category);

    @Query(value = "select * from product where name=:productName", nativeQuery = true)
    public List<Product> getProductByName(String productName);
}
