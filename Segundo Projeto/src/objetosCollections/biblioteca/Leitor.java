package objetosCollections.biblioteca;

import java.util.ArrayList;

public class Leitor {
    String nome;
    ArrayList<Livro> livrosEmprestados = new ArrayList<>();

    public Leitor(String nome){
        this.nome = nome;
    }

    public void emprestarLivro(Livro livro){
        if(livro.isDisponivel()){
            livrosEmprestados.add(livro);
            livro.setDisponivel(false);
            System.out.println(nome + " pegou emprestado: " + livro.getTitulo());
        }else{
            System.out.println(nome + " tentou pegar: " + livro.getTitulo());
            System.out.println("Livro indisponível para empréstimo.");
        }
    }

    public void listarLivrosEmprestados(){
        System.out.println("\n--- Livros de " + nome + " ---");
        if(livrosEmprestados.isEmpty()){
            System.out.println("Nenhum livro emprestado.");
        }else{
            for (Livro livros : livrosEmprestados){
                System.out.println(livros.getTitulo());
            }
        }
    }
}
