package estruturas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        LinkedList<String> lista = new LinkedList<>();
        int opcao = 0;

        while(opcao != 4){
            System.out.println("""
                    \nFila de clientes:
                    1- Adicionar um cliente à fila
                    2- Atender (remover) o cliente no início da fila
                    3- Exibir todos os clientes atualmente na fila
                    4- Sair do programa
                    """);
            System.out.println("Escolha uma opção (1-4): ");
            opcao = teclado.nextInt();

            if(opcao < 1 || opcao > 4){
                System.out.println("A opção selecionada está incorreta, digite um número válido (1-4)");
            }else if(opcao == 1){
                adicionar(lista);
            }else if (opcao == 2){
                if(lista.isEmpty()){
                    System.out.println("Não há clientes na fila de espera do banco.");
                }
                else{
                    remover(lista);
                }
            }else if (opcao == 3){
                exibir(lista);
            }else if (opcao == 4){
                lista.clear();
                System.out.println("Até mais!");
            }
        }
    }

    public static void adicionar(LinkedList<String> lista){
        Scanner teclado = new Scanner(System.in);
        String elemento = "";

        System.out.println("Digite o nome da pessoa que entrou na fila: ");
        elemento = teclado.nextLine();

        lista.addLast(elemento);
        System.out.println("A pessoa " + elemento + " entrou na fila");
    }
    public static void remover(LinkedList<String> lista){
        Scanner teclado = new Scanner(System.in);

        System.out.println("O cliente " + lista.pollFirst() + " está sendo atendido.");
    }
    public static void exibir(LinkedList<String> lista){
        Scanner teclado = new Scanner(System.in);
        System.out.println(lista);
    }
}
