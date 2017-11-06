import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {

		String palabra;
		String letra;
		int k;
		String mayusculas="";

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		palabra=teclado.nextLine();
		System.out.println("Introduce una letra");
		letra=teclado.nextLine();

		for (k=0; k<palabra.length(); k++) {
			if (palabra.substring(k)==letra){
				mayusculas = letra.toUpperCase();
			}
			System.out.println(mayusculas);
		}
		
		
		
		teclado.close();
	}

}
