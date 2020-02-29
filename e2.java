package ejercicios;

public class e2 {
		
	public static void main(String[] args) {

		String cadena = "cadena de caracteres";
		char letra = 'a';
		e2 p1 = new e2();
		p1.visualizar(p1.cambiar(cadena, letra));
	}

	public String cambiar (String cadena, char letra) {
		String cadenaFinal="";
		for (int i=0;i<cadena.length();i++) {
			if (cadena.charAt(i)==letra) {
				cadenaFinal += "";
			}else
			{
				cadenaFinal += cadena.charAt(i);
			}
		}
		return cadenaFinal;
	}
	
	public void visualizar (String c) {
		System.out.print(c);
	}
}