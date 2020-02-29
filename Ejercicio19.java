package EjerciciosTema2;
import java.util.Scanner;
public class Ejercicio19 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero, exp=0, digito;
		double binario=0;

			System.out.println("Introducir un número");
			numero=entrada.nextInt();
		
		while(numero!=0){
			digito = numero % 2;            
			binario = binario + digito * Math.pow(10, exp);   
			exp++;
			numero = numero/2;
		}
		System.out.printf("Binario: %.0f %n", binario);
		entrada.close();
	}
}