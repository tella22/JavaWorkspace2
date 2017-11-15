import java.util.Scanner;
public class Ej38 {

	public static void main(String[] args) {
		
		int a, c, aleatorio;
		int cont=0;		
		int c1, cl, al;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe cuantos cursos");
		c=teclado.nextInt();	
		System.out.println("Escribe cuantos alumnos");
		a=teclado.nextInt();
		
		int matriz[][] = new int[c][a];
		
		c1=a;
		
		for (cl=0;cl<c;cl++) {
			for(al=0;al<a;al++) {
				aleatorio = (int)Math.floor(Math.random() * 101);
				matriz[cl][al]=aleatorio;
			}
		}
		
		for (cl=0;cl<c;cl++) {
			for (al=0;al<a;al++) {
				System.out.printf("%5d", matriz[cl][al]);
				cont=cont+1;
				if (cont%c1==0) {
					System.out.println();
				}
			}
		}
		teclado.close();
	}

}
