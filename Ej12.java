package SegundaEvaluacion;
import java.io.IOException;
import java.util.Scanner;

public class Ej12 {

	Scanner entrada= new Scanner (System.in);

	public static void main(String[] args) throws IOException {

		Ej12 p1 = new Ej12();

		p1.visualizar(p1.cambiar(p1.cadena()));

	}

	public String cadena () {

		System.out.println("Introduce frase");
		String frase=entrada.nextLine();
		return frase;
	}


	public String cambiar (String cadena) {
		String cadenaFinal="";
		
		for (int i=0;i<cadena.length();i++) {
			if (cadena.charAt(i)=='.')
				break;
			if (cadena.charAt(i)==' ') {
				cadenaFinal += "";
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