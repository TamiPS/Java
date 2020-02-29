package EjerciciosTema2;
import java.util.Scanner;
public class Ejercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int anio;
		System.out.println("Introduce el año");
		anio=entrada.nextInt();

		if (anio%400==0 || anio%4==0) {
			if (anio % 100 != 0) {
				System.out.println("Es bisiesto");
			}
		}
		else 		
			System.out.println("No es bisiesto");
		entrada.close();
	}

}
