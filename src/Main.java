
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		poupanca.pagarConta(10);
		poupanca.recargaDeCelular(30, "71999990000");
		
		ContaInvestimento investimento = new ContaInvestimento(venilton);
		
		investimento.depositar(100);
		
		System.out.println("Valor atual R$ "+investimento.CDB(100));
	}

}
