package com.main.service;

import java.util.List;
import java.util.stream.Collectors;

import com.junit.beans.Product;

public class ProductService {
	public int computeSum(int i, int j) {
		return i+j;
	}
	
	public int computeSquare(int num) {
		return num*num;	
	}
	
//	filter the list based on price> 50000
	public List<Product> filterListByPrice(List<Product> list,double price){
		return list.stream()
				.filter(p-> p.getPrice()> price)
				.collect(Collectors.toList());
	}
//	filter the list based on price & rating
	public List<Product> filterListByPriceAndRating(List<Product> list,double price,float rating){
		return list.stream()
				.filter(p->p.getPrice()>price)
				.filter(p->p.getRating()> rating)
				.collect(Collectors.toList());
	}
}
	