package EjerciciosTema2;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio29 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		double horas,horasF,sumaT = 0,sumaM = 0;
		String turno;
		Scanner entrada = new Scanner (System.in);;

		for (int i=5;i>0;i--) {
			System.out.println("Introducir turno del trabajador mañana/tarde");
			turno = entrada.next();

			if (turno.equalsIgnoreCase("mañana"))
			{
				System.out.println("Introducir horas del trabajador");
				horas = entrada.nextInt();
				horas=horas*10;
				System.out.println("Introducir horas festivas trabajadas");
				horasF = entrada.nextInt();
				horasF=horasF*1.25;
				System.out.println("Su salario diario es: "+(horas+horasF));
				sumaM=horas+horasF;
			}
			else if (turno.equalsIgnoreCase("tarde"))
			{
				System.out.println("Introducir horas del trabajador");
				horas = entrada.nextInt();
				horas=horas*12;
				System.out.println("Introducir horas festivas trabajadas");
				horasF = entrada.nextInt();
				horasF=horasF*1.25;
				System.out.println("Su salario diario es: "+(horas+horasF));
				sumaT=horas+horasF;
			}
			else if (!turno.equalsIgnoreCase ("tarde") || !turno.equalsIgnoreCase ("mañana")) {
				i++;
			}
		}
		System.out.println("La empresa debe pagar: "+sumaM+" por las horas de mañana y: "+sumaT+" por las horas de tarde, Total: "+(sumaT+sumaM));
		entrada.close();
	}
}


