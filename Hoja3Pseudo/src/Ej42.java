
public class Ej42 {

	public static void main(String[] args) {

		int[][][] ventas = new int[3][12][4];
		int[][] totalVentas = new int[12][4];
		int numero;

		for(int r=0;r<3;r++) {
			for (int m=0;m<12;m++) {
				for(int p=0;p<4;p++) {
					numero = (int)Math.floor(Math.random() * 40);
					ventas[r][m][p]=numero;
				}
			}
		}// ya tenemos los datos de todos los representantes en cada mes


		for(int r=0;r<3;r++) {
			System.out.println();
			System.out.printf("\nrepresentante %2d \n", r+1);
			System.out.print("           ");
			for(int k=0; k<4;k++) {
				System.out.printf("P%1$-6d", k);
			}
			for (int m=0;m<12;m++) {
				System.out.printf("\nmes %2d", m+1);
				for(int p=0;p<4;p++) {
					System.out.printf("%7d", ventas [r][m][p]);
				}
			}
		}
		
		System.out.println();
		System.out.println("\n total ventas de productos");
		System.out.println();
		System.out.print("           ");
		
		for(int k=0; k<4;k++) {
			System.out.printf("P%1$-6d", k);
		}

		for (int m=0;m<12;m++) {
			System.out.printf("\nmes %2d", m);
			for (int p=0;p<4;p++) {
				totalVentas [m][p]=0;
				for (int r=0; r<3; r++ ) {
					totalVentas [m][p] += ventas [r][m][p];
				}
				System.out.printf("%7d", totalVentas [m][p]);
			}
		}



	}// main
}
