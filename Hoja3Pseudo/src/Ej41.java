
public class Ej41 {

	public static void main(String[] args) {
		
		int[][][] matriz = new int[5][10][20];
		int[] curso = new int[10];
		int p, c, f;
		int numero=0;
		int cont=0;

		for(p=0;p<3;p++) {
			for (f=0;f<4;f++) {
				for(c=0;c<5;c++) {
					numero = (int)Math.floor(Math.random() * 11);
					matriz[p][f][c]=numero;
				}
			}
		}

		for(p=0;p<3;p++) {
			for (f=0;f<4;f++) {
				for (c=0;c<5;c++) {
					System.out.printf("%5d", matriz[p][f][c]);
					cont=cont+1;
					if (cont%5==0) {
						System.out.println();
					}
				}
			}
			System.out.println();
		}
		
	}

}
