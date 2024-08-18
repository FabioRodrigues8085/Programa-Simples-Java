package trabalho;

public abstract class Moeda {
	//classe mãe das classes Dolar, Euro e Real
	
	public double valor;
	
	public abstract void info();
	public abstract double converter();

}
