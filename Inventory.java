package shopping;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	 public static List<Product> prodlist= new ArrayList<Product>() ;
	

	public void show() {
		System.out.println("Inventory: \n");
		for(int i = 0 ; i<prodlist.size(); i++)
		{
			System.out.println(prodlist.get(i).name+"- "+prodlist.get(i).qty);
		}
	}
	public static void removeProd(int pID) {
		for(int i = 0 ;i< prodlist.size();i++)
		{
			if(prodlist.get(i).pdId==pID)
				prodlist.get(i).qty--;
		}
	}
	
	
}


