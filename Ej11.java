package ejercicios;
import java.util.Scanner;
public class Ej11 {

	Scanner entrada = new Scanner (System.in);

	public static void main(String[] args) {

		Ej11 p1 = new Ej11 ();

		p1.visualiza(p1.cuenta(p1.solicita()));

	}

	public String solicita () {

		String frase;
		System.out.println("Introduce una frase");
		return frase=entrada.nextLine();

	}

	public int cuenta (String frase) {
		int vocales = 0;
		for (int i=0;i<frase.length();i++) {
			if (frase.charAt(i)=='a' || frase.charAt(i)=='e' || frase.charAt(i)=='i' ||frase.charAt(i)=='o' ||frase.charAt(i)=='u') {
				vocales ++;
			}
		}
		return vocales;
	}

	public void visualiza (int vocales) {

		System.out.println("El número de vocales es: "+vocales);

	}
}
