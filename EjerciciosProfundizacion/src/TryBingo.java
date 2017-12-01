
public class TryBingo {
	public static void main(String[] args) {

		int[][] carton = new int[3][5];
		int[] vecContLinea = {0, 0, 0};
		int j=0, k=0, numeroAleatorio=0, f, c, lineasCantadas, contAciertos, cont=0;
		boolean[] vecControlNumeros = new boolean[90];
		boolean bingo=false;

		System.out.println("Cartón nuevo");
		for(j=0; j<3; j++){
			System.out.println();
			for(k=0; k<5; k++) {
				numeroAleatorio=(int)Math.floor(Math.random()*90);
				do{ 
					numeroAleatorio=(int)Math.floor(Math.random()*90);
				}while(vecControlNumeros[numeroAleatorio]==true);
				vecControlNumeros[numeroAleatorio]=true;
				carton[j][k] = numeroAleatorio;
				System.out.printf(" %0$02d", carton[j][k]);
			}
		}//calculamos el carton y lo imprimimos
		System.out.println("\n");
		for(j=0; j<90; j++){
			vecControlNumeros[j]=false;
		}
		lineasCantadas = 0;
		contAciertos=0;
		for(j=0; j<90 && bingo==false; j++){
			numeroAleatorio=(int)Math.floor(Math.random()*90);
			do{ 
				numeroAleatorio=(int)Math.floor(Math.random()*90);
			}while(vecControlNumeros[numeroAleatorio]==true);
			vecControlNumeros[numeroAleatorio]=true;
			System.out.println("Ha salido el numero " + numeroAleatorio);
			cont++;
			for(f=0; f<3; f++){
				for(c=0; c<5; c++) {
					if(carton[f][c]==numeroAleatorio) {
						vecContLinea[f]+=1;
						contAciertos++;
					}
				}// despues hay que mirar si canta linea
				if(vecContLinea[f]==5 && lineasCantadas==0) {
					System.out.println("\n Linea! en " + cont + " intentos \n");
					lineasCantadas++;
				}
				if(contAciertos==15&&bingo==false) {
					System.out.println("\n Bingo! en " + cont + " intentos");
					bingo=true;
				}
			}
			
		}
	}
}


