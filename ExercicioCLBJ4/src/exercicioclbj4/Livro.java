package exercicioclbj4;

public class Livro {
    
    String titulo;
    String autor;
    int numeroPaginas;
    int exemplaresDisponiveis;

    boolean emprestar() {
        if (exemplaresDisponiveis > 0) {
            exemplaresDisponiveis--;
            return true;
        } else {
            System.out.println("Nenhum exemplar disponível para empréstimo.");
            return false;
        }
    }

    void devolver() {
        exemplaresDisponiveis++;
    }

    void exibirInfo() {
        System.out.println("Exemplares disponíveis: " + exemplaresDisponiveis);
    }
    
}
