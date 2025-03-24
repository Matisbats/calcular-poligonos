package br.senai.sp.jandira.câlculo_poligonosl.ui;

import java.util.Scanner;

import br.senai.sp.jandira.câlculo_poligonos.dao.QuadradoDao;

public class Menu {

	public static void criarMenu() {
		
		try (Scanner leitor = new Scanner(System.in)) {
			System.out.println("-------------");
			System.out.println("CALCULADORA DE POLÍGONOS");
			System.out.println("-------------");
			System.out.println("1 - QUADRADO");
			System.out.println("2 - RETÂNGULO");
			System.out.println("3 - TRIÂNGULO");
			System.out.println("4 - TRAPÉZIO");
			System.out.println("5 - CIRCUNFERÊNCIA");
			System.out.println("-------------");
			System.out.println("Escolha uma opção (1-6): ");
			
			int opcao = leitor.nextInt();
			
			System.out.println("A opção escolhida foi " + opcao);

			if (opcao == 1) {
				QuadradoDao.criar();
			} else if (opcao == 2) {
				// Chamar o RetanguloDao
			} else if (opcao == 3) {
				// Chamar o TrianguloDao
			} else if (opcao == 4) {
				// Chamar o TrapezioDao
			} else if (opcao == 5) {
				//Chamar a CircunferenciaDao
			} else if (opcao == 6) {
				System.out.println("Encerrando o programa. Bye!");
				System.exit(0);
			} else {	
				System.out.println("Opção inválida! Você deve escolher um número entre 1 e 5!"); 
			}
		}
		
	}
	
}