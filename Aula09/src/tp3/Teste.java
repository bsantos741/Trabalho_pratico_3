package tp3;

public class Teste {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado(4);
		System.out.println("O seu lado é: "+quadrado.getLado()+"m");
		System.out.println("O seu perimetro é: "+quadrado.getPerimetro()+"m");
		System.out.println("A sua area é: "+quadrado.getArea()+"m²");
		
		System.out.println("-------------------------------------");
		
		Retangulo retangulo = new Retangulo(2, 3);
		System.out.println("Sua altura é: "+retangulo.getLado()+"m");
		System.out.println("Sua base é: "+retangulo.getBase()+"m");
		System.out.println("O seu perimetro é: "+retangulo.getPerimetro()+"m");
		System.out.println("Sua area é: "+retangulo.getArea()+"m²");
		
		System.out.println("-------------------------------------");
		Circulo circulo = new Circulo();
		System.out.println("O seu raio é: "+circulo.getRaio()+"m");
		System.out.println("O seu perimetro é: "+circulo.getPerimetro()+"m");
		System.out.println("A sua area é: "+circulo.getArea()+"m²");
		
	}

}
