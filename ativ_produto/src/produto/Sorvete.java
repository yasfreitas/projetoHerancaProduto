package produto;

public class Sorvete extends Produto{
	private double tempoAdequado;

	public Sorvete(long id, String nome, double preco, double tempoAdequado) {
		super(id, nome, preco);
		this.tempoAdequado = tempoAdequado;
	}

	public double getTempoAdequado() {
		return tempoAdequado;
	}

	public void setTempoAdequado(double tempoAdequado) {
		this.tempoAdequado = tempoAdequado;
	}
	
	

}
