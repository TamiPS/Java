package ejercicios;
import java.util.Scanner;
public class ej5 {
	
	Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		ej5 p1 = new ej5 ();
	
		p1.visualizar(p1.cargar());
		
		}
	
		public String cargar () {
		
		System.out.println("Introduce una cadena");
		String cad=entrada.nextLine();
		
		return cad;
		
		}

		public void visualizar (String cad) {
			
		for (int i=0;i<cad.length();i++) {
			System.out.println((int)cad.charAt(i));
		}
	}
}
