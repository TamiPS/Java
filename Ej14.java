package ejercicios;
public class Ej14 {

	int [][] m;

	public static void main(String[] args){

		Ej14 p1 = new Ej14 ();
		
		p1.cargar();
		p1.visualizar();
		p1.calcular();

	}

	public void cargar () {
		m = new int [3][3];
		int rnd;
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				rnd=(int)(Math.random()*100);
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
		int suma=0, media, min=m[0][0], max=m[0][0];
		
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				suma=suma+m[i][j];
				if (m[i][j]>max) {
					max=m[i][j];
				}
				if (min>m[i][j]) {
					min=m[i][j];
				}
			}
		}
		media=suma/(m.length*m.length);

		System.out.println("La suma de los valores es "+suma+" y la media: "+media);
		System.out.println("El valor más pequeño es "+min+" y el mayor: "+max);
	}
}
