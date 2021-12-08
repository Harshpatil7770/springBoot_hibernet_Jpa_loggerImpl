package com.xoriant.ecart.service;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xoriant.ecart.dao.BrandDao;
import com.xoriant.ecart.dao.CategoryDao;
import com.xoriant.ecart.dao.ProductDao;
import com.xoriant.ecart.dao.ProductDao1;
import com.xoriant.ecart.model.Brand;
import com.xoriant.ecart.model.Category;
import com.xoriant.ecart.model.Product;
import com.xoriant.ecart.util.GlobalResources;

@Service
public class EcartServiceImpl implements EcartService {

	private Logger logger=GlobalResources.getLogger(EcartServiceImpl.class); 
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	ProductDao1 productDao1;
	
	@Autowired
	BrandDao brandDao;
	
	@Autowired
	CategoryDao categoryDao;
	
	@Transactional
	public String addNewProduct1(Product product) {
		String methodName="addNewProduct()";
		logger.info(methodName+"called()");
		productDao1.addNewProduct1(product);
		return "========== New Product Added Succesfully1 ===========";
	}
	
	@Override
	public String addNewProduct(Product product) {
		String methodName="addNewProduct()";
		logger.info(methodName+"called()");
		productDao.save(product);
		return "========== New Product Added Succesfully ===========";
	}
	
	@Override
	public List<Product> addNewListOfProducts(List<Product> product){
		String methodName="addNewListOfProducts()";
		logger.info(methodName+"Called()");
		return productDao.saveAll(product);
	}
	
	@Override
	public String updateProduct(Product product) {
		String methodName="updateProduct()";
		logger.info(methodName+"called()");
		
		Product existingProduct=productDao.findById(product.getProductId()).orElse(product);
		existingProduct.setProductId(product.getProductId());
		existingProduct.setProductName(product.getProductName());
		existingProduct.setProductPrice(product.getProductPrice());
		productDao.save(existingProduct);
		return "========== Update Product Succesfully ===========";
	}
	
	
	@Override
	public List<Product> getAllProduct(){
		String methodName="getAllProduct()";
		logger.info(methodName+"called()");
		
		return productDao.findAll();
	}
	
	
	@Override
	public String deleteProduct(Long productId){
		String methodName="deleteProduct()";
		logger.info(methodName+"called()");
		productDao.deleteById(productId);
		return "========== Deleted Product Succesfully ========";
	}
	
	
	//Not an error but not responding
	@Override
	public List<Product> filterByPriceRange(double minPrice,double maxPrice){
		String methodName="filterByPriceRange()";
		logger.info(methodName+"called()");
		return productDao.filterByPriceRange(minPrice,maxPrice);
	}
	
	@Override
	public List<Product> filterByCategoryName(String categoryName){
		String methodName="filterByCategoryName()";
		logger.info(methodName+"called()");
		return productDao.filterByCategoryName(categoryName);
	}
	
	@Override
	public List<Product> filterByBrandName(String brandName){
		String methodName="filterByBrandName()";
		logger.info(methodName+"called()");
		return productDao.filterByBrandName(brandName);
	}

	@Override
	public List<Product> getAllSamsungProduct(){
		String methodName="getAllSamsungProduct()";
		logger.info(methodName+"called()");
		return productDao.getAllSamsungProduct();
	}
	
	@Override
	public Product getProductById(Long productId) {
		String methodName="getProductById()";
		logger.info(methodName+"called()");
		return productDao.getProductById(productId);
	}
	
	@Override
	public String addNewBrand(Brand brand) {
		String methodName="addNewBrand()";
		logger.info(methodName+"called()");
		brandDao.save(brand);
		return "============ New Brand Added Succesfullly =========";
	}
	
	@Override
	public List<Brand> addNewListOfBrands(List<Brand> brand){
		String methodName=" addNewListOfBrands()";
		logger.info(methodName+"called()");
	return 	brandDao.saveAll(brand);
		
	}

	@Override
	public String updateBrand(Brand brand) {
		String methodName=" updateBrand()";
		logger.info(methodName+"called()");
		Brand existingBrand=brandDao.findById(brand.getBrandId()).orElse(brand);
		existingBrand.setBrandId(brand.getBrandId());
		existingBrand.setBrandName(brand.getBrandName());
		brandDao.save(existingBrand);
		return "=========== Updated Brand Succesfully=========";
	}

	@Override
	public List<Brand> getAllBrand() {
		String methodName=" getAllBrand()";
		logger.info(methodName+"called()");
		return brandDao.findAll();
	}

	@Override
	public String deleteBrand(Long brandId) {
		String methodName="  deleteBrand()";
		logger.info(methodName+"called()");
		brandDao.deleteById(brandId);
		return "======== Deteleted Brand Succesfully ========";
	}

	@Override
	public Brand getBrandById(Long brandId) {
		String methodName="getBrandById()";
		logger.info(methodName+"called()");
		return brandDao.getBrandById(brandId);
	}

	@Override
	public String addNewCategory(Category category) {
		String methodName="addNewCategory()";
		logger.info(methodName+"called()");
		categoryDao.save(category);
		return "======= Add new Category ==========";
	}

	@Override
	public List<Category> addNewListOfCategory(List<Category> list) {
	    String methodName="addNewListOfCategory()";
	    logger.info(methodName+"called()");
	    return  categoryDao.saveAll(list);
	}

	@Override
	public String updateCategory(Category category) {
		String methodName="updateCategory()";
		logger.info(methodName+"called()");
		Category existingProduct=categoryDao.findById(category.getCategoryId()).orElse(category);
		existingProduct.setCategoryId(category.getCategoryId());
		existingProduct.setCategoryName(category.getCategoryName());
		categoryDao.save(existingProduct);
		return "======== Update Category Succesfully ========";
	}

	@Override
	public List<Category> getAllCategories() {
		String methodName="getAllCategories()";
		logger.info(methodName+"called()");
		return categoryDao.findAll();
	}

	@Override
	public String deleteCategory(Long categoryId) {
		String methodName="deleteCategory()";
		logger.info(methodName+"called()");
		categoryDao.deleteById(categoryId);
		return "======== Delete Category Succesfully ========";
	}

	@Override
	public Category getCategoryById(Long categoryId) {
		String methodName=" getCategoryById()";
		logger.info(methodName+"called()");
		return categoryDao.getCategoryById(categoryId);
	}

	
	
	
}
