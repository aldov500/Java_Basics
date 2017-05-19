package objetos_basicos;
import java.util.Scanner;

public class automovil{
	public int numero_puertas, tamaño_llanta;
	public int kilometraje, top_speed;
	public String estado, marca, color, tipo;
	
	
	public  void CrearAutomovil(
			int numero_puertas, int tamaño_llanta,
			int kilometraje, int top_speed,
			String estado, String marca,  String color, String tipo){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Objeto Auto creado.");
		
		System.out.println("Numero de Puertas: "+ numero_puertas + " puertas");
		
		System.out.println("Tamaño de llanta: "+ tamaño_llanta + " pulgadas");
		
		System.out.println("Kilometraje: " + kilometraje);
		
		System.out.println("Velocidad maxima: "+ top_speed);
		
		System.out.println("Marca: " + marca);
		
		System.out.println("Color: " + color);
		
		System.out.println("Tipo: " + tipo);
	
		
	}
	
	public static void main(String[] args){
		automovil auto;
		auto = new automovil();
		
		auto.CrearAutomovil(4, 32, 2000, 180, "Seminuevo", "Camaro", "Rojo", "Deportivo");
		
		System.out.println(auto.top_speed);
	}
	   
	}
