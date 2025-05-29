package estruturacao.exercicioDois.repositories;

import estruturacao.exercicioDois.model.Pergunta;

import java.util.List;

public interface Repositorio <T>{
    public void adicionarPergunta(T pergunta);
    public void listarPerguntas();
    List<Pergunta> getPerguntas();
}
