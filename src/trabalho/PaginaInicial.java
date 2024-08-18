package trabalho;

import java.util.Scanner;

public class PaginaInicial {
	
	Scanner teclado;
	
	public PaginaInicial() {
		teclado = new Scanner(System.in); 
		
	}
	
	public void menu() {
		System.out.println("COFRINHO:");
		System.out.println("1-Adicionar Moeda");
		System.out.println("2-Remover Moeda");
		System.out.println("3-Listar Moedas");
		System.out.println("4-Calcular total convertido para Real");
		System.out.println("0-Encerrar");
		String escolha = teclado.next();
		
		switch (escolha) {
		case "0":
			System.out.println("Finalizando o programa...");
			break;
			
		default:
			System.out.println("Opção Inválida.");
			menu();
			break;
		}
		
	}

}
