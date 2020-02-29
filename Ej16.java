package ejercicios;

public class Ej16 {

	int [][] m;

	public static void main(String[] args){

		Ej16 p1 = new Ej16 ();

		p1.cargar();
		p1.visualizar();
		p1.calcular();

	}

	public void cargar () {
		m = new int [5][6];
		int rnd;
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				rnd=(int)(Math.random()*5);
				m[i][j]=rnd;
			}
		}
	}

	public void visualizar () {

		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public void calcular () {
		int max=m[0][0],cont=0,pos = 0;

		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {

				if (m[i][j]>max) {
					max=m[i][j];
				}
			}	
		}

		System.out.println("El número mayor es: "+max+".");
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				if (m[i][j]==max) {
					cont++;
					System.out.println("Se encuentra en la posición: ["+i+","+j+"].");
				}
			}	
		}
		System.out.println("Se repite "+cont+" veces.");
	}
}
