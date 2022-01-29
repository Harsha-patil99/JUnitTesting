package com.junit.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.junit.beans.Product;
import com.main.service.ProductService;

public class ProductServiceTest {
	static ProductService service;
	private Product p1;
	private Product p2;
	private Product p3;
	private Product p4;
	private List<Product>list;
	
	@BeforeClass
	public static void testInit() {
		service= new ProductService();
	}
	@Before
	public void methodInit() {
		p1= new Product(1,"HP",45000,4.2f);
		p2= new Product(2,"Lenovo",55000,5.2f);
		p3= new Product(3,"Dell",65000,6.2f);
		p4= new Product(4,"Apple",75000,7.2f);
		list= new ArrayList<>();
		list.add(p1);list.add(p2);list.add(p3);list.add(p4);
		
	}
	@Test
	public void computeSumTest() {
		assertEquals(11,service.computeSum(5, 6));
		assertEquals(6,service.computeSum(0, 6));
		assertEquals(2,service.computeSum(-4, 6));
	}
		@Test
		public void computeSquareTest() {
			assertEquals(9,service.computeSquare(3));
			assertEquals(4,service.computeSquare(-2));
			assertEquals(81,service.computeSquare(9));
			assertEquals(0,service.computeSquare(0));
			assertNotSame(15,service.computeSquare(4));
	}
		@Test
		public void filterListByPriceTest() {
			assertEquals(3,service.filterListByPrice(list, 50000).size());
			assertEquals(4,service.filterListByPrice(list, 40000).size());
			assertEquals(1,service.filterListByPrice(list, 70000).size());
			assertEquals(2,service.filterListByPrice(list, 60000).size());
		}
		@Test
		public void filterListByPriceAndRatingTest() {
			assertEquals(3,service.filterListByPriceAndRating(list, 50000, 4.0f).size());
			assertEquals(2,service.filterListByPriceAndRating(list, 50000, 5.4f).size());
			assertEquals(4,service.filterListByPriceAndRating(list, 40000, 4.0f).size());
			assertEquals(1,service.filterListByPriceAndRating(list, 70000, 4.0f).size());	
		}
	@AfterClass
	public static void testComplete() {
		System.out.println("Test-class-complete");
	}
	@After
	public void methodAfter() {
		System.out.println("method-complete");
	}

}
