package com.xoriant.ecart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.xoriant.ecart.model.Brand;

@Repository
public interface BrandDao extends JpaRepository<Brand,Long>{

	@Query(value="select * from brands where brand_id=?",nativeQuery=true)
	Brand getBrandById(Long brandId);

}
