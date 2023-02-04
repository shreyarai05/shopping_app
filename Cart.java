



package shopping;

import java.util.HashMap;

import java.util.Map;

public class Cart {
	int id;
	static Map <String , Integer> pdList = new HashMap <>(); 
	static double cartTotal;
	
	
	public static void additem(int pdtId) {
		if(pdList.containsKey(Inventory.prodlist.get(pdtId-1).name))
		{
			pdList.put(Inventory.prodlist.get(pdtId-1).name, pdList.get(Inventory.prodlist.get(pdtId-1).name) + 1);
			cartTotal+=Inventory.prodlist.get(pdtId-1).price;
		}
			
        else
        	{
        		pdList.put(Inventory.prodlist.get(pdtId-1).name, 1);
        		cartTotal+=Inventory.prodlist.get(pdtId-1).price;
        	}
	}
	public  void display() {
		System.out.println("Your Cart: \n");
		 for (Map.Entry<String,Integer> entry : pdList.entrySet()) 
		        System.out.println(entry.getKey() +
		                         " - " + entry.getValue());
		
	}
	
}


