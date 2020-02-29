package EjerciciosTema2;
import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		String frase;
		char caracter;
		int acumula=0;
		System.out.println("Introduce una frase con mayúsculas y minúsculas");
		frase=entrada.nextLine();

		for (int i=0;i<frase.length();i++) {
			caracter = (char)frase.charAt(i);
			if (caracter=='a'||caracter=='e'||caracter=='i'||caracter=='o'||caracter=='u'||caracter=='A'||caracter=='E'||caracter=='I'||caracter=='O'||caracter=='U')
			{
				acumula++;
			}
		}
		System.out.println("Número vocales: " + acumula);
		entrada.close();
	}
}



