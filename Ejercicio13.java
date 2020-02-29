package EjerciciosTema2;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner (System.in);
		String frase;
		char caracter;
		System.out.println("Introduce una frase en mayúsculas");
		frase=entrada.nextLine();
		
		for (int i=0;i<frase.length();i++) {
			caracter = (char)frase.charAt(i);
			if (Character.isUpperCase(caracter)) {
				caracter = (char) (caracter + 'a' - 'A');
                System.out.print(caracter);
			}else {
				System.out.print(caracter);
			}
		}
		entrada.close();
	}
}