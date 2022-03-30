
public class CarroSoma extends CarroDeCorrida {

	private int potencia;
	
	public CarroSoma(String nome, int potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		this.potencia = potencia;
	}

	@Override
	public void acelerar(){
		velocidade += potencia;
		if (velocidade > velocidadeMaxima) {
			velocidade = velocidadeMaxima;
		}
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
