package unidad2;

import java.util.Scanner;

public class RGBtoYIQ {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double r, g, b, y, i, q;
		
		 System.out.println("Introduce R: ");
		 
		 r = sc.nextDouble();	
		 
		 System.out.println("Introduce G: ");
		 
		 g = sc.nextDouble();	
		 
		 System.out.println("Introduce B: ");
		 
		 b = sc.nextDouble();	
		
		y = 0.299 * r + 0.587 * g + 0.114 * b;
		
		i = 0.596 * r - 0.275 * g - 0.321 * b;
		
		q = 0.212 * r - 0.528 * g + 0.311 * b;
		
		System.out.println("Y= " + String.format("%.3f", y));
				
		System.out.println("I= " + String.format("%.3f", i));
		
		System.out.println("Q= " + String.format("%.3f", q));
		
		
				

}
	}
