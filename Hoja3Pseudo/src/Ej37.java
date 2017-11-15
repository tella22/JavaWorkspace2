
public class Ej37 {

	public static void main(String[] args) {
		
		int matriz[][] = new int[4][5];
		int c, f, aleatorio;
		int cont=0;
		
		for (f=0;f<4;f++) {
			for(c=0;c<5;c++) {
				aleatorio = (int)Math.floor(Math.random() * 101);
				matriz[f][c]=aleatorio;
			}
		}
		for (f=0;f<4;f++) {
			for (c=0;c<5;c++) {
				System.out.printf("%5d", matriz[f][c]);
				cont=cont+1;
				if (cont%5==0) {
					System.out.println();
				}
			}
		}
		

		System.out.println();
		System.out.println("↓↓ Matriz Traspuesta ↓↓");
		System.out.println();
		
		for (c=0;c<5;c++) {
			for (f=0;f<4;f++) {
				System.out.printf("%5d", matriz[f][c]);
				cont=cont+1;
				if (cont%4==0) {
					System.out.println();
				}
			}
		}
		
	}

}
