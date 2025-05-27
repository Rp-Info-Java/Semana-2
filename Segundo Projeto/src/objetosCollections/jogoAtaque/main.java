package objetosCollections.jogoAtaque;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Personagem> personagens = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String nome = "";

        System.out.println("-Jogo de Ataque-");
        System.out.println("Informe o nome do seu guerreiro: ");
        nome = teclado.nextLine();
        personagens.add(new Guerreiro(nome));
        System.out.println("Guerreiro(a) " + nome + " está pronto(a) para a batalha!\n");

        System.out.println("Informe o nome do seu mago: ");
        nome = teclado.nextLine();
        personagens.add(new Mago(nome));
        System.out.println("Mago(a) " + nome + " está pronto(a) para a batalha!\n");

        System.out.println("Informe o nome do seu Cavaleiro: ");
        nome = teclado.nextLine();
        personagens.add(new Cavaleiro(nome));
        System.out.println("Cavaleiro(a) " + nome + " está pronto(a) para a batalha!\n");

        for(int i = 0; i<personagens.size(); i++){
            for(int j = 0; j< personagens.size(); j++){
                if(i != j){
                    personagens.get(i).atacar(personagens.get(j));
                    if(i == 2){
                        personagens.get(i).atacar(personagens.get(j+1));
                    }
                }
                if (i == 2) {
                    // Rodada extra
                    for (int k = 0; k < personagens.size(); k++) {
                        for (int l = 0; l < personagens.size(); l++) {
                            if (k != l) {
                                personagens.get(k).atacar(personagens.get(l));
                            }
                        }
                    }
                    i = personagens.size();
                    break;
                }
            }
        }
        System.out.println("\nA guerra foi encerrada!");
    }
}
