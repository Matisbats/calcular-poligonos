package br.senai.sp.jandira.câlculo_poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.câlculo_poligonos.model.Quadrado;

public class QuadradoDao {
	
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criar um quadrado");
		
		Quadrado quadrado = new Quadrado();
		
		System.out.println("Digite a medidamdo lado do quadrado: ");
		
		quadrado.setLado(leitor.nextDouble());
		quadrado.exibirDados();
		
	}

}
