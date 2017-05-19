/**
 * 1. Programa Java que lea dos números enteros 
 *    por teclado y los muestre por pantalla.
 *    
 * 2. Programa Java que lea un nombre y muestre por pantalla: 
 *    “Buenos dias nombre_introducido”.
 *    
 * 3. Programa Java que lee un número entero por teclado y obtiene 
 *    y muestra por pantalla el doble y el triple de ese número.
 */

package Intermedio;
import java.util.Scanner;

public class ejercicio_1 {
	
	public static void main(String[] args) {
	
		int num_1;
		int num_2;
		int doble_triple;
		String nombre_introducido = "";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre completo: ");
		nombre_introducido = entrada.nextLine();
		
		System.out.println("Ingrese el numero para doble/triple: ");
		doble_triple = entrada.nextInt();
		
		System.out.println("Ingrese el primer numero: ");
		num_1 = entrada.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		num_2 = entrada.nextInt();
		
		System.out.println("Buenos Dias " + nombre_introducido + 
						   ", el doble y triple del numero " + doble_triple +
						   " son: " + doble_triple*2 + " y " + doble_triple *3 + 
						   ", respectivamente. Los numeros introducidos despues son " +
						   num_1 + " y " + num_2 + ".");
		

	}

}
