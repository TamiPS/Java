package EjerciciosTema2;
import java.util.Scanner;
public class Ejercicio30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner (System.in);
		double base, iva, comi;
		
		System.out.println("Introducir precio base del vehículo");
		base=entrada.nextFloat();
		
		iva=base*0.18;
		comi=base*0.20;
		
		System.out.println("El precio con IVA de: "+iva+"€ y comisión de: "+comi+"€ es en total: "+(base+comi+iva)+"€");
	    entrada.close();
	}

}
