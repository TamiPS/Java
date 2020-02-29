package ejercicios;
import java.util.Scanner;
public class Ej25 {

	Scanner entrada = new Scanner (System.in);
	int [][] m;

	public static void main(String[] args){

		Ej25 p1 = new Ej25 ();

		p1.tam();
		p1.cargar();
		p1.visualizar();
		p1.suma();
	}

	public void tam () {

		System.out.println("Introduce tamaño de la matriz");
		int x=entrada.nextInt();
		m=new int [x][x];

	}

	public void cargar () {
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				System.out.println("Introduce valor para la posición ["+i+"]["+j+"]");
				m[i][j]=entrada.nextInt();
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

		double sumacolumna=0;
		for (int i=0;i<m.length;i++) {
			sumacolumna=0;
			for (int j=0;j<m[i].length;j++) {
				sumacolumna=sumacolumna+m[j][i];
			}
			System.out.println("Suma de columna "+i+" es: "+sumacolumna);
		}
		double sumadiagonal=0;
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				if (i==j) {
					sumadiagonal=sumadiagonal+m[j][i];
				}
			}
		}
		System.out.println("Suma diagonal es: "+sumadiagonal);
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