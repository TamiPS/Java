package EjerciciosTema2;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int a=0,i,num;

		System.out.println("Introducir número");
		num=entrada.nextInt();

		for(i=1;i<=num;i++){
			if(num%i==0){
				a++;
			}
		}
		if(a!=2){
			System.out.println("No es Primo");
		}else{
			System.out.println("Es Primo");
		}
		entrada.close();
	}
}