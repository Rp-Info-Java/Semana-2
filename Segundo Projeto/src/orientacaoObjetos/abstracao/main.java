package orientacaoObjetos.abstracao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Pagamento pagarCartao = new CartaoCredito();
        Pagamento pagarBoleto = new Boleto();
        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            try{
                System.out.println("""
                    -Opções de pagamento-
                    1- Cartao de Crédito
                    2- Boleto
                    """);
                System.out.println("Escolha sua opção: ");
                opcao = teclado.nextInt();

                if(opcao< 1 || opcao>2){
                    System.out.println("Opção inválida. Selecione uma opção válida (1-2).\n");
                }
            }catch (InputMismatchException e){
                throw new InputMismatchException("Ocorreu um erro pois você digitou um caractere onde deveria ser inserido um número inteiro. Erro: "+e);
            }
        }while(opcao < 1 || opcao > 2);

        if(opcao == 1){
            pagarCartao.validacao();
            pagarCartao.processar();
        }else{
            pagarBoleto.validacao();
            pagarBoleto.processar();
        }
    }
}
