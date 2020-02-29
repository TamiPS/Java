package ejercicios;
import java.util.Scanner;
public class Ej22 {

	Scanner entrada = new Scanner (System.in);
	String [][] m=new String [2][2];

	public static void main(String[] args) {
		
		Ej22 p1 = new Ej22 ();
		
		p1.cargar();
		p1.calcu();
	}

	public void cargar () {

		String nota;
		String nombre, n;

		for (int i=0;i<m.length;i++) {

			System.out.println("Nombre: ");
			n=entrada.next();
			m[i][0]=n;
			System.out.println("Nota: ");
			nota=entrada.next();
			m[i][1]=nota;

		}	
	}
	public void calcu () {

		int cont=0;
		System.out.println("Aprobados:");
		for (int i=0;i<m.length;i++) {
			if (Integer.parseInt(m[i][1])>=5 && Integer.parseInt(m[i][1])<10) {
				System.out.println(m[i][0]+": "+m[i][1]);
				cont++;
			}
		}
		System.out.println(cont);

		cont=0;
		System.out.println("Suspensos:");
		for (int i=0;i<m.length;i++) {
			if (Integer.parseInt(m[i][1])<5) {
				System.out.println(m[i][0]+": "+m[i][1]);
				cont++;
			}
		}
		System.out.println(cont);

		cont=0;
		System.out.println("Matrícula:");
		for (int i=0;i<m.length;i++) {
			if (Integer.parseInt(m[i][1])==10) {
				System.out.println(m[i][0]+": "+m[i][1]);
				cont++;
			}
		}
		System.out.println(cont);
	}
}
