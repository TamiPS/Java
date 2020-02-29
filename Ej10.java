package ejercicios;
import java.util.Scanner;
public class Ej10 {
	Scanner entrada=new Scanner (System.in);
	int [] v1;
	int [] v2;
	int [] v3;
	public static void main(String[] args) {
		Ej10 p1 = new Ej10();

		p1.tam();
		p1.cargar();
		p1.ordenar();
		p1.visualizar();
	}

	public void tam () {

		int tam1, tam2;
		System.out.println("Introduce el tamaño del vector 1");
		tam1=entrada.nextInt();

		v1=new int[tam1];

		System.out.println("Introduce el tamaño del vector 2");
		tam2=entrada.nextInt();

		v2=new int[tam2];
		v3=new int[tam1+tam2];

	}

	public void cargar () {

		for (int i=0;i<v1.length;i++) {
			System.out.println("Introduce valor para la posición "+(i+1)+" del vector 1");
			v1[i]=entrada.nextInt();
			v3[i]=v1[i];
		}

		for (int i=0;i<v2.length;i++) {
			System.out.println("Introduce valor para la posición "+(i+1)+" del vector 2");
			v2[i]=entrada.nextInt();
		}

		for (int i=v1.length;i<v3.length;i++) {
			v3[i]=v2[i-v1.length];
		}
		
	}

	public void ordenar () {
		for (int i=0;i<v3.length;i++) {
			for (int j=i+1;j<v3.length;j++) {
				if (v3[i]>v3[j]) {
					int aux=v3[i];
					v3[i]=v3[j];
					v3[j]=aux;
				}
			}
		}

		for (int i=0;i<v1.length;i++) {
			for (int j=i+1;j<v1.length;j++) {
				if (v1[i]>v1[j]) {
					int aux=v1[i];
					v1[i]=v1[j];
					v1[j]=aux;
				}
			}
		}

		for (int i=0;i<v2.length;i++) {
			for (int j=i+1;j<v2.length;j++) {
				if (v2[i]>v2[j]) {
					int aux=v2[i];
					v2[i]=v2[j];
					v2[j]=aux;
				}
			}
		}
	}

	public void visualizar () {

		for (int c:v1) {
			System.out.println("Vector 1: "+c);
		}
		for (int c:v2) {
			System.out.println("Vector 2: "+c);
		}
		for (int c:v3) {
			System.out.println("Vector 3: "+c);
		}
	}
}
