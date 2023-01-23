package restrurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Billing {
	static ArrayList<Bill> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	static void order(String fname, int amt) {
		System.out.print("Enter the Quantity : ");
		int qty = sc.nextInt();
		list.add(new Bill(fname, qty, qty * amt));
	}

	static void cont() {
		System.out.print("Enter 1 to continue : ");
		int c = sc.nextInt();

		if (c != 1) {
			// total bill and come out
			totalBill();
			System.exit(0);
		}
	}

	static void totalBill() {
		//coupon code
		int c1 = 1234;
		System.out.println("=================================================");
		System.out.println("Your Bill");
		System.out.println("=================================================");
		double total = 0.0;
		for (Bill i : list) {
			System.out.println(i.fname + " - (Quantity : " + i.qty + " ) - (Amount : " + i.amt + " )");
			total = total + i.amt;
		}
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println("Amaount      : Rs." + total);
		System.out.println("-------------------------------------------------");
		System.out.print("Do you have a coupon?\nEnter 1) for yes then enter the code : ");
		int c = sc.nextInt();
		if(c==1) {
			System.out.print("Coupon code : ");
			int coupon = sc.nextInt();
			if(coupon==c1) {
				double temp = total;
				total -= 20;
				double gst = total * 0.05;
				System.out.println("=================================================");
				System.out.println("Total                   : Rs." + temp);
				System.out.println("Discount(-)             : Rs." + 20.0);
				System.out.println("GST on discounted total : Rs." + gst);
				System.out.println("-------------------------------------------------");
				System.out.println("Total Amount : RS." + (total+gst));
				System.out.println("Thanks For visiting us.");
				System.out.println("=================================================");
			}else {
				System.out.println("=================================================");
				System.out.println("Invalid Coupon.Sorry!");
				double gst = total * 0.05;
				System.out.println("GST          : Rs." + gst);
				System.out.println("Total        : Rs." + total);
				System.out.println("-------------------------------------------------");
				System.out.println("Total Amount : RS." + (total+gst));
				System.out.println("Thanks For visiting us.");
				System.out.println("=================================================");
			}
		}else {
			double gst = total * 0.05;
			System.out.println("=================================================");
			System.out.println("GST          : Rs." + gst);
			System.out.println("Total        : Rs." + total);
			System.out.println("-------------------------------------------------");
			System.out.println("Total Amount : RS." + (total+gst));
			System.out.println("Thanks For visiting us.");
			System.out.println("=================================================");
		}
	}

}
