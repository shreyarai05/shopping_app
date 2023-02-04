package shopping;

    
    


import java.util.Scanner;

public class Testclass {

	public static void main(String[] args) {
		
		
	
		
		
		Product p1 = new Product("Mobile" , "Redmi" , 400 , 9880);
		Product p2 = new Product("Laptop","Dell", 120,23000);
		Product p3 = new Product("Bag", "puma", 60, 700);
		Product p4 = new Product("Tshirt", "USPA", 250,890);
		Product p5 = new Product("Shoe", "Redchief",50 , 1000);
		
		Scanner scn = new Scanner(System.in);
		
		 Inventory inventory = new Inventory();
		
		Inventory.prodlist.add(p1);
		Inventory.prodlist.add(p2);
		Inventory.prodlist.add(p3);
		Inventory.prodlist.add(p4);
		Inventory.prodlist.add(p5);
		
		for (int i = 0; i < Inventory.prodlist.size(); i++) {
			System.out.println(Inventory.prodlist.get(i).name); 
		}
		inventory.show();
		 
		
		
	
		
		boolean val= true;
		
		while(val)
		{
			
			System.out.println("Select the product you want to buy from given list:choose no(1-5)  ");
			
			for(int i = 0 ; i<Inventory.prodlist.size();i++)
			{
				System.out.println(Inventory.prodlist.get(i).pdId+". "+Inventory.prodlist.get(i).name);
			}
			
			int option = scn.nextInt();
			Customer c1 = new Customer("Rahul", "rk09@gmail.com","98988");
			
			c1.adding(option);
		
			
			System.out.println("Do you want to continue ? Enter y for shopping more :");
			String str= scn.next().toLowerCase();
			if(!str.equals("y"))
			{
				c1.ct.display();
				System.out.println("Your Cart total is - "+Cart.cartTotal);
				val=false;
			}
			
		}
		inventory.show();
		
	}

}

