

package shopping;

public class Product {
	
	String name;
	String brand;
	int qty;
	double price;
    static int ID=1;
	int pdId = ID;
	
	public Product(String name , String brand , int qty , double price) {
		
		this.name = name;
		this.brand = brand;
		this.qty = qty;
		this.price = price;
		
		ID++;
	}
}



