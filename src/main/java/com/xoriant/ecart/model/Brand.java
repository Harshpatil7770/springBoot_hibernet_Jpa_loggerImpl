package com.xoriant.ecart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="brands")
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="brand_id")
	private Long brandId;
	
	@Column(name="brand_name")
	private String brandName;

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brand(Long brandId, String brandName) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + "]";
	}

	
	
}

