package ejercicios;
import java.util.Scanner;
public class Ej17 {

	Scanner entrada = new Scanner (System.in);
	String [] m=new String[12];

	public static void main(String[] args){

		Ej17 p1 = new Ej17 ();

		p1.cargar();
		p1.ordenar();
		p1.posicion();


	}

	public void cargar () {

		for (int i=0;i<m.length;i++) {
			System.out.println("Introduce nombre del alumno "+(i+1));
			m[i]=entrada.nextLine();
		}
	}

	public void ordenar () {
		
		for(int i=0;i<(m.length-1);i++){
			for(int j=i+1;j<m.length;j++){
				if(m[i].compareToIgnoreCase(m[j])>0){
					String variableauxiliar=m[i];
					m[i]=m[j];
					m[j]=variableauxiliar;
				}
			}
		}
	}
	public void posicion () {
		
		System.out.println("Introduce nombre del alumno a buscar");
		String busca=entrada.next();
		
		for (int i=0;i<m.length;i++) {
			if (m[i].equalsIgnoreCase(busca)) {
				System.out.println(m[i]+": Alumno en la posición: "+(i-1));
			}	
		}
	}
}
