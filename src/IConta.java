
public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();
	
	void pagarConta(double valor);	
	
	void recargaDeCelular(double valor, String numero);
	
	
	
	
}
