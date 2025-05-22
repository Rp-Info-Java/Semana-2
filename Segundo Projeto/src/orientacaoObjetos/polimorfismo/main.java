package orientacaoObjetos.polimorfismo;

public class main {
    public static void main(String[] args) {
        Animal bicho = new Cachorro("Pastor Alemão");
        Animal bicho2 = new Gato("Gato Laranja");
        Animal bicho3 = new Galo("Cocoricó");

        System.out.println("-Animais que emitem sons-\n");
        bicho.emitirSom();
        bicho2.emitirSom();
        bicho3.emitirSom();

        System.out.println("Nome dos animais:\nNome do cachorro: " + bicho.getNome() + "\nNome do gato: " + bicho2.getNome() + "\nNome do galo: " + bicho3.getNome());
    }
}
