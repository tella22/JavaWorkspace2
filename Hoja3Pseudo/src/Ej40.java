
public class Ej40 {

	public static void main(String[] args) {

		int[][][] matriz = new int[3][4][5];
		int p, c, f;
		int cont=0;
		int c1=0;
		for(p=0;p<3;p++) {
			for (f=0;f<4;f++) {
				for(c=0;c<5;c++) {
					c1=c1+1;
					matriz[p][f][c]=c1;
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
