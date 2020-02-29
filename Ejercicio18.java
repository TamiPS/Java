package ejerciciosMetodos;

public class Ejercicio18 {
	
	int[] calculo= {12, 32, 42, 122, 47, 52, 35, 90};
	int[] etica= {12, 72, 32, 54, 52};
	int[] ambas;
	int cont;
	int aux;
	
	public void visualizar1() {
		System.out.println("Aprobados de calculo");
		for (int i = 0; i < calculo.length; i++) {
			System.out.println(calculo[i]);
		}
		System.out.println("Aprobados de etica");
		for (int i = 0; i < etica.length; i++) {
			System.out.println(etica[i]);
		}
	}
	
	public void compara() {
		for (int i = 0; i < calculo.length; i++) {
			for (int j = 0; j < etica.length; j++) {
				if (calculo[i]==etica[j]) {
					cont++;
				}
			}
		}
	}
	
	public void cargarAmbas() {
		ambas=new int [cont];
		int c=0;
			for (int j = 0; j < calculo.length; j++) {
				for (int j2 = 0; j2 < etica.length; j2++) {
					if (calculo[j]==etica[j2]) {
						ambas[c]=calculo[j];
						c++;
					}
				}
			}
		}
	
	public void visualizar() {
		System.out.println("Los alumnos que han aprobado ambas asignaturas son los número: ");
		for (int i = 0; i < ambas.length; i++) {
			System.out.println(ambas[i]);
		}
	}

	public static void main(String[] args) {
		
		Ejercicio18 c1=new Ejercicio18();
		
		c1.visualizar1();
		c1.compara();
		c1.cargarAmbas();
		c1.visualizar();

	}

}
