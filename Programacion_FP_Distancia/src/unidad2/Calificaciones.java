package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Calificaciones {

	public static void main(String[] args) throws IOException {
						
			BufferedReader t1m = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Nota de la Tarea 1 de matem�ticas: ");
			
			String t1ma = t1m.readLine();
			
			float t1mat = Float.parseFloat(t1ma);
			
			BufferedReader t2m = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Nota de la Tarea 2 de matem�ticas: ");
			
			String t2ma = t2m.readLine();
			
			float t2mat = Float.parseFloat(t2ma);
			
			BufferedReader t3m = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Nota de la Tarea 3 de matem�ticas: ");
			
			String t3ma = t3m.readLine();
			
			float t3mat = Float.parseFloat(t3ma);
		
			float tmat = (t1mat + t2mat + t3mat) / 3;
			
			BufferedReader exm = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Nota del ex�men matem�ticas: ");
			
			String exma = exm.readLine();
			
			float exmat = Float.parseFloat(exma);
			
			double matem�ticas = (exmat * 0.9 + tmat * 0.1);
			
			DecimalFormat fm = new DecimalFormat("#.00");
			
			System.out.println("La calificaci�n de la asignatura de matem�ticas es " + fm.format(matem�ticas)); 
		
			
		
		
			
			
			
			
			
			//float tfis = (t1fis, t2fis, t3fis / 3);
			
			//float f�sica = ((exfis * 0.9) + (tfis * 0.1)); //nota f�sica
					
			//float tqui = (t1qui, t2qui, t3qui / 3);
			
			//float qu�mica = ((exqui * 0.9) + (tqui * 0.1)); //nota qu�mica
			
		
		
		

	}

}
