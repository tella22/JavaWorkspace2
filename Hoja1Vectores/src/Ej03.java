
public class Ej03 {

	public static void main(String[] args) {

		int vector[] = new int[20]; 
		int indice, suma=0, cuentaintercambios=0;

		for( indice = 0; indice < 20; indice ++){
			//(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
			vector[indice] = (int)Math.floor(Math.random() * 21 -10);
			suma = suma + vector[indice];
		}
		
		System.out.println("ordenado");
		for( indice = 0; indice < 20; indice ++){
			System.out.printf("%4d", vector[indice]);
		}
		System.out.println();
		for (boolean ordenado=false;!ordenado;){
			for (int i=0;i<vector.length-1;i++){
				if (vector[i]>vector[i+1]){
					//Intercambiamos valores
					int variableauxiliar=vector[i];
					vector[i]=vector[i+1];
					vector[i+1]=variableauxiliar;
					//indicamos que hay un cambio
					cuentaintercambios++;
				}
			}
			//Si no hay intercambios, es que esta ordenado.
			if (cuentaintercambios==0){
				ordenado=true;
			}
			//Inicializamos la variable de nuevo para que empiece a contar de nuevo
			cuentaintercambios=0;
		}

		System.out.println("desordenado");
		for( indice = 0; indice < 20; indice ++){
			System.out.printf("%4d", vector[indice]);
		}

	}

}
