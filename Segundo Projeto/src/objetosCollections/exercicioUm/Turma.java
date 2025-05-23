package objetosCollections.exercicioUm;

import java.util.ArrayList;

public class Turma {
    private ArrayList <Aluno> listaAlunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno){
        listaAlunos.add(new Aluno(aluno.getNome(), aluno.getIdade()));
    }

    public void listarAlunos(){
        System.out.println("--- Lista de Alunos da Turma ---");

        for(Aluno alunos : listaAlunos){
            System.out.println("Nome: " + alunos.getNome() + " | Idade: " + alunos.getIdade());
        }
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
}
