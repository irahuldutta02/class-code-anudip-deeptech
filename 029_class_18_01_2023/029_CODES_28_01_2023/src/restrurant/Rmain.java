package restrurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, Restraurant> map = new HashMap<Integer, Restraurant>();
		
		map.put(1, new Restraurant("Chicken Biryani", 130));
		map.put(2, new Restraurant("Paneer Butter Mashala", 120));
		map.put(3, new Restraurant("Chicken", 80));
		map.put(4, new Restraurant("Drams of heaven", 150));
		map.put(5, new Restraurant("Dosa", 70));
		
		System.out.println("Welcome to 007 Restrurant");
		System.out.println("=========================");
		System.out.println("Menu");
		System.out.println("----");
		System.out.println("Item Price");
		System.out.println("----------");
		
		for(Map.Entry em: map.entrySet()) {
			Restraurant rest = (Restraurant) em.getValue();
			System.out.print(em.getKey()+")");
			rest.display();
			
		}
		System.out.println();
		int id;
		do {
			System.out.print("Enter food ID : ");
			id = sc.nextInt();
			Restraurant rest = map.get(id);
			Billing.order(rest.getfName(), rest.getPrice());
			
			Billing.cont();
			
		}while(true);
		
		
		
	}

}
