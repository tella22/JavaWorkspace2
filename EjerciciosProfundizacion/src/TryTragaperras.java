import java.util.Scanner;
public class TryTragaperras {

	public static void main(String[] args) {

		String[] vecGanadores = {"$$$", "$@@", "$##", "@@@", "@##", "@$$", "###", "%%%", "<<<", ">>>", "$@%"};
		int dinero, contaDinero=0, numeroAleatorio, k, tirar=0;
		boolean seguir, ganadora;
		String seguirJugando;
		String salida="";
		Scanner teclado = new Scanner(System.in);

		do{
			System.out.println("introduce la cantidad de € que desea jugar (entre 1 y 9€)");
			dinero=teclado.nextInt();
			System.out.println("Has introducido "+dinero+"€, puedes hacer "+dinero+" tiradas");
		}while(dinero < 1 || dinero > 9);//aqui introducimos la cantidad con la que queremos iniciar desde 1 hasta 9 y nos muestra el numero de tiradas que tenemos 1€=1Tirada

		contaDinero+=dinero;
		seguir=true;

		System.out.println("1 para tirar, 0 para salir");
		tirar=teclado.nextInt();
		if (tirar==1) {

			while(seguir!=false && contaDinero>0){
				salida="";
				contaDinero--;
				for(k=0;k<3;k++) {
					numeroAleatorio=(int)Math.floor(Math.random()*10);//crea un numero aleatorio entre el 0 y el 9
					switch (numeroAleatorio) {
					case 0:
						salida+="$";
						break;
					case 1:
						salida+="$";
						break;
					case 2:
						salida+="$";
						break;
					case 3:
						salida+="@";
						break;
					case 4:
						salida+="@";
						break;
					case 5:
						salida+="@";
						break;
					case 6:
						salida+="#";
						break;
					case 7:
						salida+="%";
						break;
					case 8:
						salida+="<";
						break;
					case 9:
						salida+=">";
						break;
					}//al hacer el numero aleatorio coge el 1º, el 2º y el 3º digito con el bucle for
				}//for tirada
				System.out.println(salida);
				ganadora=false;
				for(k=0;k<vecGanadores.length ;k++) {
					if(salida.equals(vecGanadores[k]) && ganadora==false) {
						System.out.println("la combinacion es ganadora");
						ganadora=true;
						switch(k) {
						case 0:
							contaDinero+=50;
							break;
						case 1:
							contaDinero+=25;
							break;
						case 2:
							contaDinero+=15;
							break;
						case 3:
							contaDinero+=10;
							break;
						case 4:
							contaDinero+=5;
							break;
						case 5:
							contaDinero+=3;
							break;
						case 6:
							contaDinero+=1;
							break;
						case 7:
							contaDinero+=1;
							break;
						case 8:
							contaDinero+=1;
							break;
						case 9:
							contaDinero+=1;
							break;
						case 10:
							contaDinero+=1;
							break;
						}
					}
				}//si tienes alguna de las combinaciones ganadoras te suma la cantidad a ganar
				System.out.println("ahora tienes "+contaDinero+"€");
				if (contaDinero==0) {
					System.out.println("Te has quedado sin dinero");
					break;
				}
				do{
					System.out.println("¿seguir jugando? (si o no)");
					seguirJugando=teclado.next();
				}while(seguirJugando.equals("")||!seguirJugando.equals("si")&&!seguirJugando.equals("no"));//filtro para seguir jugando
				if(seguirJugando.equals("no")||seguirJugando.equals("NO")||seguirJugando.equals("nO")||seguirJugando.equals("No")) {
					seguir=false;
				}else if(contaDinero==0){
					seguir=false;
				}//si dice que no seguir pasa a falso y se saldra del while principal
				if(seguirJugando.equals("no")) {
					System.out.println("Te has ido con "+contaDinero+ "€");
				}//si has dicho que no te devolvera el mensaje con el dinero acumulado

			}//while principal, mientras tengas dinero o quieras seguir jugando

		}else if(tirar==0) {
			System.out.println("Te vas con tu dinero "+contaDinero+"€");
		}//si te has quedado sin dinero te devolvera este mensaje
		teclado.close();
	}//main
}//class
