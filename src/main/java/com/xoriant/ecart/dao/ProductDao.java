package com.xoriant.ecart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.xoriant.ecart.model.Product;
@Repository
public interface ProductDao extends JpaRepository<Product,Long>{

	@Query(value="select * from products p inner join brands b on p.brand_brand_id=b.brand_id inner join categories c on p.category_category_id=c.category_id where product_price>=? and product_price<=?",nativeQuery=true)
	List<Product> filterByPriceRange(double minPrice, double maxPrice);

	@Query(value="select * from products p inner join brands b on p.brand_brand_id=b.brand_id inner join categories c on p.category_category_id=c.category_id where category_name=?",nativeQuery=true)
	List<Product> filterByCategoryName(String categoryName);

	@Query(value="select * from products p inner join brands b on p.brand_brand_id=b.brand_id inner join categories c on p.category_category_id=c.category_id where brand_name=?",nativeQuery=true)
	List<Product> filterByBrandName(String brandName);

	@Query(value="select * from products p inner join brands b on p.brand_brand_id=b.brand_id inner join categories c on p.category_category_id=c.category_id where brand_name='Samsung'",nativeQuery=true)
	List<Product> getAllSamsungProduct();

	@Query(value="select * from products p inner join brands b on p.brand_brand_id=b.brand_id inner join categories c on p.category_category_id=c.category_id where product_id=?",nativeQuery=true)
	Product getProductById(Long productId);
	
	

}
