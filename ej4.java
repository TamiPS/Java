package ejercicios;

public class ej4 {

	float[] Notas = {5.8f,6.2f,7.1f,5.9f,3.6f,9.9f,1.2f,10.0f,4.6f,5.0f}; 
	String[] Nombres = new String[10]; 

	public static void main(String[] args) {

		ej4 p1 = new ej4();
		p1.viusalizar();
		p1.visualizarNotas();
	}

	public void viusalizar () {
		Nombres[0]="Pedro";
		Nombres[1]="Ana";
		Nombres[2]="Luis";
		Nombres[3]="Rover";
		Nombres[4]="Juan";
		Nombres[5]="Eva";  
		Nombres[6]="Mari";
		Nombres[7]="Fran";
		Nombres[8]="Luz";
		Nombres[9]="Sol" ;	
		
		for (String c:Nombres) {
			System.out.println(c);
		}
	}

	public void visualizarNotas () {

		int aprobados=0, mhon=0;
		for (int i=0;i<Notas.length;i++) {
			if (Notas[i]>=5) {
				aprobados++;
			}
			if (Notas[i]==10) {
				mhon++;
			}
		}
		System.out.println("Total aprobados: "+aprobados+"\n Total suspensos: "+(Notas.length-aprobados)+"\n Matrícula de honor: "+mhon);
	}
}
