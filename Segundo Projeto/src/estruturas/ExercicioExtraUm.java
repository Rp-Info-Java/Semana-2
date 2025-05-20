package estruturas;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ExercicioExtraUm {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> temp = new ArrayList<>();
        ArrayList<String> dias = new ArrayList<>();
        String fraseTemperatura = "";
        double tempDouble, media = 0;
        int opcao, dia;

        while (dias.size() != 7) {

            System.out.println("-Programa de Análise de Temperaturas-");
            System.out.println("""
                    Dias da semana:
                    1- Domingo
                    2- Segunda-feira
                    3- Terça-feira
                    4- Quarta-feira
                    5- Quinta-feira
                    6- Sexta-feira
                    7- Sábado
                    """);
            System.out.println("Informe um dia da semana (1-7): ");
            dia = teclado.nextInt();
            //Integer.parseInt(dia);

            if (dia < 1 || dia > 7) {
                System.out.println("O número informado não representa nenhum dia da semana. Por favor, insira um número válido (1-7)!\n");
            } else {
                if (dias.size() != 7) {
                    String nomeDia = switch (dia) {
                        case 1 -> "Domingo";
                        case 2 -> "Segunda-Feira";
                        case 3 -> "Terça-Feira";
                        case 4 -> "Quarta-Feira";
                        case 5 -> "Quinta-Feira";
                        case 6 -> "Sexta-Feira";
                        case 7 -> "Sábado";
                        default -> "O número informado não representa nenhum dia da semana";
                    };
                    if (dias.contains(nomeDia)) {
                        System.out.println("O dia informado já possui uma temperatura registrada!\n");
                    } else {
                        System.out.println("Informe a temperatura de " + nomeDia + " :");
                        tempDouble = teclado.nextDouble();
                        teclado.nextLine();

                        adicionar(temp, tempDouble, nomeDia, dias);
                    }
                }
            }
        }
        if (dias.size() == 7) {
            media = calcular(temp);
            do {
                System.out.println("""
                        -Análise-
                        1- Calcular a temperatura média da semana.
                        2- Exibir todas as temperaturas registradas.
                        3- Identificar e exibir quais temperaturas estão acima da média.
                        0- Sair da aplicação.
                        """);
                System.out.println("Escolha uma das opções de análise (1-3): ");
                opcao = teclado.nextInt();

                /*if(opcao == 0){
                    break;
                }*/
                switch (opcao) {
                    case 1:
                        fraseTemperatura = String.format("A média da temperatura da semana é de %.1f ºC.\n", media);
                        System.out.println(fraseTemperatura);
                        break;
                    case 2:
                        exibir(temp, dias);
                        break;
                    case 3:
                        tempAcimaMedia(temp, dias, media);
                        break;
                    default:
                        System.out.println("A opção selecionada é inválida. Digite uma opção válida (1-3).\n");
                }

            } while (opcao != 0);
        }
    }

    public static void adicionar(ArrayList<Double> temp, double tempDouble, String nomeDia, ArrayList<String> dias) {
        dias.add(nomeDia);
        temp.add(tempDouble);
        System.out.println("A temperatura de " + nomeDia + " foi registrada.\n");
    }

    public static double calcular(ArrayList<Double> temp) {
        double soma = 0, media = 0;
        int cont = 0;
        for (Double listaTemperaturas : temp) {
            soma += listaTemperaturas;
            cont++;
        }
        media = soma / cont;
        return media;
    }

    public static void exibir(ArrayList<Double> temp, ArrayList<String> dias) {
        int i = 0;
        System.out.println("\n-Registro de temperaturas da semana-");
        for (String diasSemana : dias) {
            System.out.println("A temperatura de " + diasSemana + " é de " + temp.get(i) + " ºC");
            i++;
        }
        System.out.println();
    }

    public static void tempAcimaMedia(ArrayList<Double> temp, ArrayList<String> dias, double media) {
        DecimalFormat df = new DecimalFormat("0.0");

        int i = 0;
        for (String diasSemana : dias) {
            if(temp.get(i) > media){
                System.out.println("A temperatura de " + diasSemana + " (" + temp.get(i) + " ºC)" + " está acima da média de: " + df.format(media) + " ºC\n");
            }
            i++;
        }
        System.out.println();
    }
}
