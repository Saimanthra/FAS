package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="crop")

public class Crop {
	
	@Id
	@GeneratedValue
	@Column(name="CropID",nullable=false)
	private int CropId;
	@Column(name="CropType" ,nullable=false)
	private String CropType;
	@Column(name="quantity",nullable=false)
	private int quantity;
	
	public int getCropId() {
		return CropId;
	}
	public void setCropId(int cropId) {
		CropId = cropId;
	}
	public String getCropType() {
		return CropType;
	}
	public void setCropType(String cropType) {
		CropType = cropType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
