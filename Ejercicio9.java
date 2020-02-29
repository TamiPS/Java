package EjerciciosTema2;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner (System.in);
		int num,x;
		System.out.println("Introducir un número");
		num=entrada.nextInt();

		for (int i=1;i<=num;i++) {
			x=0;
			for (int j=1;j<=num;j++) {
				if (i%j==0)
					x++;
			}
			if(x==2) {
				System.out.println(i);
			}
		}
		entrada.close();
	}
}
