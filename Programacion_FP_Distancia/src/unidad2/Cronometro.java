package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

public class Cronometro {

	public static void main(String[] args) throws IOException {

		BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Dime tu nombre: ");
		
		long inicios = System.currentTimeMillis();
		
		String nombre = name.readLine();
		
        long fins = System.currentTimeMillis();
        
        double tiempo = (fins - inicios);	
        
        DecimalFormat fm = new DecimalFormat("#,000");
          
        System.out.println ("Hola " + nombre + " has tardado " + fm.format (tiempo) + " segundos en decirme tu nombre");	
	}

}
