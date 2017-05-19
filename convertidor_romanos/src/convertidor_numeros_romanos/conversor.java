package convertidor_numeros_romanos;
import java.util.Scanner;

public class conversor {

	static int numero, tamaño, unidades, decenas, centenas, uni_millar, dec_millar, cen_millar;
	static Scanner in = new Scanner(System.in);
	static String uni_romano, dec_romano, cen_romano;

public static int unidades(int numero){
	int unidad = (numero%100)%10;
	
	return unidad;
}
public static String uni_romano(int unidades){
	String uni_romano;
	switch(unidades){
		case 0: uni_romano = " ";
		break;
		case 1: uni_romano = "l";
		break;
		case 2: uni_romano = "ll";
		break;
		case 3: uni_romano = "lll";
		break;
		case 4: uni_romano = "lV";
		break;
		case 5: uni_romano = "V";
		break;
		case 6: uni_romano = "Vl";
		break;
		case 7: uni_romano = "Vll";
		break;
		case 8: uni_romano = "Vlll";
		break;
		case 9: uni_romano = "lX";
		break;
		default: uni_romano="";
		break;
	}
	
	return uni_romano;
}


public static int decenas(int numero){
	int decena = (numero%100)/10;
	
	return decena;
}
public static String dec_romano(int decenas){
	String dec_romano;

	switch (decenas){
		case 1: dec_romano = "X";
		break;
		case 2: dec_romano = "XX";
		break;
		case 3: dec_romano = "XXX";
		break;
		case 4: dec_romano = "lX";
		break;
		case 5: dec_romano = "L";
		break;
		case 6: dec_romano = "LX";
		break;
		case 7: dec_romano = "LXX";
		break;
		case 8: dec_romano = "LXXX";
		break;
		case 9: dec_romano = "XC";
		break;
		default: dec_romano ="";
	}
	
	return dec_romano;
}

public static int centenas(int numero){
	int centena = numero/100;
	
	return centena;
}
public static String cen_romano(int centenas){
	String cen_romanos;
	
	switch(centenas){
		case 1: cen_romanos = "C";
		break;
		case 2: cen_romanos = "CC";
		break;
		case 3: cen_romanos = "CCC";
		break;
		case 4: cen_romanos = "CD";
		break;
		case 5: cen_romanos = "D";
		break; 
		case 6: cen_romanos = "DC";
		break;
		case 7: cen_romanos = "DCC";
		break;
		case 8: cen_romanos = "DCCC";
		break;
		case 9: cen_romanos = "CM";
		break;
		default: cen_romanos ="";
	
	}
	
	return cen_romanos;
}

	
	public static void main(String[] args) {
		
			numero = in.nextInt();
			tamaño = String.valueOf(numero).length();
			unidades = unidades(numero);
			decenas = decenas(numero);
			centenas = centenas(numero);
			uni_romano = uni_romano(unidades);
			dec_romano = dec_romano(decenas);
			cen_romano = cen_romano(centenas);
		
		
		System.out.println(cen_romano + dec_romano + uni_romano + " ");
		
		
	}

}
