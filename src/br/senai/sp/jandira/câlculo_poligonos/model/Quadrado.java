package br.senai.sp.jandira.câlculo_poligonos.model;


public class Quadrado {

	private double lado;
	
	public void setLado(double Lado) {
		
	}
	
	private double calcularArea() {
		double area = lado * lado;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 4 * lado;
		return perimetro;
	}
	
	public void exibirDados() {
		System.out.println("--------------");
		System.out.println("DADOS DO QUADRADO");
		System.out.println("----------------");
		System.out.println("Tamanho do lado: " + calcularArea());
		System.out.println("Área total:" + lado);
		System.out.println("Tamanho do lado:" + lado);
		System.out.println("----------------");
	}

	public void setLado(int lado2) {
		// TODO Auto-generated method stub
		
	}

	void exibirDados1() {
		// TODO Auto-generated method stub
		
	}

		
	}

