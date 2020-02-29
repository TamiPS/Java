package ejercicios;
import java.util.Scanner;
public class Ej24 {

	Scanner entrada = new Scanner (System.in);
	char [] l = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	int [] m = new int [l.length];

	public static void main(String[] args) {

		Ej24 p1 = new Ej24();
		p1.contar(p1.frase());
	}

	public String frase() {
		String frase;
		System.out.println("Introduce una frase");
		frase=entrada.nextLine();
		return frase;
	}

	public void contar(String frase) {

		for (int A=0;A<frase.length();A++) {
			for(int i=0; i<l.length; i++) {
				if(l[i]==frase.charAt(A)) {
					m[i]++;
				}
			}
		}
		
		for (int i=0;i<m.length;i++) {
			if(m[i]>0) {
				System.out.println(l[i] + ":" + m[i]);
			}
		}
	}
}