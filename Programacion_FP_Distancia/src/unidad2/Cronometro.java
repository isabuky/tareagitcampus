package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Cronometro {

	public static void main(String[] args) throws IOException {

		BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Dime tu nombre: ");
		
		long inicio = System.currentTimeMillis();
		
		String nombre = name.readLine();
		
        long fin = System.currentTimeMillis();
         
        double  tiempo = (fin - inicio)/1000;
        
                        
        System.out.printf (tiempo + " segundos");	
	}

}
