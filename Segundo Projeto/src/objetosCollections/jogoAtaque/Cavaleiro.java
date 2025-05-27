package objetosCollections.jogoAtaque;

public class Cavaleiro extends Personagem{
    int armadura;
    int danoReduzido;
    int danoVida;

    public Cavaleiro(String nome){
        super(nome);
        this.armadura = 30;
    }

    @Override
    public void receberDano(int dano){
        danoReduzido = (int)(dano*0.4);
        danoVida = (int)(dano*0.6);
        armadura -= danoReduzido;
        System.out.println("A armadura absorveu 40% do dano! Dano absorvido: " + danoReduzido);
        super.receberDano(danoVida);
    }

    public void atacar(Personagem alvo){
        System.out.println("\n🤺 " + this.getNome() + " atacou " + alvo.getNome() + "!");
        alvo.receberDano(10);
    }
}
