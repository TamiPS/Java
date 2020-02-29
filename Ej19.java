package ejercicios;
import java.util.Scanner;
public class Ej19 {

	Scanner entrada = new Scanner (System.in);

	public static void main(String[] args){

		Ej19 p1 = new Ej19 ();

		p1.minu(p1.soli());
	}

	public String soli () {

		System.out.println("Introducir una frase");
		String frase=entrada.nextLine();
		return frase;
	}

	public void minu (String frase) {

		System.out.println(frase.toUpperCase());
	}
}