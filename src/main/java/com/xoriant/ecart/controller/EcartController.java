package com.xoriant.ecart.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.ecart.model.Brand;
import com.xoriant.ecart.model.Category;
import com.xoriant.ecart.model.Product;
import com.xoriant.ecart.service.EcartService;
import com.xoriant.ecart.util.GlobalResources;

@RestController
@RequestMapping("/api/ecart")
public class EcartController {

	private Logger logger=GlobalResources.getLogger(EcartController.class);
	@Autowired
	EcartService ecartService;
	
	
	@PostMapping("/add/newproduct")
	public String addNewProduct(@RequestBody Product product) {
		String methodName="addNewProduct()";
		logger.info(methodName+"called()");
		return ecartService.addNewProduct(product);
		
	}
	
	
	@PostMapping("/add/product")
	public String addNewProduct1(@RequestBody Product product) {
		String methodName="addNewProduct1()";
		logger.info(methodName+"called()");
		return ecartService.addNewProduct1(product);
		
	}
	
	@PostMapping("/add/list/product")
	public List<Product> addNewListOfProducts(@RequestBody List<Product> product){
		String methodName="addNewListOfProducts()";
		logger.info(methodName+"Called()");
		return ecartService.addNewListOfProducts(product);
}
	
	@PutMapping("/update")
	public String updateProduct(@RequestBody Product product) {
		String methodName="updateProduct()";
		logger.info(methodName+"called()");
		
		return ecartService.updateProduct(product);
}
	@GetMapping("/listofproducts")
	public List<Product> getAllProduct(){
		String methodName="getAllProduct()";
		logger.info(methodName+"called()");
		
		return ecartService.getAllProduct();
}
	@DeleteMapping("/delete/{productId}")
	public String deleteProduct(@PathVariable Long productId){
		String methodName="deleteProduct()";
		logger.info(methodName+"called()");
		return ecartService.deleteProduct(productId);
}
	
	
	@GetMapping("/filter/products/{minPrice}/{maxPrice}")
	public List<Product> filterByPriceRange(@PathVariable double minPrice,@PathVariable double maxPrice){
		String methodName="filterByPriceRange()";
		logger.info(methodName+"called()");
		return ecartService.filterByPriceRange(minPrice, maxPrice);
	}
	
	@GetMapping("/filter/products/{categoryName}")
	public List<Product> filterByCategoryName(@PathVariable String categoryName){
		String methodName="filterByCategoryName()";
		logger.info(methodName+"called()");
		return ecartService.filterByCategoryName(categoryName);
	}
	
	@GetMapping("/filter/products/bybrand/{brandName}")
	public List<Product> filterByBrandName(@PathVariable String brandName){
		String methodName="filterByBrandName()";
		logger.info(methodName+"called()");
		return ecartService.filterByBrandName(brandName);
	}
	
	@GetMapping("/filter/products")
	public List<Product> getAllSamsungProduct(){
		String methodName="getAllSamsungProduct()";
		logger.info(methodName+"called()");
		return ecartService.getAllSamsungProduct();
	}
	
	@GetMapping("/filter/byproductid/{productId}")
	public Product getProductById(@PathVariable Long productId) {
		String methodName="getProductById()";
		logger.info(methodName+"called()");
		return ecartService.getProductById(productId);

	}
	
	@PostMapping("/add/brand")
	public String addNewBrand(@RequestBody Brand brand) {
		String methodName="addNewBrand()";
		logger.info(methodName+"called()");
		return ecartService.addNewBrand(brand);
}
	@PostMapping("/add/new/listofbrands")
	public List<Brand> addNewListOfBrands(@RequestBody List<Brand> brand){
		String methodName=" addNewListOfBrands()";
		logger.info(methodName+"called()");
		return ecartService.addNewListOfBrands(brand);
	}
	
	@PutMapping("/update/brand")
	public String updateBrand(@RequestBody Brand brand) {
		String methodName=" updateBrand()";
		logger.info(methodName+"called()");
		return ecartService.updateBrand(brand);
	}
	
	@GetMapping("/brands")
	public List<Brand> getAllBrand() {
		String methodName=" getAllBrand()";
		logger.info(methodName+"called()");
		return ecartService.getAllBrand();
}
	@DeleteMapping("/delete/{brandId}")
	public String deleteBrand(@PathVariable Long brandId) {
		String methodName="  deleteBrand()";
		logger.info(methodName+"called()");
		return ecartService.deleteBrand(brandId);
}
	
	@GetMapping("/filter/brand/{brandId}")
	public Brand getBrandById(@PathVariable Long brandId) {
		String methodName="getBrandById()";
		logger.info(methodName+"called()");
		return ecartService.getBrandById(brandId);
	}
	
	@PostMapping("/addnewcategory")
	public String addNewCategory(@RequestBody Category category) {
		String methodName="addNewCategory()";
		logger.info(methodName+"called()");
		return ecartService.addNewCategory(category);
	}
	@PostMapping("/addnew/listofcategory")
	public List<Category> addNewListOfCategory(@RequestBody List<Category> list) {
	    String methodName="addNewListOfCategory()";
	    logger.info(methodName+"called()");
	    return ecartService.addNewListOfCategory(list);
	}
	
	@PutMapping("/update/category")
	public String updateCategory(@RequestBody Category category) {
		String methodName="updateCategory()";
		logger.info(methodName+"called()");
	    return ecartService.updateCategory(category);
	}
	
	@GetMapping("/fetchall/categories")
	public List<Category> getAllCategories() {
		String methodName="getAllCategories()";
		logger.info(methodName+"called()");
		 return ecartService.getAllCategories();
	}
	
	@DeleteMapping("/delete/category/{categoryId}")
	public String deleteCategory(@PathVariable Long categoryId) {
		String methodName="deleteCategory()";
		logger.info(methodName+"called()");
		return ecartService.deleteCategory(categoryId);
}
	
	@GetMapping("/filter/category/{categoryId}")
	public Category getCategoryById(@PathVariable Long categoryId) {
		String methodName=" getCategoryById()";
		logger.info(methodName+"called()");
		return ecartService.getCategoryById(categoryId);
	}
	
}