package com.junit.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.junit.beans.Product;
import com.main.service.CustomerService;
import com.main.service.ProductService;

public class CostomerServiceTest {
	private static CustomerService customerService;
	private static ProductService productService;
	private Product p1;
	private Product p2;
	private Product p3;
	private Product p4;
	private List<Product> list;
	
	@BeforeClass
	public static void init() {
		customerService =mock(CustomerService.class);
		productService=mock(ProductService.class);
	}
	@Before
	public void methodInit() {
//		mock the list
		list= mock(ArrayList.class);
		p1= new Product(1,"HP",45000,4.2f);
		p2= new Product(2,"Lenovo",55000,5.2f);
		p3= new Product(3,"Dell",65000,6.2f);
		p4= new Product(4,"Apple",75000,7.2f);
		list.add(p1);list.add(p2);list.add(p3);list.add(p4);
	}
	@Test
	public void sumTest() {
		Mockito.when(customerService.sum(3, 4)).thenReturn(7);
		assertEquals(7,customerService.sum(3, 4));
	}
	@Test
	public void divideTest() {
		Mockito.when(customerService.divide(4, 2)).thenReturn(2);
//		Mockito.when(customerService.divide(0, 2)).thenThrow(ArithmeticException.class);
		assertEquals(2, customerService.divide(4, 2));
//		assertEquals(ArithmeticException.class, customerService.divide(0, 2));
	}
	@Test
	public void filterListByPriceTest() {
		List<Product> list1 = new ArrayList<>();
		list1.add(p4);
		Mockito.when(productService.filterListByPrice(list1, 50000)).thenReturn(list1);
		assertEquals(1,productService.filterListByPrice(list1, 50000).size());
	}

}
