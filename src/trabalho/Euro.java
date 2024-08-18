package trabalho;

public class Euro extends Moeda {
	//classe filha de moeda com seus atributos e funcionalidades dos mesmos.
	
	public Euro (double valor) {
		this.valor = valor;
	}

	public void info() {
		System.out.println("Euro - " +valor);
		
	}

	public double converter() {
		return  this.valor * 5.46;
	}
	
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
		return false;
	}
		
		Euro objetoEuro = (Euro) objeto;
	
		if (this.valor != objetoEuro.valor ) {
			return false;
		}
		return true;
	}

}

