package exercicioclbj3;

public class Carro {
    
    String marca;
    String modelo;
    int ano;
    int velocidade = 0;

    void acelerar(int incremento) {
        velocidade += incremento;
    }

    void desacelerar(int decremento) {
        velocidade -= decremento;
        if (velocidade < 0) {
            velocidade = 0;
        }
    }

    void exibirVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
    
}
