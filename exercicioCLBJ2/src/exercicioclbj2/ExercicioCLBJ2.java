package exercicioclbj2;

public class ExercicioCLBJ2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "João Porto";
        conta.numeroConta = "123456-7";
        conta.saldo = 1000.0;

        conta.depositar(500.0);
        conta.sacar(300.0);
        conta.exibirSaldo();
        
    }
    
}
