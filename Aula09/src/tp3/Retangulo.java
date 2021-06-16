package tp3;

public class Retangulo extends Quadrilateros {
	private double base;
	private double altura;
	private double perimetro;
	private double area;
	
	public Retangulo(double lado, double base) {
		super(lado);
		System.out.println("Novo retangulo criado");
		this.base = base;
		this.altura = lado;
		// TODO Auto-generated constructor stub
	}
	public double getPerimetro() {
		return perimetro = (2*base)+(2*altura);
	}
	public double getBase() {
		return base;
	}
	public double getArea() {
		return area = base*altura;
	}
}

