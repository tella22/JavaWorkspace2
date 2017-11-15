import java.util.Scanner;

public class Ej33 {

	public static void main(String[] args) {
		
		String[] nombres = new String[20];
		Scanner teclado = new Scanner(System.in);
		String name;

		for (int k=0; k<nombres.length; k++) {
			System.out.println("introduce un nombre");
			name=teclado.nextLine();
			nombres[k]=name;

		}
		
		for (int k=0;k<nombres.length; k++) {
			System.out.println(nombres[k]);
		}
		teclado.close();
	}

}
