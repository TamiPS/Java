package EjerciciosTema2;
import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		String frase;
		char caracter;
		int acumula=0;
		System.out.println("Introduce una frase con may�sculas y min�sculas");
		frase=entrada.nextLine();

		for (int i=0;i<frase.length();i++) {
			caracter = (char)frase.charAt(i);
			if (caracter=='a'||caracter=='e'||caracter=='i'||caracter=='o'||caracter=='u'||caracter=='A'||caracter=='E'||caracter=='I'||caracter=='O'||caracter=='U')
			{
				acumula++;
			}
		}
		System.out.println("N�mero vocales: " + acumula);
		entrada.close();
	}
}



