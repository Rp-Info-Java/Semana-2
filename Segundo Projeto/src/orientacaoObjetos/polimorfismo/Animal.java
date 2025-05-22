package orientacaoObjetos.polimorfismo;

public abstract class Animal {
    String nome;

    Animal(String nome){
        this.nome = nome;
    }

    void emitirSom(){
        System.out.println("Som genérico de animal.\n");
    }

    String getNome(){
        return nome;
    }
}
