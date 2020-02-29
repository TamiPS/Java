package SegundaEvaluacion;
import java.io.IOException;
import java.util.Scanner;

public class Ej6 {
	Scanner entrada= new Scanner (System.in);

	public static void main(String[] args) throws IOException {

		Ej6 p1 = new Ej6();

		p1.visualizar(p1.cambiar(p1.cadena(),p1.letra()));

	}

	public String cadena () {

		System.out.println("Introduce frase");
		String frase=entrada.nextLine();
		return frase;
	}

	public char letra () throws IOException {

		System.out.println("Introduce letra a cambiar");
		char letra=(char)System.in.read();
		return letra;
	}

	public String cambiar (String cadena, char letra) {
		String cadenaFinal="";
		for (int i=0;i<cadena.length();i++) {
			if (cadena.charAt(i)==letra) {
				cadenaFinal += "*";
			}else
			{
				cadenaFinal += cadena.charAt(i);
			}
		}
		return cadenaFinal;
	}

	public void visualizar (String c) {
		System.out.print(c);
	}
}