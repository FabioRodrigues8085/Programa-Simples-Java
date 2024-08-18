package trabalho;

import java.util.ArrayList;

public class Cofrinho {
	
	private ArrayList <Moeda> listaMoedas = new ArrayList<>();
	
	public Cofrinho() {
		//armazenamento das moedas
		this.listaMoedas = new ArrayList<>();
	}
	
	public void adicionar (Moeda moeda) {
		//adição das moedas
		this.listaMoedas.add(moeda);
	}
	
	public void remover (Moeda moeda) {
		//remoção das moedas
		this.listaMoedas.remove(moeda);
	}
	
	public void listagemMoedas() {
		//listagem das moedas (caso esteja vazio o cofrinho)
		if (this.listaMoedas.isEmpty()) {
			System.out.println("O cofrinho está vazio.");
		}
		//listagem das moedas
		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
		}
		
	public double totalConvertido() {
		//conversão das moedas para real (caso esteja vazio o cofrinho)
		if (this.listaMoedas.isEmpty()) {
			return 0;
		}
		
		double valorTotal = 0;
		//conversão das moedas para real
		for (Moeda moeda: this.listaMoedas) {
			valorTotal = valorTotal + moeda.converter();
		}
		
		return valorTotal;
	}

}

