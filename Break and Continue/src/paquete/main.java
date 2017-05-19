package paquete;

public class main {

	
	public static void main(String[] args) {
		for(int i=0; i<=10; i++){
			System.out.println("Dentro del ciclo.");
			System.out.println("Valor de i: " + i);
			
			if(i==4){
				System.out.println("Break.");
				continue;		//Salirse del ciclo actual.
			}
			
		}
		System.out.println("Fuera del ciclo.");
	}


}
