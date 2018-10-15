package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	Product(int id, String name, float price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class Lambda_Comparator {
	
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(1,"Tomato",21.26f));
		list.add(new Product(2,"Brinjal",32.42f));
		list.add(new Product(3,"Potato",25.61f));
		list.add(new Product(4,"Paneer",51.37f));
		
		//sorting on the basis of name
		System.out.println("Sorting on the basis of name"+"\n");
		
		Collections.sort(list,(p1,p2)->
		{
			return p1.name.compareTo(p2.name);
		});
		
		list.forEach((n)->
			System.out.println(n.id+" "+ n.name+" "+n.price)
				);
		
		//sorting on the basis of id
System.out.println("Sorting on the basis of id"+"\n");
		
		Collections.sort(list,(p1,p2)->
		{
			if(p1.price>p2.price)
				return 1;
			else if(p1.price<p2.price)
				return -1;
			else
				return 0;
		});
		
		list.forEach((Product)->
			System.out.println(Product.id+" "+ Product.name+" "+Product.price)
				);
	}
}
