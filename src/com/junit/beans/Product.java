package com.junit.beans;

public class Product {
	private int id;
	private String title;
	private double price;
	private float rating;
	public Product(int id, String title, double price, float rating) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.rating = rating;
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", price=" + price + ", rating=" + rating + "]";
	}
}

	