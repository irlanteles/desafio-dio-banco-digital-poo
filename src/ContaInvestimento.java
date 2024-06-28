
public class ContaInvestimento extends Conta {

	private double taxaCDB=1.5;
	
	public ContaInvestimento(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}
	
	
	public double getTaxaCDB() {
		return taxaCDB;
	}



	public void setTaxaCDB(double taxaCDB) {
		this.taxaCDB = taxaCDB;
	}



	public double CDB(double valor) {
		
		double rendimento=valor*taxaCDB;
		
		return rendimento;
		
	}

}
