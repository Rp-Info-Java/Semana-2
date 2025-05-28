package estruturacao.exercicioUm.repositories;

public interface Repositorio<T> {
    public void salvar(T entidade);
    public void listar();
    public void buscarPorId(Integer id);
    public void remover(Integer id);
}
