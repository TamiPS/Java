package ejercicios;
import java.io.IOException;
import java.util.Scanner;
public class Ej23 {
	
	Scanner entrada = new Scanner (System.in);
	String [] m;
	
	public static void main(String[] args) throws IOException {

		Ej23 p1 = new Ej23 ();
		
		p1.tam();
		p1.cargar();
		p1.opcion();
		
	}
	
	public void tam () {
		System.out.println("Introduce el tamaño de la matriz");
		int tam=entrada.nextInt();

		m = new String [tam];
	}
	
	public void cargar () {
		for (int i=0;i<m.length;i++) {
			System.out.println("Introduce un nombre");
			m[i]=entrada.next();
		}
	}
	public void opcion () {
		System.out.println("Visualizar el contenido de la matriz s/n");
		char opc = 0;
		try {
			opc = (char) System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (opc!='n') {
			for (String c:m) {
				System.out.println(c);
			}
		}
		else {
			System.out.println("Has pulsado no visualizar");
		}
	}
}
