package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product{
	
	String name;
	int price;

	
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}



	
	
}

class sortPriceWise implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.price-o2.price;
	}
}

public class ComparatorPractice {
	
	public static void main(String[] args) {
		Product s = new Product("hello",50);
		Product s1 = new Product("hello1",80);
		Product s2 = new Product("hello2",70);
		
		List<Product> list = new ArrayList<>();
		list.add(s);
		list.add(s1);
		list.add(s2);
		
		Collections.sort(list , new sortPriceWise());
		System.out.println(list);
	}

}
