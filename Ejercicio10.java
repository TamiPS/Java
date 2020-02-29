package EjerciciosTema2;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int num,num2=0,suma=0,x=0,can_num=0;
		do {
			System.out.println("Introduce un número");
			num=entrada.nextInt();
			x++;
			can_num++;
			if (x==3) {
				if (num>suma) {
					System.out.println("Condición: "+(suma-num2)+" + "+num2+" < "+num);
					System.out.println("Has introducido: "+can_num+" números");
				}
				else {
					suma=num2+num;
					x=2;
				}
				num2=num;
			}else{
				suma=suma+num;
				num2=num;
			}
		}while (num<=suma);
		entrada.close();
	}
}