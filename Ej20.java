package ejercicios;
import java.util.Scanner;
public class Ej20 {

	Scanner entrada = new Scanner (System.in);

	int [][] m=new int [7][4];
	int [][] m2= 
		{
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4}		
		};

	public static void main(String[] args){

		Ej20 p1 = new Ej20 ();

		p1.visualizar();
	}

	public void visualizar () {

		for (int i=0;i<m2.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				System.out.print(m2[i][j]+" ");
			}
			System.out.println();
		}
	}
}