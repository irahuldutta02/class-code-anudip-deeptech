package abstruction_demo;

import java.util.Scanner;

public class Circle {
	final double pi = 3.14;
	
	public double calculateArea(double pi, int radius) {
		double area = pi*radius*radius;
		return area;
	}
	
	public double circum(double pi, int radius) {
		double cir = 2*pi*radius;
		return cir;
	}

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.print("Radius : ");
		int redius  = sc.nextInt();
		System.out.println("Area of the circle is : "+(c1.calculateArea(c1.pi, redius)));
		System.out.println("Area of the circle is : "+(c1.circum(c1.pi, redius)));
		
		
		sc.close();

	}

}
