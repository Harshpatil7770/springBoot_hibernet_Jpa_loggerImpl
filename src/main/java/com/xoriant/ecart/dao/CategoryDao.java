package com.xoriant.ecart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.xoriant.ecart.model.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category,Long> {

	@Query(value="select * from categories where category_id=?",nativeQuery=true)
	Category getCategoryById(Long categoryId);

}
