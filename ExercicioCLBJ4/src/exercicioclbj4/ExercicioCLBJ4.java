package exercicioclbj4;

public class ExercicioCLBJ4 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Livro livro = new Livro();
        livro.titulo = "O Senhor dos Anéis";
        livro.autor = "J.R.R. Tolkien";
        livro.numeroPaginas = 1200;
        livro.exemplaresDisponiveis = 3;

        livro.emprestar();
        livro.emprestar();
        livro.devolver();
        livro.exibirInfo();
        
    }
    
}
