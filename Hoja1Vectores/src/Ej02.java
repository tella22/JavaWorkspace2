
public class Ej02 {

	public static void main(String[] args) {

		int vecNum[] = new int[10];
		int vecNum2[] = new int[10];
		int vectorTot[] = new int[10];
		int aux;

		for (int k=0; k<vecNum.length; k++){
			//num = (int) Math.floor(Math.random()*(MAX-MIN+1)+MIN);
			vecNum[k] = (int) Math.floor(Math.random()*(10+10+1)-10);
		}
		
		System.out.print("Vector 1:      \t");
		for (int k=0; k<vecNum.length; k++) {
		System.out.printf("%5d", vecNum[k]);
		}

		for (int k=0; k<vecNum2.length; k++){
			//num = (int) Math.floor(Math.random()*(MAX-MIN+1)+MIN);
			vecNum2[k] = (int) Math.floor(Math.random()*(10+10+1)-10);
		}
		
		System.out.println();
		System.out.print("Vector 2:      \t");
		for (int k=0; k<vecNum2.length; k++) {
			System.out.printf("%5d", vecNum2[k]);
			}

		for (int k=0; k<vecNum.length; k++){
			vectorTot[k]=vecNum[k]+vecNum2[k];
		}
		
		System.out.println();
		System.out.print("Vector suma:      \t");
		for (int k=0; k<vectorTot.length; k++) {
			System.out.printf("%5d", vectorTot[k]);
		}

		for(int i=0; i<9; i++) {
			for (int k=0; k<10-i-1; k++) {
				if (vectorTot[k+1]<vectorTot[k]) {
					aux=vectorTot[k+1];
					vectorTot[k+1]=vectorTot[k];
					vectorTot[k]=aux;
				}
			}	
		}
		System.out.println();
		System.out.print("Vector ordenado:      \t");
		for (int k=0; k<vectorTot.length; k++) {
			System.out.printf("%5d", vectorTot[k]);
		}

	}

}
