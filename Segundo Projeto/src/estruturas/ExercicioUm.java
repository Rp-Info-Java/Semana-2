package estruturas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        int opcao = 0, control = 0;

        while(opcao != 4){
                System.out.println("""
                    \nLista de Tarefas:
                    1- Adicionar uma nova tarefa
                    2- Remover uma tarefa existente
                    3- Exibir todas as tarefas atuais
                    4- Sair do programa
                    """);
                System.out.println("Escolha uma opção (1-4): ");
                opcao = teclado.nextInt();

                if(opcao < 1 || opcao > 4){
                    System.out.println("A opção selecionada está incorreta, digite um número válido (1-4)");
                }else if(opcao == 1){
                    adicionar(lista);
                }else if (opcao == 2){
                    remover(lista);
                }else if (opcao == 3){
                    exibir(lista);
                }else if (opcao == 4){
                    lista.clear();
                    System.out.println("Até mais!");
                }
        }
    }
        public static void adicionar(ArrayList<String> lista){
            String tarefaAdd = "";
            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite o nome da tarefa a ser adicionada: ");
            tarefaAdd = teclado.nextLine();

            lista.add(tarefaAdd);

            System.out.println("Sua tarefa foi adicionada com sucesso!\n");
        }

        public static void remover(ArrayList<String> lista){
            String tarefaR = "";
            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite o nome da tarefa a ser removida: ");
            tarefaR = teclado.nextLine();

            if(!lista.contains(tarefaR)){
                System.out.println("A tarefa informada não existe na lista de tarefas!");
            }else{
                lista.remove(tarefaR);
                System.out.println("Sua tarefa foi removida com sucesso!\n");
            }
        }

        public static void exibir(ArrayList<String> lista){
            System.out.println("Imprimindo a lista de tarefas completa: ");
            System.out.println(lista);
        }
}

