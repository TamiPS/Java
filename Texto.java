package SegundaEvaluacion;
import java.util.Scanner;
public class Texto {

    static int x;
    Texto(){
        x=10;
    }
    
	Scanner entrada=new Scanner (System.in);
	
	public static void main(String[] args) {
		
		Texto p1 = new Texto();
		
		p1.contar(p1.cargar(x));

	}

	public char[] cargar (int tamaño){
		char [] m;
		m=new char[tamaño];
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
