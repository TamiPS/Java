package ejercicios;
import java.util.Scanner;
public class e1 {
	Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		e1 p1 = new e1();
		p1.tama(p1.solicita());

	}
	public String solicita() {
		System.out.println("Introduce una frase");
		String frase=entrada.nextLine();
		return frase;
	}

	public void tama (String frase) {

		System.out.println(frase.length());

	}
}
