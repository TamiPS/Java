package ejercicios;
import java.util.Scanner;
public class ej3 {

	Scanner entrada = new Scanner (System.in);
	int [] m=new int [10];

	public static void main(String[] args) {

		ej3 p1 = new ej3();
		p1.cambiaElemento();
		p1.calculaSuma();

	}

	public void cambiaElemento () {

		for (int i=0;i<m.length;i++) {
			System.out.println("Introduce elemento para la posición ["+i+"]");
			int val=entrada.nextInt();
			m[i]=val;
		}
	}

	public void calculaSuma () {

		int suma=0;
		for (int i=0;i<m.length;i++) {
			suma=suma+m[i];
		}
		
		System.out.println("\nLa suma de los elementos es: "+suma);
	}
}