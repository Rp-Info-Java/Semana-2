package objetosCollections.jogoAtaque;

public class Mago extends Personagem{
    public Mago(String nome) {
        super(nome);
    }

    public void atacar(Personagem alvo){
        System.out.println("\n⚡ " + this.getNome() + " lançou uma magia!");
        alvo.receberDano(10);
    }
}
