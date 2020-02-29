package ejercicios;
import java.io.IOException;
import java.util.Scanner;

public class Ej7 {
	
	Scanner entrada=new Scanner (System.in);
	
	public static void main(String[] args) {

		Ej7 p1 = new Ej7 ();
		p1.contar(p1.cargar(p1.tam()));

	}

	public int tam () {
		System.out.println("Introduce tamaño del vector");
		int tam=entrada.nextInt();
		return tam;

	}
	public char[] cargar (int tam){
		char [] m;
		m=new char[tam];
		String c;
		for (int i=0;i<m.length;i++) {
			System.out.println("Introduce caracter de posición "+(i+1));
			c=entrada.next();
			m[i]=c.charAt(0);
		}
		return m;
	}

	public void contar (char[] m) {
		int contador = 0;
		for (int i=0;i<m.length;i++) {
			if (m[i]=='a'||m[i]=='e'||m[i]=='i'||m[i]=='o'||m[i]=='u') {
				contador++;
			}
		}
		System.out.print("Cantidad de vocales: "+contador);
	}

}
