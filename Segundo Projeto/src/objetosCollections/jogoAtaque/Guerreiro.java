package objetosCollections.jogoAtaque;

public class Guerreiro extends Personagem{

    public Guerreiro(String nome) {
        super(nome);
    }

    public void atacar(Personagem alvo){
        System.out.println("\n⚔ " + this.getNome() + " atacou " + alvo.getNome() + "!");
        alvo.receberDano(15);
    }
}
