package exercicioclbj5;

public class ExercicioCLBJ5 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Retangulo retangulo = new Retangulo();
        retangulo.largura = 5.0;
        retangulo.altura = 3.0;

        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
        
    }
    
}
