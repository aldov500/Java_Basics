package paquete;
import java.util.Scanner; //Posibilidad de recibir datos

public class main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i;
		int tabla=0;
		
		
		System.out.println("Ingresa numero para obtener tabla: ");
		tabla = teclado.nextInt();
		
		for(i=0; i<=10; i++){
			System.out.println(i*tabla);
			
		}
		
		
	}

}
