package EjerciciosTema2;
import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n10 = 0, n21 = 1;
		System.out.print(n10 + " ");
		System.out.print(n21 + " ");

		for(int i = 0; i<38; i++){
			n21 = n10 + n21;
			n10 = n21 - n10;
			System.out.print(n21 + " ");
		}
		entrada.close();
	}
}