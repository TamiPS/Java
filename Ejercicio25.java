package EjerciciosTema2;
import java.util.Scanner;
public class Ejercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		String frase;
		char c1, c2;
		int j=0;
		boolean palindroma = false;

		System.out.println("Introduce una frase");
		frase=entrada.nextLine();

		for (int i=frase.length()-1;i>0;i--) {
			c1=frase.charAt(i);
			c2=frase.charAt(j);
			if(c1==c2) { 
				palindroma = true;
			}
			else {
				palindroma = false;
				break;
			}
			j++;
		}
		if(palindroma) {
			System.out.println("Es palíndroma");
		}
		entrada.close();
	}
}
