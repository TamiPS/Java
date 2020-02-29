package EjerciciosTema2;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio24 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		char calificacion;
		do {
			System.out.println("Introducir calificación (I,F,B,N,S), pulse \"n\" para salir");
			calificacion=(char)System.in.read();
			System.in.read();
			System.in.read();

			switch(calificacion) {
			case 'I':
				calificacion='4';
				break;
			case 'F':
				calificacion='5';
				break;
			case 'B':
				calificacion='6';
				break;
			case 'N':
				calificacion='7';
				break;
			case 'S':
				calificacion='9';
				break;
			default:
				System.out.println("Debe ser I,F,B,N o S");
				calificacion='0';
			}
			if (calificacion != '0') {
				System.out.println("La calificación es: "+calificacion);
			}
		}while (calificacion != 'n');
		entrada.close();
	}
}

		