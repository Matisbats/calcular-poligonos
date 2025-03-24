package br.senai.sp.jandira.câlculo_poligonos.model;

import java.util.Scanner;

import br.senai.sp.jandira.câlculo_poligonos.model.Quadrado;
import br.senai.sp.jandira.câlculo_poligonosl.ui.Menu;

public class CalculadoraPoligono{
	
	public static void main(String[] arg) {
		
	Menu.criarMenu();	{
	
	   try (Scanner leitor = new Scanner(System.in)) {
		System.out.print("Digite o valor do lado do quadrado: ");
		double lado = leitor.nextDouble();
		
		System.out.print("Qual é o seu nome? ");
		String nome = leitor.nextLine();
			
		System.out.println("Olá, " + nome);
	}
	
	Quadrado quadrado1 = new Quadrado();
		quadrado1.setLado(16);
		quadrado1.exibirDados();
		
}
	}
	}