package objetosCollections.jogoAtaque;

public abstract class Personagem {
    private String nome;
    private int vida;

    public Personagem(String nome){
        this.nome = nome;
        vida = 100;
    }

    public abstract void atacar(Personagem alvo);

    public void receberDano(int dano){
        this.vida -= dano;
        System.out.println(this.nome + " recebeu " + dano + " de dano. Vida atual: " + this.vida);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
