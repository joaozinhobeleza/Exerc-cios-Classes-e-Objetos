package exercicioclbj7;

import java.util.ArrayList;

public class Estudante {
    
    String nome;
    int idade;
    ArrayList<String> disciplinas = new ArrayList<>();

    void adicionarDisciplina(String disciplina) {
        disciplinas.add(disciplina);
    }

    void exibirDisciplinas() {
        System.out.println("Disciplinas de " + nome + ":");
        disciplinas.forEach((d) -> {
            System.out.println("- " + d);
        });
    }

}
