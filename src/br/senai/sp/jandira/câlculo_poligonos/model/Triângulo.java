package br.senai.sp.jandira.câlculo_poligonos.model;

public abstract class Triângulo {

	private double lado;
	private double base;
	private double altura;
	
	public abstract void setLado(double Lado);
	public abstract void setBase(double base);
	public void setAltura(double altura){
		
	}
	
	private double calcularArea() {
		double area = base * altura /2;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 3 * lado;
		return perimetro;
	}
	
	public void exibirDados() {
		System.out.println("--------------");
		System.out.println("DADOS DO TRIÂNGULO");
		System.out.println("----------------");
		System.out.println("Tamanho do lado: " + calcularArea());
		System.out.println("Área total:" + lado);
		System.out.println("Tamanho do lado:" + lado);
		System.out.println("----------------");
	}
}
