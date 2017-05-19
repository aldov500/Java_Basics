package tabla_calibracion;

import java.text.DecimalFormat;

public class calibrador {
	public static int porcentaje[];
	public static float corriente[], voltaje[], psi[], resistencia[];
	
	public static void GenerarTabla(float i){	
		
		porcentaje[(int)i]   = (int)i;
		corriente[(int) (i)] = 4 + (i*4/25);
		voltaje [(int)(i)]   = (float) (0.25 + i/100); 
		psi[(int)(i)]        = 3 + (i * 3/25);
		resistencia[(int)(i)]= 100 + (i*2/5);
	}
	
	
	public static void main(String[] args) {
		
		DecimalFormat decimales   = new DecimalFormat("00.000");
		DecimalFormat porcentajes = new DecimalFormat("000");
		
		porcentaje  = new int  [101];
		corriente   = new float[101];
		voltaje     = new float[101];
		psi         = new float[101];
		resistencia = new float[101];
		
		System.out.println("  [%%]   Temp[C°]  Voltaje[V]  Corriente[A]  Presion[PSI]  Resistencia[Ohms]  Binario  Hexadecimal  ");
		
		
		
		
		for(int a=0; a<=100; a++){
			GenerarTabla(a);
			
			System.out.print("  [" + porcentajes.format(porcentaje[(int) a]) + "%] [" + porcentajes.format(porcentaje[(int) a]) 
							+ "C°]   " + decimales.format(voltaje[ (int) a]) +" V.   " + decimales.format(corriente[(int) a]) 
							+  " mA.    " + decimales.format(psi[(int) a]) + " PSI.   " + resistencia[(int) a] + 
							" Ohms         [");
			
			System.out.print(Integer.toBinaryString(a) + "]      [");
			
			System.out.println(Integer.toHexString(a) + "]");
			
		
		}
			
	}
}	
	


