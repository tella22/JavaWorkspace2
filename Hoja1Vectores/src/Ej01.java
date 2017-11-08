public class Ej01 {

		public static void main(String[] args) {
			int v[] = new int[20];
			int indice, supMedia, infMedia, igMedia;
			double suma, media;
			suma = 0;
			for( indice = 0; indice < 20; indice ++){
				//(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
				v[indice] = (int)Math.floor(Math.random() * 21 -10);
				suma = suma + v[indice];
			}
			for( indice = 0; indice < 20; indice ++){
				System.out.print(v[indice] + ", ");
			}
			media = suma/20;
			System.out.println("\nLa media es: " + media);
			
			supMedia = infMedia = igMedia = 0;
			for( indice = 0; indice < 20; indice ++){
				if(v[indice] > media){
					supMedia++;
				} else if(v[indice] < media){
					infMedia++;
				} else if(v[indice] == media){
					igMedia++;
				}			
			}
			
			System.out.println("Hay " + supMedia + " valores superiores a la media");
			System.out.println("Hay " + infMedia + " valores inferiores a la media");
			System.out.println("Hay " + igMedia + " valores iguales a la media");
			
		}//main

	}//class
