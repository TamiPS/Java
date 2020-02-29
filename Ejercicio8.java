package EjerciciosTema2;
import java.util.Scanner;
public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String salir;
		boolean continuar = false;
		do {

			for (float i=1;i<=100;i++) {

				System.out.println("La cuenta de "+i+"$");
				System.out.println(" con el 10% de propina es: "+(i+(i*0.10))+"$");
				System.out.println(" con el 15% de propina es: "+(i+(i*0.15))+"$");
				System.out.println(" con el 20% de propina es: "+(i+(i*0.20))+"$");
				System.out.println("¿Desea continuar? s/n");
				salir=entrada.nextLine();
				if (salir.equals("n")) {
					continuar=true;
					break;
				}
			}
		}while (continuar==false);
		entrada.close();
	}
}