package exercicioclbj7;

public class ExercicioCLBJ7 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudante estudante = new Estudante();
        estudante.nome = "João";
        estudante.idade = 16;

        estudante.adicionarDisciplina("Português");
        estudante.adicionarDisciplina("Matemática");

        estudante.exibirDisciplinas();
    }
}


    