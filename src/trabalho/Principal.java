package trabalho;

import java.util.Scanner;

public class Principal {
	
	Scanner teclado;
	Cofrinho cofrinho;
	
	public Principal() {
	teclado = new Scanner(System.in);
	cofrinho = new Cofrinho();
	}

	public static void main(String[] args) {
		Principal menuInicial = new Principal();
		menuInicial.menu();
	}
	
	//menu principal
	public void menu() {
			
		System.out.println("COFRINHO:");
		System.out.println("1-Adicionar Moeda");
		System.out.println("2-Remover Moeda");
		System.out.println("3-Listar Moedas");
		System.out.println("4-Calcular total convertido para Real");
		System.out.println("0-Encerrar");
		String escolha = teclado.next();
		
		//funcionalidades e validações das opções escolhidas no menu principal
		switch (escolha) {
		
		
		case "1":
			//submenu de escolha do tipo de moeda
			System.out.println("Escolha Moeda:");
			System.out.println("1-Real:");
			System.out.println("2-Dólar:");
			System.out.println("3-Euro:");
			String moedaescolhida = teclado.next();
			
			//entrada do valor ao cofrinho
			System.out.println("Digite o valor:");
			String valorMoeda = teclado.next();
			valorMoeda = valorMoeda.replace(",", ".");
			double valorMoedaConvertido = Double.valueOf(valorMoeda);
				
			if (moedaescolhida.equals ("1")) {
				Real moeda = new Real (valorMoedaConvertido);
				cofrinho.adicionar(moeda);
			}
				
			else if (moedaescolhida.equals ("2")) {
				Dolar moeda = new Dolar (valorMoedaConvertido);
				cofrinho.adicionar(moeda);
			}
			
			else if (moedaescolhida.equals ("3")) {
				Euro moeda = new Euro (valorMoedaConvertido);
				cofrinho.adicionar(moeda);
			}
				
			else {
				System.out.println("Não existe este tipo de moeda para ser adicionada.");
			}
			menu();
			break;
		
		case "2":
			//submenu de escolha do tipo de moeda
			System.out.println("Escolha Moeda:");
			System.out.println("1-Real:");
			System.out.println("2-Dólar:");
			System.out.println("3-Euro:");
			moedaescolhida = teclado.next();
			
			//entrada do valor a ser removido do cofrinho
			System.out.println("Digite o valor:");
			valorMoeda = teclado.next();
			valorMoeda = valorMoeda.replace(",", ".");
			valorMoedaConvertido = Double.valueOf(valorMoeda);
				
			if (moedaescolhida.equals ("1")) {
				Real moeda = new Real (valorMoedaConvertido);
				cofrinho.remover(moeda);
			}
				
			else if (moedaescolhida.equals ("2")) {
				Dolar moeda = new Dolar (valorMoedaConvertido);
				cofrinho.remover(moeda);
			}
				
			else if (moedaescolhida.equals ("3")) {
				Euro moeda = new Euro (valorMoedaConvertido);
				cofrinho.remover(moeda);
				}
				
			else {
				System.out.println("Não existe este tipo de moeda para ser removida.");
			}
				menu();
				break;
			
		case "3":
			//listagem das moedas presentes dentro do cofrinho
			cofrinho.listagemMoedas();
			menu();
			break;
				
		case "4":
			//conversão dos valores em reais presentes dentro do cofrinho
			double valorTotalEmReais = cofrinho.totalConvertido();
			System.out.printf("Valor convertido para Real: %.2f\n" ,valorTotalEmReais);
			menu();
			break;
				
		case "0":
			//saída do programa
			System.out.println("Finalizando o programa...");
			break;	
			
		default:
			//desvio do programa caso erro no menu inicial
			System.out.println("Opção Inválida. Tente novamente.");
			menu();
			break;
		}
	}
}


