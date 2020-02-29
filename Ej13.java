package ejercicios;
public class Ej13
{
	static int[] v1 = new int[ 10 ];


	public static void main( String[] args )
	{
		int[] v2, v3;
		
		for( int i = 0; i < 10; i++ )
			v1[ i ] = 1;
			
		v2 = v1;
	System.out.print("Imprimo v1: ");
		Imprime( v1 );
		System.out.print("Imprimo v2: ");	
		Imprime( v2 );
		v3 = Suma1( v2 );	
		System.out.print("Imprimo v3: ");
		Imprime( v3 );
		System.out.print("Imprimo v1: ");
		Imprime (v1);
	
	}
	
	static void Imprime( int[] elV )
	{
		for( int i = 0; i < 10; i++ )
			System.out.print( elV[ i ] );
			
		System.out.println();
	}	
	
	static int[] Suma1( int[] elV )
	{
		for( int i = 0; i < 10; i++ )
			elV[ i ]++;	
		
		return elV;
	}	
	
}

/*

Imprimo v1: 1111111111
Imprimo v2: 1111111111
Imprimo v3: 2222222222
Imprimo v1: 2222222222
*/
