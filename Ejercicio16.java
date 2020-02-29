package EjerciciosTema2;
import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		String texto;
		int espacio = 0, letra=0, numero=0,caracteresExtraños=0;

		System.out.println("Introduce un texto");
		texto=entrada.nextLine();

		for (int i=0;i<=texto.length()-1;i++){
			
			if (Character.isWhitespace(texto.charAt(i))) {
				espacio++;
			}
			else if (Character.isDigit(texto.charAt(i))) {
				numero++;
			}
			else if (Character.isAlphabetic(texto.codePointAt(i))) {
				letra++;
			}

			else {
				caracteresExtraños++;
			}
		}
		System.out.println("El texto contiene:\n "+espacio+" espacios\n "+numero+" números\n "+letra+" letras \n "+caracteresExtraños+" caracteres extraños");
		entrada.close();
	}

}
