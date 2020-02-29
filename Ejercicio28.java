package EjerciciosTema2;
import java.util.Scanner;
public class Ejercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		String fecha;
		int dia, mes, anio, dias;
		boolean sigue = true;
		System.out.println("Introducir fecha DD/MM/AA");
		fecha=entrada.nextLine();

		dia=Integer.parseInt(fecha.substring(0, 2));
		mes=Integer.parseInt(fecha.substring(3,5));
		anio=Integer.parseInt(fecha.substring(6,8));

		System.out.println("Introducir días a sumar a la fecha actual");
		dias=entrada.nextInt();

		while(sigue) {
			switch(mes) {
			case 4:
			case 6:
			case 7:
			case 9:
			case 11:
				if((dia + dias) > 30) {
					mes++;
					dias = dias - 30;
				}
				else{
					sigue = false;
				}
				break;
			case 2:
				//Si el año es bisiesto es divisible entre 4 y 100 o 400
				if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
				{
					if((dia + dias) > 29) {
						mes++;
						dias = dias - 29;
					}
					else{
						sigue = false;
					}
				}
				else{
					if((dia + dias) > 28) {
						mes++;
						dias = dias - 28;
					}
					else{
						sigue = false;
						}
				}
				break;
				
			default:
				if((dia + dias) > 31) {
					dias = dias - 31;
					if(mes == 12) {
						mes = 1;
						anio++;
					}else
						mes++;
				}
				else
				{
					sigue = false;
				}
				break;
			}
		}
		dia = dia + dias;
		System.out.println(dia+"/"+mes+"/"+anio);
		entrada.close();
	}

}
