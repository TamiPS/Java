package EjerciciosTema2;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int cont=10,conta=0,num,numero;
		numero = (int) (Math.random()*100);
		do {
			System.out.println("Introduce un número");
			num=entrada.nextInt();
			System.out.println(numero);
			if (num!=numero){
				System.out.println("Incorrecto");

				if (num>numero) {
					System.out.println("Te encuentras demasiado alto");
				}
				else {
					System.out.println("Te encuentras demasiado bajo");
				}
				cont--;
				conta++;
				System.out.println("Te quedan: "+cont+" oportunidades");
			}
			else{
				System.out.println("Correcto");
				System.out.println("Posibilidades perdidas: "+conta);
				break;
			}
		}
		while (cont>0);				
		System.out.println("FIN");
	    entrada.close();
	}
}