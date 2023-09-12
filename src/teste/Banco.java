package teste;

public class Banco {
	
private double saldo = 100;

public  void realizarDeposito(double valor) {
    // Implemente a lógica de depósito aqui
    // Por exemplo, atualize o saldo na conta do cliente	
	saldo += valor;
    System.out.println("Depósito de $" + valor + " realizado com sucesso.");
}

public  void realizarSaque(double valor) {
    // Implemente a lógica de saque aqui
    // Verifique se o saldo é suficiente antes de realizar o saque
	if(valor > saldo) {
		System.out.println("Saldo insuficiente");
		System.out.println("Seu saldo é de:" + consultarSaldo() + " deposite R$" +(valor - saldo) + "para realizar o saque");
	}else {
		saldo -= valor;
	    System.out.println("Saque de $" + valor + " realizado com sucesso.");
	    System.out.println("Seu saldo agora é de:" + consultarSaldo());
	}
	
}

public double consultarSaldo() {
	return saldo;
}



}
