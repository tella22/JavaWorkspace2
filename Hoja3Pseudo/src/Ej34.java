import java.util.Scanner;

public class Ej34 {

	public static void main(String[] args) {

		int notas[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		int suma=0;

		for (int k=0; k<notas.length; k++) {
			System.out.println("introduce la nota");
			notas[k]=teclado.nextInt();
		}
		
		for (int k=0;k<notas.length; k++) {
			suma=suma+notas[k];
		}
		float media=0;
		media=(float)suma/notas.length;
		System.out.println("La media es " + media);
		
		teclado.close();
	}

}
