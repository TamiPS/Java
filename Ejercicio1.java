package EjerciciosTema2;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner (System.in);
		int num;
		System.out.println("Introducir un valor entero");
		num=entrada.nextInt();

		for (int i=num;i>=0;i--) {
			System.out.println(i);
		}
		System.out.println("FIN");
		entrada.close();
	}

}
