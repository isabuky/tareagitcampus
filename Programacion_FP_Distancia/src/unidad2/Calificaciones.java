package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Calificaciones {

	public static void main(String[] args) throws IOException {
						
			//MATEMÁTICAS
		
			BufferedReader t1m = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Nota de la Tarea 1 de matemáticas: ");
			
			String t1ma = t1m.readLine();
			
			float t1mat = Float.parseFloat(t1ma);
			
			BufferedReader t2m = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Nota de la Tarea 2 de matemáticas: ");
			
			String t2ma = t2m.readLine();
			
			float t2mat = Float.parseFloat(t2ma);
			
			BufferedReader t3m = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Nota de la Tarea 3 de matemáticas: ");
			
			String t3ma = t3m.readLine();
			
			float t3mat = Float.parseFloat(t3ma);
		
			float tmat = (t1mat + t2mat + t3mat) / 3;
			
			BufferedReader exm = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Nota del exámen matemáticas: ");
			
			String exma = exm.readLine();
			
			float exmat = Float.parseFloat(exma);
			
			double matemáticas = (exmat * 0.9 + tmat * 0.1);
			
			DecimalFormat fm = new DecimalFormat("#.00");
			
			System.out.println("La calificación de la asignatura de matemáticas es " + fm.format(matemáticas)); 
				
			//FÍSICA		
			
				BufferedReader t1f = new BufferedReader(new InputStreamReader(System.in));
					
				System.out.print("Nota de la Tarea 1 de física: ");
					
				String t1fa = t1f.readLine();
					
				float t1fat = Float.parseFloat(t1fa);
					
				BufferedReader t2f = new BufferedReader(new InputStreamReader(System.in));
					
				System.out.print("Nota de la Tarea 2 de física: ");
					
				String t2fa = t2f.readLine();
					
				float t2fat = Float.parseFloat(t2fa);
					
				BufferedReader t3f = new BufferedReader(new InputStreamReader(System.in));
										
				float tfis = (t1fat + t2fat) / 2;
					
				BufferedReader exf = new BufferedReader(new InputStreamReader(System.in));
					
				System.out.print("Nota del exámen física: ");
					
				String exfa = exf.readLine();
					
				float exfat = Float.parseFloat(exfa);
					
				double física = (exfat * 0.8 + tfis * 0.2);
					
				DecimalFormat ff = new DecimalFormat("#.00");
						
				System.out.println("La calificación de la asignatura de física es " + ff.format(física));
					
				//QUÍMICA			
				
				BufferedReader t1q = new BufferedReader(new InputStreamReader(System.in));
					
				System.out.print("Nota de la Tarea 1 de química: ");
				
				String t1qa = t1q.readLine();
					
				float t1qat = Float.parseFloat(t1qa);
					
				BufferedReader t2q = new BufferedReader(new InputStreamReader(System.in));
					
				System.out.print("Nota de la Tarea 2 de química: ");
					
				String t2qa = t2q.readLine();
					
				float t2qat = Float.parseFloat(t2qa);
					
				BufferedReader t3q = new BufferedReader(new InputStreamReader(System.in));
					
				System.out.print("Nota de la Tarea 3 de química: ");
					
				String t3qa = t3q.readLine();
					
				float t3qat = Float.parseFloat(t3qa);
				
				float tqui = (t1qat + t2qat + t3qat) / 3;
					
				BufferedReader exq = new BufferedReader(new InputStreamReader(System.in));
					
				System.out.print("Nota del exámen física: ");
					
				String exqa = exq.readLine();
					
				float exqat = Float.parseFloat(exqa);
					
				double química = (exqat * 0.85 + tqui * 0.15);
					
				DecimalFormat fq = new DecimalFormat("#.00");
						
				System.out.println("La calificación de la asignatura de química es " + fq.format(química));
				
				//NOTA MEDIA
				
				DecimalFormat fmed = new DecimalFormat("#.00");
								
				System.out.println("La nota media del curso es de " + fmed.format((matemáticas + física + química) / 3));
				
	}

}
