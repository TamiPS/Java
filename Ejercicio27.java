package EjerciciosTema2;
import java.util.Scanner;
public class Ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		String hora;
		int h, m , s, minutos, segundos, horasSuma, minutosSuma, segundosSuma;
		System.out.println("Introduce hora HH:MM:SS");
		hora=entrada.nextLine();

		h=Integer.parseInt(hora.substring(0, 2));
		m=Integer.parseInt(hora.substring(3, 5));
		s=Integer.parseInt(hora.substring(6, 8));

		System.out.println("Introducir minutos a añadir al tiempo");
		minutos=entrada.nextInt();

		System.out.println("Introducir segundos a añadir al tiempo");
		segundos=entrada.nextInt();


		minutos = minutos + (segundos/60);
		segundosSuma = segundos%60;
		horasSuma = (minutos/60);
		minutosSuma = (minutos%60);


		h = h + horasSuma;
		m = m + minutosSuma;
		s = s + segundosSuma;

		m = m + (s/60);
		s = s%60;
		h = h + (m/60);
		m = m%60;

		while(h>23) {
			h = h - 24;
		}
		System.out.println(h+":"+m+":"+s);
		entrada.close();
	}
}