package metodos;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String resposta = "";
        double saque;

        do{
            System.out.println("Informe um valor para saque (múltiplo de 10 e positivo): ");
            saque = teclado.nextDouble();

            if(saque % 10 != 0 || saque < 0 || saque == 0){
                System.out.println("O número informado não atende os requisitos para o saque!");
            }
        }while(saque % 10 != 0 || saque < 0 || saque == 0);

        resposta = calculoCaixa(saque);

        System.out.println(resposta);
    }

    public static String calculoCaixa(double saque){
        double[] num = {100,50,20,10};
        double aux = saque;
        double soma = 0;
        int contCem = 0, contCinq = 0, contVin = 0, contDez = 0;

        try{
            for(int i = 0; i < num.length; i++){
                if(saque >= 100){
                    if(num[i] == 100){
                        soma = controle(soma, num[i]);
                        saque = debitagem(saque, num[i]);
                        contCem++;
                    }else{
                        i--;
                        if(num[i] == 100){
                            soma = controle(soma, num[i]);
                            saque = debitagem(saque, num[i]);
                            contCem++;
                        }
                    }
                }else if(saque >=50 && saque <100){
                    if(num[i] == 50){
                        soma = controle(soma, num[i]);
                        saque = debitagem(saque, num[i]);
                        contCinq++;
                    }
                }else if(saque > 10 && saque < 50){
                    if(num[i] == 20){
                        soma = controle(soma, num[i]);
                        saque = debitagem(saque, num[i]);
                        contVin++;
                    } else{
                        if (num[i] < 20){
                            i--;
                            soma = controle(soma, num[i]);
                            saque = debitagem(saque, num[i]);
                            contVin++;
                        }
                    }
                }else if (saque == 10){
                    if(num[i] == 10){
                        soma = controle(soma, num[i]);
                        saque = debitagem(saque, num[i]);
                        contDez++;
                    }
                }
            }
        }catch (ArithmeticException e){
            throw new ArithmeticException("Ocorreu um erro no cálculo. Erro: " + e);
        }

        if (saque == 0 && soma == aux){
            return ("O valor de saque era: R$ " + aux + " , as notas retornadas foram:\nNotas de 100: " + contCem +
                    "\nNotas de 50: " + contCinq + "\nNotas de 20: " + contVin + "\nNotas de 10: " + contDez);
        }else{
            return ("Erro no cálculo do retorno de notas!");
        }
    }

    /*public static double[] debitagem(double soma, double saque, double num){
        int tam = 2;
        double[] vetor = new double[tam];

        soma += num;
        saque -= num;

        for (int i=0; i<tam; i++){
            if(i==0){
                vetor[i] = soma;
            }else{
                vetor[i] = saque;
            }
        }

        return vetor;
    }*/

    public static double controle(double soma, double num){
        return soma + num;
    }
    public static double debitagem(double saque, double num){
        return saque - num;
    }
}
