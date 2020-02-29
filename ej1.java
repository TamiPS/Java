package SegundaEvaluacion;
import java.util.Scanner;
public class ej1 {

	Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ej1 p1 = new ej1();
		p1.tama("Introduce una frase");
	}

	/*}
	public String solicita() {
		System.out.println("Introduce una frase");
		String frase=entrada.nextLine();
		return frase;
	}*/

	public void tama (String frase) {

		System.out.println(frase.length());

	}
}
