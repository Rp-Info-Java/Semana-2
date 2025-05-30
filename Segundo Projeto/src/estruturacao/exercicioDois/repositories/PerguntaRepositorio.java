package estruturacao.exercicioDois.repositories;

import estruturacao.exercicioDois.model.Pergunta;

import java.util.ArrayList;
import java.util.List;

public class PerguntaRepositorio implements Repositorio{
    private List<Pergunta> perguntas = new ArrayList<>();

    public PerguntaRepositorio(){
        super();
    }

    @Override
    public void adicionarPergunta(Object pergunta){
        Pergunta pergunta1 = (Pergunta) pergunta;
        boolean control = false;

        for (Pergunta perg : perguntas){
            if(perg.getId().equals(pergunta1.getId())){
                System.out.println("Não foi possível adicionar essa pergunta! O ID na pergunta já existe no banco de questões!\n");
                control = true;
            }
        }
        if(!control){
            perguntas.add(pergunta1);
            System.out.println("A pergunta foi adicionada ao banco de questões!");
        }
    }

    @Override
    public void listarPerguntas(){
        int controleAlternativas = 0;
        if(perguntas.isEmpty()){
            System.out.println("\n--- Não há nenhuma pergunta no banco de questões! ---");
        }else{
            for (Pergunta perg : perguntas){
                System.out.println("\nPergunta " + perg.getId() + ": " + perg.getEnunciado());

                char letraAlternativa = 'a';

                for(String alternativa : perg.getAlternativas()){
                    System.out.println(letraAlternativa + ") " + alternativa);
                    letraAlternativa++;
                }
            }
        }
    }
    @Override
    public List<Pergunta> getPerguntas() {
        return perguntas;
    }

    @Override
    public void updatePergunta(Object pergunta, int index) {
        Pergunta pergunta1 = (Pergunta)pergunta;
        perguntas.set(index, pergunta1);
    }

}
