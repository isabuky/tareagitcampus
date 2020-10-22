package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Conversor {

	public static void main(String[] args) throws IOException { 
		
		final double ValorDolar = 1.19;
		
		double dolares;
		
		BufferedReader euros = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Introduzca en nº de Euros que desea convertir: ");
		
		String n = euros.readLine();
		
		double RealN = Double.parseDouble(n); //Esto convertirá Java String a java double
		
		dolares = RealN*ValorDolar;
		
		DecimalFormat DosDecimales = new DecimalFormat("#.##"); //Instrucción para redondear decimales
					
		System.out.println(RealN + " € son " + DosDecimales.format (dolares) + " $.");
		
		
	}

}
