package ejemplo1;

public class Circulo extends Geometria {
	
	static int numCirculos = 0;
	public static final double PI = 3.1415926535;
	public double x, y, r;
	
	public Circulo(double x, double y, double r){
		this.x=x;
		this.y=y;
		this.r=r;
		numCirculos++;
		
	}
	
	public Circulo(double r){
		this(0.0, 0.0, r);
	}
	
	public Circulo(Circulo c){
		this(c.x, c.y, c.r);
	}
	
	public Circulo(){
		this(0.0, 0.0, 1,0);
		
	}

	public double perimetro(){
		return 2.0 * PI * r;
	}
	
	public double area(){
		return PI*r*r;
	}
	
	public Circulo ElMayor(Circulo c){
		if (this.r>= c.r){
			return this;
		}
		else{
			return c;
		}
		
	}
	
	public static Circulo ElMayor(Circulo c, Circulo d){
		if(c.r>= d.r){
			return c;
		}
		else{
			return d;
		}
		
	}

}
