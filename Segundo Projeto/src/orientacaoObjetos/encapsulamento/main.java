package orientacaoObjetos.encapsulamento;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Scanner teclado = new Scanner(System.in);
        String nome = "";
        double saldo, valor = 0;
        int opcao;

        System.out.println("Informe o nome do titular da conta a ser acessada: ");
        nome = teclado.nextLine();

        System.out.println("Digite o saldo da sua conta: R$ ");
        saldo = teclado.nextDouble();
        teclado.nextLine();

        conta.ContaBancaria(nome, saldo);

        do{
            System.out.println("""
                    -Operações na conta-
                    1- Fazer um depósito.
                    2- Sacar dinheiro.
                    0- Sair da conta.
                    """);
            System.out.println("Digite sua opção: ");
            opcao = teclado.nextInt();

            if(opcao < 0 || opcao > 2){
                System.out.println("Opção selecionada é inválida. Selecione uma opção válida (0-2).\n");
            }else if(opcao == 0){
                System.out.println("Até mais!\n");
            }

        }while(opcao < 0 || opcao > 2);

        if(opcao == 1){
            System.out.println("Digite o valor do depósito: R$ ");
            valor = teclado.nextDouble();
            teclado.nextLine();

            conta.depositar(valor);
        }else if(opcao == 2){
            System.out.println("Digite o valor do saque: R$ ");
            valor = teclado.nextDouble();
            teclado.nextLine();

            conta.sacar(valor);
        }
    }
}
