package ejercicios;
public class Ej15 {

	int [][] m;

	public static void main(String[] args){

		Ej15 p1 = new Ej15 ();

		p1.cargar();
		p1.visualizar();
		p1.calcular();

	}

	public void cargar () {
		m = new int [4][3];
		int rnd;
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				rnd=(int)Math.floor(Math.random()*(-10-10+1)+10);
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
		int pos=0, neg=0, cero=0;

		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				if (m[i][j]<0) {
					neg++;
				}
				else if (m[i][j]>0) {
					pos++;
				}
				else 
					cero++;
			}
		}

		System.out.println("El número de valores positivos es: "+pos+", de negativos: "+neg+" y contiene "+cero+" ceros");
	}
}