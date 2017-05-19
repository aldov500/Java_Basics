package paquete;      //Importar paquete de datos
import java.util.Scanner; //Posibilidad de recibir datos

public class main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float masa_1, masa_2;
		float potencia = (float) Math.pow(10, -11);
		double gravedad = 6.74 * potencia;
		float distancia;
		
		System.out.println("Calculo de gravedad.");
		System.out.println("Ingresa Masa 1: ");
		masa_1 = teclado.nextFloat();
		
		System.out.println("Ingresa Masa 2: ");
		masa_2 = teclado.nextFloat();
		
		System.out.println("Ingresa distancia: ");
		distancia = teclado.nextFloat();
		
		System.out.println("El valor de la gravedad es: ");
		System.out.println(gravedad*(masa_1*masa_2)/(distancia*distancia) + " (N*m^2)/kg^2");
		
		
		
	}

}
