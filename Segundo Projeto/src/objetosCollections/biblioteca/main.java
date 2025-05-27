package objetosCollections.biblioteca;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry\n");
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro3 = new Livro("Noites Brancas", "Fiódor Dostoiévski");
        Leitor leitor1 = new Leitor("Ana");
        Leitor leitor2 = new Leitor("Bruno");

        leitor1.emprestarLivro(livro1);
        leitor1.emprestarLivro(livro2);
        leitor2.emprestarLivro(livro2);
        leitor2.emprestarLivro(livro3);

        leitor1.listarLivrosEmprestados();
        leitor2.listarLivrosEmprestados();
    }
}
