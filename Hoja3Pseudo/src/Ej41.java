
public class Ej41 {

	public static void main(String[] args) {

		int[][][] matriz = new int[5][10][20];
		int[][] curso = new int[5][10];
		int numero=0;
		int max=0;

		for(int p=0;p<5;p++) {
			for (int f=0;f<10;f++) {
				for(int c=0;c<20;c++) {
					numero = (int)Math.floor(Math.random() * 11);
					matriz[p][f][c]=numero;
				}
			}
		}

		for(int l=0; l<5;l++) {
			for (int k=0; k<curso.length; k++) {
				curso[l][k]=0;
			}
		}
		
		for(int p=0;p<5;p++) {
			for (int f=0;f<10;f++) {
				for (int c=0;c<20;c++) {
					curso [p][f] += matriz [p][f][c];
				}
			}
		}
		
		for (int p=0;p<5;p++) {
			max=0;
			for(int f=0;f<10;f++) {
				curso[p][f]/=20;
				System.out.printf("%5d", curso[p][f]);
				if(curso[p][f]>curso[p][max]) {
					max=f;
				}
			}
			System.out.println("\n La nota media mas alta del centro " +(p+1)+ " es la numero "+(max+1)+"\n");
		}
		
	}
}
