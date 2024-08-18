package trabalho;

public class Dolar extends Moeda {
	//classe filha de moeda com seus atributos e funcionalidades dos mesmos.
	
	public Dolar (double valor) {
		this.valor = valor;
	}

	public void info() {
		System.out.println("Dólar - " +valor);
	}

	public double converter() {
		return  this.valor * 5.07;
	}
	
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
		return false;
	}
		
		Dolar objetoDolar = (Dolar) objeto;
	
		if (this.valor != objetoDolar.valor ) {
			return false;
		}
		return true;
	}
}

