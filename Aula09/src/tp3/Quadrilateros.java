package tp3;

// parte 2

public abstract class Quadrilateros {
	private double lado;
	private double perimetro;
	private double area;
	
	public Quadrilateros(double lado) {
			this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getPerimetro() {
		return perimetro = lado*4;
	}
	public double getArea() {
		return area = lado*lado;
	}
}
