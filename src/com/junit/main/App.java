package com.junit.main;

import java.util.ArrayList;
import java.util.List;

import com.junit.beans.Product;
import com.main.service.ProductService;

public class App {
	public static void main(String[] args) {
		Product p1= new Product(1,"HP",45000,4.2f);
		Product p2= new Product(2,"Lenovo",45000,4.2f);
		Product p3= new Product(3,"Dell",45000,4.2f);
		Product p4= new Product(4,"Apple",45000,4.2f);
		List<Product>list= new ArrayList<>();
		list.add(p1);list.add(p2);list.add(p3);list.add(p4);
		
		ProductService service= new ProductService();
		
		int res=service.computeSum(2,4);
		System.out.println("Result"+ res);
	}

}
