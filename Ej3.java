package SegundaEvaluacion;

import java.util.Scanner;

public class Ej3 {
	Scanner entrada = new Scanner (System.in);
	int [] m=new int [10];

	public static void main(String[] args) {

		Ej3 p1 = new Ej3();
		p1.cargar();
		p1.cambiar();
		p1.calculaSuma();

	}

	public void cargar () {

		for (int i=0;i<m.length;i++) {
			m[i]=i;
			System.out.println(m[i]);
		}
	}

	public void cambiar () {
		int pos;
		int valor;
		String cont = "";
		do {

			System.out.println("Introduce posición en a cambiar");
			pos=entrada.nextInt();
			if (pos>m.length || pos<0) {
				System.out.println("Valor fuera de rango");
				continue;
			}
			System.out.println("Introduce valor a introducir en la posición: "+pos);
			valor=entrada.nextInt();
			m[pos]=valor;

			System.out.println("Desea continuar s/n");
			cont=entrada.next();
			
		}while (cont=="s");

		for (int i=0;i<m.length;i++) {
			System.out.println(m[i]);
		}
	}

	public void calculaSuma () {

		int suma=0;
		for (int i=0;i<m.length;i++) {
			suma=suma+m[i];
		}

		System.out.println("\nLa suma de los elementos es: "+suma);
	}
}