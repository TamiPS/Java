package EjerciciosTema2;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio22 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		char caracter;
		do {
			
			System.out.println("Introducir un caracter");
			caracter=(char)System.in.read();
			System.in.read();
			System.in.read();
			
			switch(caracter) {
				case '	':
					System.out.println("tabulador");
					break;
				case ' ':
					System.out.println("espacio");
					break;
			}
			
		}while (caracter != 'q' || caracter != 'Q');
		entrada.close();
	}
}
