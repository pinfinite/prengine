package com.pinfinite.prengine.model;



import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.pinfinite.prengine.model.constansts.Category;
import com.pinfinite.prengine.model.constansts.Colour;
import com.pinfinite.prengine.model.constansts.Type;

@Document
public class Product {
	
	@Id
	private String id;
	
	private String pid;
	private String sku;
	
	@Indexed
	private String title;
	@Indexed
	private Category category;
	@Indexed
	private Type type;
	@Indexed
	private Colour colour;
	
	private Double price;
	private Double discount;
	private Double qty;
	
	private String discription;
	private String imageUrl;
	private String productUrl;
	
	public Product() {
		this.id = UUID.randomUUID().toString();
	}

	
	public String getRandomID(){
		return this.id;
	}
	



	public String getPid() {
		return pid;
	}


	public String getSku() {
		return sku;
	}


	public String getTitle() {
		return title;
	}


	public Category getCategory() {
		return category;
	}


	public Type getType() {
		return type;
	}


	public Colour getColour() {
		return colour;
	}


	public Double getPrice() {
		return price;
	}


	public Double getDiscount() {
		return discount;
	}


	public Double getQty() {
		return qty;
	}


	public String getDiscription() {
		return discription;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public String getProductUrl() {
		return productUrl;
	}


	


	public void setPid(String pid) {
		this.pid = pid;
	}


	public void setSku(String sku) {
		this.sku = sku;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public void setColour(Colour colour) {
		this.colour = colour;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public void setDiscount(Double discount) {
		this.discount = discount;
	}


	public void setQty(Double qty) {
		this.qty = qty;
	}


	public void setDiscription(String discription) {
		this.discription = discription;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", pid=" + pid + ", sku=" + sku + ", title=" + title + ", category=" + category
				+ ", type=" + type + ", colour=" + colour + ", price=" + price + ", discount=" + discount + ", qty="
				+ qty + ", discription=" + discription + ", imageUrl=" + imageUrl + ", productUrl=" + productUrl + "]";
	}
	
}
