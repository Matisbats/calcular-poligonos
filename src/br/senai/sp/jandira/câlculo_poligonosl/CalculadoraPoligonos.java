package br.senai.sp.jandira.câlculo_poligonosl;

import java.util.Scanner;

import br.senai.sp.jandira.câlculo_poligonosl.ui.Menu;

	public class CalculadoraPoligonos {

	public static void main(String[] args) {
		
		// Looping / Laços de repetição
		
		int contador = 0;
		while(contador < 10) {
			System.out.println("SENAI JANDIRA! - " + contador);
			contador = contador +1;
		}
		
		String resposta = "s";
		while(resposta.equals("s")) {
			System.out.println("Estamos dando voltas");
			System.out.println("Gostaria de dar mais uma volta (s/n)? ");
			try (Scanner leitor = new Scanner(System.in)) {
				resposta = leitor.next();
			}
		}
		
		System.out.println("------Tabuada do 9-------");
		contador = 0;
		while(contador <= 10) {
			int resultado = 9 * contador;
			System.out.println("9 X" + contador + " = " + resultado);
			contador ++;
		}
		
		
		
		//Menu.criarMenu();
		
		
	}
}
