package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement; 

import lombok.Data;
@Data
@XmlRootElement
@Entity
public class Product {
	@Id
	private Integer productId;
	private String productName;
	private Integer productPrice;
}
