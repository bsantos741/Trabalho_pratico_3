package tp3;

public class Teste {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado(4);
		System.out.println("O seu lado �: "+quadrado.getLado()+"m");
		System.out.println("O seu perimetro �: "+quadrado.getPerimetro()+"m");
		System.out.println("A sua area �: "+quadrado.getArea()+"m�");
		
		System.out.println("-------------------------------------");
		
		Retangulo retangulo = new Retangulo(2, 3);
		System.out.println("Sua altura �: "+retangulo.getLado()+"m");
		System.out.println("Sua base �: "+retangulo.getBase()+"m");
		System.out.println("O seu perimetro �: "+retangulo.getPerimetro()+"m");
		System.out.println("Sua area �: "+retangulo.getArea()+"m�");
		
		System.out.println("-------------------------------------");
		Circulo circulo = new Circulo();
		System.out.println("O seu raio �: "+circulo.getRaio()+"m");
		System.out.println("O seu perimetro �: "+circulo.getPerimetro()+"m");
		System.out.println("A sua area �: "+circulo.getArea()+"m�");
		
	}

}
