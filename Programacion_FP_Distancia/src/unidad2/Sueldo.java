package unidad2;

import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
		
			
		Scanner sc = new Scanner(System.in);
		
		int base, venta1, venta2, venta3, comision, total;
		
		 System.out.println("Sueldo base: ");
		 
		 base = sc.nextInt();
		 
		 System.out.println("Valor de la primera venta: ");
		 
		 venta1 = sc.nextInt();
		 
		 System.out.println("Valor de la segunda venta: ");
		 
		 venta2 = sc.nextInt();
		 
		 System.out.println("Valor de la tercera venta: ");
		 
		 venta3 = sc.nextInt();
		 
		 comision = (int) ((venta1*0.1) + (venta2*0.1) + (venta3*0.1));
		 
		 total = base + comision;
		 
		 System.out.println("Las comisiones cobradas por las tres ventas del mes son " + comision + " €. Con lo que el sueldo total supone un monto de " + total + " €");

		
	}

}
