package br.senai.sp.jandira.câlculo_poligonos.dao;

import java.util.Scanner;

public class RetanguloDao {

	
	public void criar() {
		Retangulo retangulo = new Retangulo();
		try (Scanner leitor = new Scanner(System.in)) {
			{
				
			    System.out.println();
				System.out.println("Criando um retângulo...");
				
				System.out.println("Digite a medida da base do retângulo: ");
				Retangulo.setBase(leitor.nextDouble());
			
			
			System.out.println("Digite a medida da altura do do retângulo: ");
			retangulo.setAltura(leitor.nextDouble());
			
			retangulo.exibirDados();
			
			// Perguntar ao usuário se ele deseja criar outra forma
			System.out.print("Pressione ENTER para continuar...");
			
			leitor.next();
			}
		}
		}
	}