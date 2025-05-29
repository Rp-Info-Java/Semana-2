package estruturacao.exercicioDois.services;

import estruturacao.exercicioDois.model.Pergunta;
import estruturacao.exercicioDois.repositories.PerguntaRepositorio;
import estruturacao.exercicioDois.repositories.Repositorio;

import java.util.*;

public class JogoServico {
    private Repositorio repositorio;

    public JogoServico(){
        this.repositorio = new PerguntaRepositorio();
    }

    public void executePrograma(){
        Pergunta perg;
        Scanner teclado = new Scanner(System.in);
        int opcao;
        String[] frase = new String[2];
        String alternativa;
        int id = 1;

        do{
            try{
                System.out.println("\nBem-vindo ao Quiz Java!");
                System.out.println("Aqui você pode escolher fazer suas questões ou responder questões.");
                System.out.println("""
                    O que você quer fazer?
                    1- Adicionar uma pergunta (e alternativas).
                    2- Listar as perguntas.
                    3- Responder perguntas. 
                    0- Sair do programa.
                    """);
                System.out.println("Escolha uma opção (1-3 e 0 para sair do programa): ");
                opcao = teclado.nextInt();
                teclado.nextLine();

                if(opcao< 0 || opcao > 3){
                    System.out.println("Opção inválida. Digite uma opção válida.\n");
                }else if(opcao == 1){
                    System.out.println("Escreva o enunciado da questão: ");
                    frase[0] = teclado.nextLine();

                    List<String> alternativas = new ArrayList<>();

                    for (char letra = 'a'; letra <= 'd'; letra++) {
                        System.out.printf("Escreva a alternativa %c): %n", letra);
                        alternativa = teclado.nextLine();
                        alternativas.add(alternativa);
                    }
                    System.out.println("Qual é a alternativa correta para esta questão (a-d)? : ");
                    frase[1] = teclado.nextLine();

                    perg = new Pergunta(frase[0], alternativas, frase[1], id);
                    id++;
                    this.adicionarPergunta(perg);

                } else if (opcao == 2){
                    this.listarPerguntas();
                } else if(opcao == 3){
                    this.responder();
                }else if (opcao == 0){
                    System.out.println("Até mais!\n");
                }
            } catch (Exception e) {
                throw new InputMismatchException("Ocorreu um erro de digitação: " + e);
            }

        }while (opcao != 0);
    }

    public void adicionarPergunta(Object pergunta){
        try{
            if(pergunta instanceof Pergunta){
                repositorio.adicionarPergunta(pergunta);
            }else{
                System.out.println("A entidade passada pela função não é da classe pergunta. Ajuste o código.\n");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void listarPerguntas(){
        repositorio.listarPerguntas();
    }

    public List<Pergunta> getPerguntas(){
        List<Pergunta> listaPergunta = new ArrayList<>();
        listaPergunta = repositorio.getPerguntas();
        return listaPergunta;
    }


    public void responder(){
        Random x = new Random();
        int perguntaRand, tamanho;
        Scanner teclado = new Scanner(System.in);
        List<Pergunta> perguntas;
        Pergunta pergSorteada;
        int contPosicaoLista = 1;
        int respostasCorretas = 0;

        perguntas = this.getPerguntas();
        tamanho = perguntas.size();
        perguntaRand = x.nextInt(tamanho);

        pergSorteada = perguntas.get(perguntaRand);

        System.out.println("\nPergunta " + contPosicaoLista + ": " + pergSorteada.getEnunciado());

        char letraAlternativa = 'a';

        for(String alternativa : pergSorteada.getAlternativas()){
            System.out.println(letraAlternativa + ") " + alternativa);
            letraAlternativa++;
        }
        System.out.println("Digite a alternativa correta (a/b/c/d): ");

        if(teclado.nextLine().equals(pergSorteada.getRespostaCorreta())){
            respostasCorretas += 1;
            System.out.println("Resposta correta! Você acertou "+ respostasCorretas + " de "+ tamanho + " pergunta(s)");
        }else{
            System.out.println("Resposta incorreta! Boa sorte na próxima pergunta!");
        }
    }
}
