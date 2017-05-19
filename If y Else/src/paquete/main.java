package paquete;			//IMPORTANDO PAQUETE

public class main {			//CLASE PRINCIPAL
/*
 * OBJETIVO:
 * 	IMPRIMIR LOS NUMEROS PRIMOS DEL 1 AL 100 SIN USAR FUNCIONES.
 * 
 */
	public static void main(String[] args) {
	
	int n;							//PARAMETRO DEL NUMERO
	int m;							//DIVISOR
	boolean primo= true;			//BANDERA NUMERO PRIMO
	
	for(n=2; n<100; n++){			//CICLO 100 REPETICIONES
		m= n-1;						//DIVISOR TOMA UN VALOR ABAJO DEL NUMERO
		primo=true;					//PRIMO ACT
		while(primo==true && m>1){	
			
			if(n % m==0){			//SI LA DIVISION ES EXACTA
				primo= false;		//BANDERA DESACT
			}
			else{
				m--;				//SINO, DECREMENTA PARA DIVIDIR POR UN NUMERO MAS ABAJO
			}
		}
		
		if(primo){					//BANDERA ACTIVADA
			if(n==97){
				System.out.print(n+".");	//PUNTO PARA EL FINAL
			}
			else{
				System.out.print(n+",");	//IMPRIME EL VALOR DE N
			}
	
		}
		
	}
	
	}

}
		
		
	
	


