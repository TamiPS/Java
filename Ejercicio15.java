package EjerciciosTema2;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j=0;
		for (i=2;i<=100;i=i+3) {

			System.out.print(i);
			if (i<98)
				System.out.print("+");
			j=j+i;
		}
		System.out.print(" = "+j);
	}
}
