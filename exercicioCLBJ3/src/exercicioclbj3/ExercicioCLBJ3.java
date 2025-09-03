package exercicioclbj3;

public class ExercicioCLBJ3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.ano = 2020;

        carro.acelerar(50);
        carro.desacelerar(20);
        carro.exibirVelocidade();
        
    }
    
}
