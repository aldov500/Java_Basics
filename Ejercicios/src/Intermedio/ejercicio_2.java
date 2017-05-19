package Intermedio;
import java.util.Scanner;

public class ejercicio_2 {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int menu = 0;
		
		
		
		float PI = (float) 3.14159;
		
		while(menu != 8){
			
			
			switch(menu){
			case 0:
				System.out.println("---Seleccione un ejercicio---");
				System.out.println("                             ");
				System.out.println(" 1. Centigrados a Farenheit. ");
				System.out.println(" 2. Circunferencia.  ");
				System.out.println(" 3. Km * h a m * s.      ");
				System.out.println(" 4. Triangulo.       ");
				System.out.println(" 5. Esfera.          ");
				System.out.println(" 6. Separacion cifra.");
				System.out.println(" 7. Contador hasta el 1,000");
				System.out.println(" 8. Salir.");
				
				
				menu = in.nextInt();
				limpiar_pantalla();
				
				break;
			case 1:
				int grados = 0;
				
				System.out.println("1. Centigrados a Farenheit.");
				System.out.print("INGRESE GRADOS C°: ");
				grados = in.nextInt();
				System.out.println("Resultado en Farenheit: " + (32 + ( 9 * grados / 5) ));
				
				limpiar_pantalla();
				menu = 0;
				
				break;
			case 2:
				
				float radio = 0;
				System.out.println("2. Circunferencia.");
				System.out.println("Ingrese el valor del Radio en cm: ");
				radio = in.nextInt();
				System.out.println("Area: " + PI*(radio * radio));
				System.out.println("Circunferencia: " + PI*2*radio);
				System.out.println("Diametro: " + 2*radio);
				
				limpiar_pantalla();
				menu = 0;
				
				
				break;
			case 3:
				
				float metro, segundo, kilometros = 0;
				System.out.println("3. Km/s a m/s. ");
				System.out.println("Ingrese velocidad en Kilometros: ");
				kilometros = in.nextFloat();
				metro = kilometros * 1000;
				segundo = (metro/60)/60;
				
				if (segundo > 99999){
					segundo = segundo/100000;
					
					System.out.println("Equivalente a " + segundo + " hk*s." );
					limpiar_pantalla();
					menu = 0;
					
					
					break;
				}
				
				else if (segundo > 9999){
					segundo = segundo/10000;
					
					System.out.println("Equivalente a " + segundo + " dk*s." );
					limpiar_pantalla();
					menu = 0;
					
					
					break;
				}
				
				else if (segundo > 999){
					segundo = segundo/1000;
					
					System.out.println("Equivalente a " + segundo + " k*s." );
					limpiar_pantalla();
					menu = 0;
					
					
					break;
				}
				
				
				
				System.out.println("Equivalente a " + segundo + " m*s." );
				
				limpiar_pantalla();
				menu = 0;
				
				
				break;
			case 4:
				int cat_Opuesto = 0, cat_Adyascente = 0;
				System.out.println("4. Triangulo.");
				System.out.println("Ingrese el cateto OPUESTO: ");
				cat_Opuesto = in.nextInt();			
				System.out.println("Ingrese el cateto ADYASCENTE: ");
				cat_Adyascente = in.nextInt();
				int hipotenusa = (int)Math.sqrt((cat_Opuesto*cat_Opuesto) + (cat_Adyascente*cat_Adyascente));
				int area = (cat_Opuesto * cat_Adyascente)/2;
				System.out.println("El valor de la hipotenusa es: " + hipotenusa);
				System.out.println("El valor del Area es: " + (cat_Adyascente*cat_Opuesto)/2);
				
				limpiar_pantalla();
				menu = 0;
				
				break;
			case 5:
				radio = 0;
				System.out.println("5. Esfera. ");
				System.out.println("Ingrese el radio de la esfera:  ");
				radio = in.nextFloat();
				System.out.println("El area de la esfera es: "+ 4*PI*(radio*radio));
				
				limpiar_pantalla();
				menu = 0;
				
				
				break;
			case 6:
				int digitos = 0;
				int d1 = 0,d2 = 0,d3 = 0,d4= 0,d5= 0;
				
				System.out.println("6. Separacion cifra.");
				System.out.println("Ingrese 5 digitos: ");
				digitos = in.nextInt();
				
				d1 = digitos/10000;
				d2 = (digitos%10000)/1000;
				d3 = ((digitos%10000)%1000)/100;
				d4 = (((digitos%10000)%1000)%100)/10;
				d5 = ((((digitos%10000)%1000)%100)%10);
				
				System.out.println(d1);
				System.out.println(d1 + " " + d2);
				System.out.println(d1 + " " + d2 + " " + d3);
				System.out.println(d1 + " " + d2 + " " + d3 + " " + d4);
				System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);
				
				limpiar_pantalla();
				menu = 0;
				
				break;
			case 7:
				System.out.println(" 7. Contador hasta el 10,000");
				System.out.println(" Conteo INICIADO.");
				
				for (int i=0; i<1001; i++){
					if(i%10 == 0){
						System.out.println(" ");
						
					}
					if (i==1000){
						System.out.println(i +".");

						menu = 0;
						
						break;
					}
					System.out.print(i + ",");
					
				}
				
				
				limpiar_pantalla();
				menu = 0;
				
				break;
			
				
			case 8: 
				limpiar_pantalla();
				break;
			
			default:
				
				menu = 0;
				break;
				
			}

			
			
		}
		
				
	}

	static public void limpiar_pantalla(){
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		
	}
	
}
