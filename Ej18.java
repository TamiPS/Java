package ejercicios;
import java.util.Scanner;
public class Ej18 {

	Scanner entrada = new Scanner (System.in);
	int [] m1;
	int [] m2;
	int [] m3;

	public static void main(String[] args){

		Ej18 p1 = new Ej18 ();

		p1.tam();
		p1.cargar();
		p1.visualizar();
	}

	public void tam () {

		System.out.println("Introduce número de alumnos que han aprobado cálculo");
		int mc=entrada.nextInt();
		System.out.println("Introduce número de alumnos que han aprobado ética");
		int me=entrada.nextInt();
		
		m1=new int [mc];
		m2=new int [me];
		m3=new int [mc+me];

	}

	public void cargar () {
		System.out.println("Carnets de cálculo 1");
		for (int i=0;i<m1.length;i++) {
			System.out.println("Carnet "+(i+1));
			int cal=entrada.nextInt();
			m1[i]=cal;
			m3[i]=cal;
		}
		
		
		System.out.println("Carnets de Etica");
		for (int i=0;i<m2.length;i++) {
			System.out.println("Carnet "+(i+1));
			m2[i]=entrada.nextInt();
		}
		
		for (int i=m1.length;i<m3.length;i++) {
			m3[i]=m2[i-m1.length];
		}
	}
	public void visualizar () {
		
		System.out.println("Han aprobado ambas asignaturas:");
		for (int c:m3) {
			System.out.println(c);
		}
	}
}