package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int hab,dim=0,lar,anch;
		
		System.out.println("¿Cuántas habitaciones hay en la casa?");
		hab=entrada.nextInt();
		
		while (hab>0) {
			System.out.println("Introduce las dimensiones de la habitación");
			System.out.println("Introduce el largo en metros");
			lar=entrada.nextInt();
			System.out.println("Introduce el ancho en metros");
			anch=entrada.nextInt();
			hab--;
			dim=dim+(anch*lar);
		}
		System.out.println("La casa tiene: "+dim+" Metros Cuadrados");
	    entrada.close();
	}

}
