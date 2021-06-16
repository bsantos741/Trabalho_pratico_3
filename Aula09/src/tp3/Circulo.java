package tp3;

public class Circulo implements Forma {
	private double pi = 3.14;
	private double raio;
	private double perimetro;
	private double area;
	private double novoRaio;
public Circulo() {
	this.raio = 1;
	System.out.println("Novo circulo com raio padrão criado");
}
public Circulo(double novoRaio) {
	this.raio = novoRaio;
	System.out.println("Novo circulo com raio definido criado");
}

@Override
public double getPerimetro() {
	// TODO Auto-generated method stub
	return perimetro = 2*pi*raio;
}

@Override
public double getArea() {
	// TODO Auto-generated method stub
	return area = pi*raio*raio;
}
public double getRaio() {
	// TODO Auto-generated method stub
	return raio;
}
}
