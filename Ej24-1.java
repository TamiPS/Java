package ejercicios;
import java.util.Scanner;
public class Ej24 {

	Scanner entrada = new Scanner (System.in);
	char [] l = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	int [] m = new int [l.length];

	public static void main(String[] args) {

		Ej24 p1 = new Ej24();

		p1.contar(p1.frase());
	}

	public String frase() {
		String frase;
		System.out.println("Introduce una frase");
		frase=entrada.nextLine();
		return frase;
	}

	public void contar(String frase) {
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0;
		for (int A=0;A<frase.length();A++) {
			switch (frase.charAt(A)){
			case 'a': 
				a++;
				break;
			case 'b':
				b++;
				break;
			case 'c':
				c++;
				break;
			case 'd':
				d++;
				break;
			case 'e':
				e++;
				break;
			case 'f':
				f++;
				break;
			case 'g':
				g++;
				break;
			case 'h':
				h++;
				break;
			case 'i':
				i++;
				break;
			case 'j':
				j++;
				break;
			case 'k':
				k++;
				break;
			case 'l':
				l++;
				break;
			case 'm':
				m++;
				break;
			case 'n':
				n++;
				break;
			case 'o':
				o++;
				break;
			case 'p':
				p++;
				break;
			case 'q':
				q++;
				break;
			case 'r':
				r++;
				break;
			case 's':
				s++;
				break;
			case 't':
				t++;
				break;
			case 'u':
				u++;
				break;
			case 'v':
				v++;
				break;
			case 'w':
				w++;
				break;
			case 'x':
				x++;
				break;
			case 'y':
				y++;
				break;
			case 'z':
				z++;
				break;
			}
		}

		System.out.println("a: "+a+"b: "+b+"c: "+"d: "+d+"e: "+e+"f: "+f+"g: "+g+"h: "+h+"i: "+i+"j: "+j+"k: "+k+"l: "+l+"m: "+m+"n: "+n+"o: "+o+"p: "+p+"q: "+q+"r: "+r+"s: "+s+"t: "+t+"u: "+u+"v: "+v+"w: "+w+"x: "+x+"y: "+y+"z: "+z);
	}
}