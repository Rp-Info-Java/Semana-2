package orientacaoObjetos.polimorfismo;

public class Galo extends Animal{
    public Galo(String nome){
        super(nome);
    }

    @Override
    void emitirSom(){
        System.out.println("O galo cacareja.\n");
    }
}
