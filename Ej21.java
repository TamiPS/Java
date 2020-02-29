package ejercicios;
import java.util.Scanner;
public class Ej21 {

	Scanner entrada = new Scanner (System.in);
	double [][] m;

	public static void main(String[] args){

		Ej21 p1 = new Ej21 ();

		p1.tam();
		p1.cargar();
		p1.visualizar();
		p1.suma();
	}

	public void tam () {

		System.out.println("Introduce número de filas");
		int fi=entrada.nextInt();
		System.out.println("Introduce número de columnas");
		int co=entrada.nextInt();
		m=new double [fi][co];

	}

	public void cargar () {
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				System.out.println("Introduce valor para la posición ["+i+"]["+j+"]");
				m[i][j]=entrada.nextDouble();
			}
		}
	}

	public void suma () {
		double sumafila=0;
		for (int i=0;i<m.length;i++) {
			sumafila=0;
			for (int j=0;j<m[i].length;j++) {
				sumafila=sumafila+m[i][j];
			}
			System.out.println("Suma de fila "+i+" es: "+sumafila);
		}
	}
	public void visualizar () {
		
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}
	}
}