package ejemplo1;

/*	La clase es abstracta, lo que indica que no se pueden crear
 * 	objetos en ella, y define dos metodos (funciones) que indican
 *  el dato de retorno que se obtendra al llamarlos.
 *  Ningun metodo está definido, puesto que se intenta utilizar
 *  esta misma clase para interactuar con mas de una figura, impidiendo
 *  utilizar el mismo modelo matematico para el calculo de los parametros
 *  especificados.
 *  
 */

public abstract class Geometria {
	
	
	public abstract double perimetro();
	public abstract double area();
	
	}
