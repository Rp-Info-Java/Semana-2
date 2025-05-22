package orientacaoObjetos.polimorfismo;

public class Gato extends Animal{
    public Gato(String nome){
        super(nome);
    }

    @Override
    void emitirSom(){
        System.out.println("O gato mia.\n");
    }
}
