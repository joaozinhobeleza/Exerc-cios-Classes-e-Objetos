package exercicioclbj2;

public class ContaBancaria {
    
    String titular;
    String numeroConta;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
        
    }
    
}
