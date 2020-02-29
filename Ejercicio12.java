package EjerciciosTema2;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in); 
		char menor = 'z', letra;

		for (int i=10;i>0;i--) {
			System.out.println("Introducir una letra");	
			
			letra=(char)System.in.read();
			System.in.read();
			System.in.read();

			if(letra<menor) {
				menor=letra;
			}
		}
		System.out.println("La letra menor es: "+menor);	
		entrada.close();
	}
}