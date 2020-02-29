package EjerciciosTema2;
import java.util.Scanner;
public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int veces,lista, suma = 0;

		System.out.println("Introduce listas a introducir");
		veces=entrada.nextInt();

		for (int i=1;i<=veces;i++){
			System.out.println("Introduce una lista de números");
			lista=entrada.nextInt();

			suma=suma+lista;
		}
		System.out.println("La media de los números introducidos es: "+(suma/veces));
		entrada.close();
	}
}


