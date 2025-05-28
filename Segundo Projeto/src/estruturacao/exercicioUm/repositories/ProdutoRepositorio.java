package estruturacao.exercicioUm.repositories;

import estruturacao.exercicioUm.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepositorio implements Repositorio{
    List<Produto> prodsList = new ArrayList<>();

    public ProdutoRepositorio(){
        super();
    }

    @Override
    public void salvar(Object entidade){
        boolean control = false;
        Produto entidade1 = (Produto) entidade;

        for (Produto prods : prodsList){
            if(prods.getId().equals(entidade1.getId())){
                System.out.println("Não foi possível cadastrar esse produto! O produto já existe no banco de dados!\n");
                control = true;
            }
        }
        if(!control){
            prodsList.add(entidade1);
            System.out.println("Produto cadastrado com sucesso!");
        }
    }
    @Override
    public void listar(){
        if(prodsList.isEmpty()){
            System.out.println("----- Não há produtos à serem listados -----");
        }else{
            System.out.println("\n--- Lista de produtos no catálogo ---");
            for(Produto entidade : prodsList){
                System.out.println("ID: " + entidade.getId() + "\nNome: " + entidade.getNome() + "\nPreço: R$ " + entidade.getPreco() + "\n");
            }
        }
    }
    @Override
    public void buscarPorId(Integer id){
        boolean control = false;

        if(prodsList.isEmpty()){
            System.out.println("Não há produtos a serem buscados!");
        }else{
            for (Produto prodBusca : prodsList){
                if(prodBusca.getId().equals(id)){
                    System.out.println("Produto encontrado: ");
                    System.out.println("ID: " + prodBusca.getId() + "\nNome: " + prodBusca.getNome() + "\nPreço: R$ " + prodBusca.getPreco());
                    control = true;
                }
            }
            if(!control){
                System.out.println("O produto buscado não existe no banco de dados. Forneça um id válido.\n");
            }
        }
    }
    @Override
    public void remover(Integer id){
        boolean control = false;
        int contPosicaoLista = 0;

        for (Produto prodRemover : prodsList){
            if(prodRemover.getId().equals(id)){
                System.out.println("Produto removido com sucesso!");
                System.out.println("ID: " + prodRemover.getId() + "\nNome: " + prodRemover.getNome() + "\nPreço: R$ " + prodRemover.getPreco());
                prodsList.remove(contPosicaoLista);
                control = true;
                break;
            }
            contPosicaoLista++;
        }
        if(prodsList.isEmpty()){
            System.out.println("Não há produtos a serem removidos");
        }else{
            if(!control){
                System.out.println("O produto buscado não existe no banco de dados. Forneça um id válido.\n");
            }
        }
    }
}
