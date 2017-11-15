
public class Ej41 {

	public static void main(String[] args) {

		int[][][] matriz = new int[5][10][20];
		int[][] curso = new int[5][10];
		int numero=0;
		int min=0, max=0;

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
		
		
		for (int f=0;f<10;f++) {
			max=0;
			min=0;
			for(int p=0;p<5;p++) {
				curso[p][f]/=20;
				System.out.println(curso[p][f]);
				if(curso[p][f]>curso[max][f]) {
					max=p;
				}
			}
			System.out.println("La nota media mas alta del curso " +(f+1)+ " es del centro "+(max+1)+"\n");
		}
		
	}

}
