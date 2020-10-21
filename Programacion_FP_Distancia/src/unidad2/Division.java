package unidad2;

import java.text.DecimalFormat;

public class Division {

	public static void main(String[] args) {
		
		double a=1234;
		
		double b=532;
		
		double c=a/b;
		
			DecimalFormat DosDecimales = new DecimalFormat("#.##"); //Instrucción para redondear decimales
		
		System.out.println(DosDecimales.format (c));

	}

}
