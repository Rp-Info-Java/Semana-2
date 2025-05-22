package orientacaoObjetos.polimorfismo;

public class Cachorro extends Animal{
    public Cachorro(String nome){
        super(nome);
    }

    @Override
    void emitirSom(){
        System.out.println("O cachorro late.\n");
    }
}
