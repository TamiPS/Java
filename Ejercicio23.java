package EjerciciosTema2;
import java.util.Scanner;
public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		final float PRECIO = 30, PRECIO_ADICIONAL = 60;
		float minutos, coste = 0, coste_adicional = 0;
		System.out.println("Introducir duración de llamada en minutos");
		minutos=entrada.nextFloat();
		
		if (minutos <= 2) {
			coste=minutos * PRECIO;
		}
		if (minutos > 2) {
			coste_adicional=((minutos-2)*PRECIO_ADICIONAL)+(PRECIO*2);
		}
		System.out.println("El coste de la llamada es: "+(coste+coste_adicional)/100+" €");
		entrada.close();
	}
}
