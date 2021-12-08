package com.xoriant.ecart.service;

import java.util.List;

import com.xoriant.ecart.model.Brand;
import com.xoriant.ecart.model.Category;
import com.xoriant.ecart.model.Product;

public interface EcartService {

	// Operations on Product
	public String addNewProduct1(Product product);
	
	String addNewProduct(Product product);

	List<Product> addNewListOfProducts(List<Product> product);

	String updateProduct(Product product);

	List<Product> getAllProduct();

	String deleteProduct(Long productId);

	List<Product> filterByPriceRange(double minPrice, double maxPrice);

	List<Product> filterByCategoryName(String categoryName);

	List<Product> filterByBrandName(String brandName);

	List<Product> getAllSamsungProduct();

	Product getProductById(Long productId);

	//Operations on Brand
	
	String addNewBrand(Brand brand);

	List<Brand> addNewListOfBrands(List<Brand> brand);
	
	String updateBrand(Brand brand);
	
	List<Brand> getAllBrand();
	
	public String deleteBrand(Long brandId);
	
	Brand getBrandById(Long brandId);
	
	//Opreations on Category
	
	String addNewCategory(Category category);
	
	List<Category> addNewListOfCategory(List<Category> list);
	
	String updateCategory(Category category);
	
	List<Category> getAllCategories();
	
	String deleteCategory(Long categoryId);
	
	Category getCategoryById(Long categoryId);
	
	

}