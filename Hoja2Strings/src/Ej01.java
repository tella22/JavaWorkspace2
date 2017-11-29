import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {

		String palabra;
		String letra;
		int k;
		String mayusculas;
		String may;
		char intento;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		palabra=teclado.nextLine();
		System.out.println("Introduce una letra");
		letra=teclado.nextLine();

			mayusculas = letra.toUpperCase();
			may=palabra.toUpperCase();

		for(k=0; k<may.length(); k++) {
			intento=may.charAt(k);
			if (String.valueOf(intento).equals(mayusculas)) {
				System.out.print("La palabra se encuentra en la posición " + (k+1));
			}
		}
		
		teclado.close();
	}

}
