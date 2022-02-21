package bytebankcomposto;

class Conta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;
    
    public void deposita(double valor) {
    	this.saldo = this.saldo + valor;
    }
    
    public boolean saca(double valor) {
    	if(this.saldo >= valor) {
    		this.saldo = this.saldo - valor;
    		return true;
    	} 
    	
    	return false;
    }
    
    public boolean transfere(double valor, Conta numeroDaContaDestino) {
    	if(this.saldo >= valor) {
    		numeroDaContaDestino.saldo = numeroDaContaDestino.saldo + valor;
    		this.saldo = this.saldo - valor;
    		return true;
    	}
    	
    	return false;
    }
    
    // Método que retorna um saldo, pois ele foi deixado como PRIVADO
    public double getSaldo() {
    	return this.saldo;
    }
}