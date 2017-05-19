package paquete;
//Desarrollar un codigo para una calculadora de 4 digitos con valores asignados

public class main {
/* Tipos de Variables Java
 * -short
 * -int
 * -long
 * -float
 * -double
 * -byte
 * -char
 * -boolean
 * -string
 */
	
	public static void main(String[] args) {
		float valor1, valor2, valor3, valor4;
		float suma, resta, multiplicacion, division;
		valor1= 8;
		valor2= valor1*5;
		valor3= valor1 % valor2;
		valor4= valor3 - (valor1/valor2);
		suma= valor1+valor2+valor3+valor4;
		resta= valor1-valor2-valor3-valor4;
		multiplicacion= valor1*valor2*valor3*valor4;
		division= valor1/valor2/valor3/valor4;
		
		System.out.println("Los valores originales: ");
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3);
		System.out.println(valor4);
		
		System.out.println("Suma de los valores: " + suma);
		System.out.println("Resta de los valores: " + resta);
		System.out.println("Producto de los valores: " + multiplicacion);
		System.out.println("Division de los valores: " + division);
		

	}

}
