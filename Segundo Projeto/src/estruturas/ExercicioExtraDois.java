package estruturas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ExercicioExtraDois {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap<String, Integer> contadorFrequencia = new HashMap<>();
        String[] arrayPalavras;
        String frase = "";

        System.out.println("Insira uma frase: ");
        frase = teclado.nextLine();

        try{
            arrayPalavras = frase.split("[ ,.!?]+");

            contador(contadorFrequencia, arrayPalavras);
            exibir(contadorFrequencia);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void contador(HashMap<String, Integer> contadorFrequencia, String[] arrayPalavras){
        for(String palavra : arrayPalavras){
            if(contadorFrequencia.containsKey(palavra)){
                contadorFrequencia.put(palavra, contadorFrequencia.get(palavra) + 1);
            }else{
                contadorFrequencia.put(palavra, 1);
            }
        }
    }

    public static void exibir(HashMap<String, Integer> contadorFrequencia){
        System.out.println("Contagem de frequência de palavras na frase informada: \n");
        contadorFrequencia.forEach((palavraMapa, frequenciaPalavra) -> System.out.println("Palavra: " + palavraMapa +
                " - Contagem: " + frequenciaPalavra
                ));
    }
}
