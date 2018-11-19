package com.stickershop.repository;

import com.stickershop.domain.Category;
import com.stickershop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Long> {

//    @Query(value="select c from Category c join fetch pro.categoryList where pro.id= :id ")
//    public List<Category> getCategory(@Param("id")String id);

}
