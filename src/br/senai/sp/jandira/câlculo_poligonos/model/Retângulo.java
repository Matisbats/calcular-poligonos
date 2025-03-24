package br.senai.sp.jandira.câlculo_poligonos.model;

public class Retângulo {

	private double base;
	private double altura;
	
	public void setLado(double Lado) {
	} 
	public void setaltura(double Altura){
		
	}
	
	private double calcularArea() {
		double area = base * altura;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 4 * base;
		return perimetro;
	}
	
	public void exibirDados() { 
		System.out.println("--------------");
		System.out.println("DADOS DO RETÂNGULO");
		System.out.println("----------------");
		System.out.println("Tamanho da base: " + calcularArea());
		System.out.println("Área total:" + altura);
		System.out.println("Tamanho da base:" + altura);
		System.out.println("----------------");
		}
	}