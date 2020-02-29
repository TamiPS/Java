package SegundaEvaluacion;

import java.util.Scanner;

public class Ej8 {

	Scanner entrada = new Scanner (System.in);

	int [] vecA;
	int [] vecB;
	int [] vecC;
	int [] vecNuev;



	public static void main(String[] args) {

		Ej8 p1 = new Ej8 ();

		p1.tam();
		p1.cargar();
		p1.suma();
		p1.visualizar();

	}

	public void tam () {

		int tam;
		System.out.println("Introduce el tamaño de elementos de los vectores");
		tam=entrada.nextInt();

		vecA = new int [tam];
		vecB = new int [tam];
		vecC = new int [tam];
		vecNuev = new int [3];

	}

	public void cargar () {

		for (int i=0;i<vecA.length;i++) {
			System.out.println("Introduce valor del vectorA posición "+(i+1));
			vecA[i]=entrada.nextInt();


			System.out.println("Introduce valor del vectorB posición "+(i+1));
			vecB[i]=entrada.nextInt();


			System.out.println("Introduce valor del vectorC posición "+(i+1));
			vecC[i]=entrada.nextInt();
		}

	}

	public void suma () {
		int suma=0;
		int suma1=0;
		int suma2=0;

		for (int i=0;i<vecA.length;i++) {

			suma=suma+vecA[i];
			suma1=suma1+vecB[i];
			suma2=suma2+vecC[i];

		}
		vecNuev[0]=suma;
		vecNuev[1]=suma1;
		vecNuev[2]=suma2;

	}


	public void visualizar () {
		for (int c:vecNuev) {
			System.out.println(c);

		}
	}
}

