package objetosCollections.exercicioUm;

public class main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Cleitin 09", 23);
        Aluno aluno2 = new Aluno("Madalena", 22);
        Aluno aluno3 = new Aluno("Robson", 19);
        Turma turma = new Turma();
        
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);
        turma.listarAlunos();
    }
}
