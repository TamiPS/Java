package EjerciciosTema2;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio11 {
	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner (System.in);
		int opc;
		float num1, num2;
		char cont = ' ';

		do {		
			System.out.println("1.Suma");	
			System.out.println("2.Resta");	
			System.out.println("3.Multiplicación");	
			System.out.println("4.División");	
			System.out.println("5.Salir");
			opc = entrada.nextInt();


			switch (opc) {
			case 1: 
				System.out.println("Introducir dos números");	
				num1=entrada.nextFloat();
				num2=entrada.nextFloat();
				System.out.println("La suma de los números es: "+(num1+num2));

				break;

			case 2: 
				System.out.println("Introducir dos números");	
				num1=entrada.nextFloat();
				num2=entrada.nextFloat();
				System.out.println("La resta de los números es: "+(num1-num2));	

				break;

			case 3: 
				System.out.println("Introducir dos números");	
				num1=entrada.nextFloat();
				num2=entrada.nextFloat();
				System.out.println("La multiplicación de los números es: "+(num1*num2));

				break;

			case 4: 
				System.out.println("Introducir dos números");	
				num1=entrada.nextFloat();
				num2=entrada.nextFloat();
				if (num1 ==0 || num2 ==0) {
					System.out.println("No se puede dividir entre 0");	
				}
				else {
					System.out.println("La división de los números es: "+(num1/num2));

					break;}

			case 5: 
				break;

			default:
				System.out.println("Opción incorrecta");	
				System.out.println("¿Quiere continuar? (S/N)");
				cont=(char)System.in.read();
			}

		}while (opc != 5 && cont != 'N' && cont != 'n');
		System.out.println("fin");	
		entrada.close();
	}

}
