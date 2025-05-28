package estruturacao.exercicioUm.services;

import estruturacao.exercicioUm.model.Produto;
import estruturacao.exercicioUm.repositories.ProdutoRepositorio;
import estruturacao.exercicioUm.repositories.Repositorio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProdutoServico {
    private Repositorio repositorio;

    public ProdutoServico(){
        this.repositorio = new ProdutoRepositorio();
    }

    public void executePrograma(){
        Produto prod;
        Scanner teclado = new Scanner(System.in);
        int opcao;
        String id = "";
        String nome = "";
        String preco = "";

        do{
            try{
                System.out.println("\n--Sistema de catálogo de produtos--");
                System.out.println("""
                    1- Cadastrar um produto.
                    2- Listar produtos do catálogo.
                    3- Buscar um produto no catálogo (por ID).
                    4- Remover produto do catálogo (por ID).
                    0- Sair do programa.
                    """);
                System.out.println("Digite uma opção (1-4 ou 0 para sair do programa): ");
                opcao = teclado.nextInt();
                teclado.nextLine();

                if(opcao < 0 || opcao > 4){
                    System.out.println("Opção inválida. Por favor, insira uma opção válida!\n");
                } else if(opcao == 0){
                    System.out.println("Até mais!");
                }else if(opcao == 1){
                    System.out.println("Informe o ID do produto: ");
                    id = teclado.nextLine();
                    System.out.println("Informe o nome do produto: ");
                    nome = teclado.nextLine();
                    System.out.println("Informe o preço do produto: R$ ");
                    preco = teclado.nextLine();

                    prod = new Produto(Integer.parseInt(id), nome, Double.parseDouble(preco));

                    this.salvar(prod);
                }else if (opcao == 2){
                    this.listar();
                }else if (opcao == 3){
                    System.out.println("Digite o número de ID do produto que quer buscar: ");
                    id = teclado.nextLine();
                    this.buscarPorId(Integer.parseInt(id));
                }else if (opcao == 4){
                    System.out.println("Digite o número de ID do produto a ser REMOVIDO: ");
                    id = teclado.nextLine();
                    this.remover(Integer.parseInt(id));
                }
            }catch(Exception e){
                throw new InputMismatchException("Ocorreu um erro de digitação: " + e);
            }

        }while(opcao != 0);
    }

    public void salvar(Object entidade){
        try{
            if(entidade instanceof Produto){
                repositorio.salvar(entidade);
            }else{
                System.out.println("A entidade passada não é do tipo produto. Corrija seu código!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void listar(){
        repositorio.listar();
    }

    public void buscarPorId(Integer id){
        repositorio.buscarPorId(id);
    }

    public void remover(Integer id){
        repositorio.remover(id);
    }
}
