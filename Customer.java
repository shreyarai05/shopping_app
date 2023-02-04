
package shopping;

public class Customer {
 String name;
 String email;
 String phone;
 Cart ct;
 public Customer(String name, String email , String phone ) {
	
	 this.name =name;
	 this.email=email;
	 this.phone=phone;
	 
	 this.ct = new Cart();
 }
 
 @SuppressWarnings("static-access")
public void adding(int prodID) {
	 ct.additem(prodID);
	// Inventory.removeProd(prodID);
}
}




