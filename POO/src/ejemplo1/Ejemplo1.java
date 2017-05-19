/*
 * Define sus clases y utiliza los metodos
 * es un programa principal, tipo usuario. 
 */
	

package ejemplo1;

//Importacion de clases del paquete
import java.util.ArrayList;	
import java.awt.*;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		System.out.println("Comienza main()...");
		Circulo c = new Circulo(2.0, 2.0, 4.0);
		
		System.out.println("Radio= ("+ c.r + ") unidades.");
		System.out.println("Centro= ("+ c.x +","+ c.y +") unidades.");
		
		Circulo c1 = new Circuclo(1.0, 1.0, 2.0);
		Circulo c2 = new Circulo(0.0,0.0,3.0);
		c = c1.ElMayor(c2);
		
		System.out.println("El mayor Radio es = ("+ c.r + ")");
		c = new Circulo(); //c.r = 0.0
		c = Circulo.ElMayor(c1,c2);
		
		System.out.println("El mayor Radio es = ("+ c.r + ")");
		
		VentanaCerrable ventana = 
				new VentanaCerrable("Ventana abierta al mundo.");
		ArrayList v = new ArrayList();
		
		CirculoGrafico cg1 = new CirculoGrafico(200, 200, 100, Color.red);
		CirculoGrafico cg2 = new CirculoGrafico(300, 200, 100, Color.blue);
		
		RectanguloGrafico rg = 
				new RectanguloGrafico(50, 50, 450, 350, Color.green);
		
		v.add(cg1);
		v.add(cg2);
		v.add(rg);
		
		PanelDibujo mipanel =
				new PanelDibujo(v);
		ventana.add(mipanel);
		ventana.setSize(500,400);
		ventana.setVisible(true);
		System.out.println("Termina main().");
		

		
	}

}
