package com.stickershop.repository;

import com.stickershop.domain.Member;
import com.stickershop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    public List<Product> findAll();

    @Query(value="select count(pro) from Product pro")
    public int countProduct();

    @Query(value="select pro from Product pro join fetch pro.categoryList where pro.id= :id ")
    public List<Product> getCategory(@Param("id")String id);




}
