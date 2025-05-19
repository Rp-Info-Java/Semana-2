package estruturas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap <String, Double> prods = new HashMap<>();
        String produto =  "";
        int opcao = 0;

        while(opcao != 4){
            System.out.println("""
                    \nCatálogo de produtos:
                    1- Adicionar um produto e seu respectivo preço
                    2- Consultar o preço de um produto
                    3- Exibir todos os produtos e seus preços
                    4- Sair do programa
                    """);
            System.out.println("Escolha uma opção (1-4): ");
            opcao = teclado.nextInt();

            if(opcao < 1 || opcao > 4){
                System.out.println("A opção selecionada está incorreta, digite um número válido (1-4)");
            }else if(opcao == 1){
                adicionar(prods, produto);
            }else if (opcao == 2){
                if(prods.isEmpty()){
                    System.out.println("Não há produtos no catálogo!");
                }
                else{
                    consultar(prods, produto);
                }
            }else if (opcao == 3){
                exibir(prods);
            }else if (opcao == 4){
                prods.clear();
                System.out.println("Até mais!");
            }
        }
    }
    public static void adicionar(HashMap<String, Double> prods, String produto){
        Scanner teclado = new Scanner(System.in);
        double valor;

        System.out.println("Informe um produto a ser adicionado no catálogo: ");
        produto = teclado.nextLine();

        if(prods.containsKey(produto)){
            System.out.println("O produto informado já existe no catálogo.\n");
        }else{
            System.out.println("Informe um valor para este produto: R$ ");
            valor = teclado.nextDouble();
            teclado.nextLine();

            prods.put(produto, valor);
            
            System.out.println("Produto adicionado com sucesso!\n");
        }
    }

    public static void consultar(HashMap<String, Double> prods, String produto){
        Set<Map.Entry<String, Double>> entries = prods.entrySet();
        Scanner teclado = new Scanner(System.in);
        int i = 1;

        System.out.println("Produtos disponíveis no catálogo: ");
        for(Map.Entry<String, Double> entry : entries){
            System.out.println("Produto " + i + ": " + entry.getKey());
            i++;
        }

        System.out.println("\nDigite o produto que você deseja saber o valor: ");
        produto = teclado.nextLine();

        if(prods.containsKey(produto)){
            System.out.println("O valor do produto informado é: R$ " + prods.get(produto));
        }else{
            System.out.println("O produto informado não existe no catálogo.");
        }
    }

    public static void exibir(HashMap<String, Double> prods){
        Set<Map.Entry<String, Double>> entries = prods.entrySet();
        int i = 1;

        if(prods.isEmpty()){
            System.out.println("Não há produtos a serem exibidos no catálogo!");
        }else{
            System.out.println("Exibindo os produtos e seus preços no catálogo: ");
            for(Map.Entry<String, Double> entry : entries){
                System.out.println("Produto " + i + ": " + entry.getKey() + " - Valor: R$ " + entry.getValue());
                i++;
            }
        }
    }
}
