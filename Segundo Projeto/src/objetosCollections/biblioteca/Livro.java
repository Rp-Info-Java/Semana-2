package objetosCollections.biblioteca;

public class Livro {
    private String titulo;
    String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
