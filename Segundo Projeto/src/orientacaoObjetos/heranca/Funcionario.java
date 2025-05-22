package orientacaoObjetos.heranca;

public abstract class Funcionario {
    String nome;
    double salarioBase;

    public Funcionario(String nome){
        this.nome = nome;
        salarioBase = 5000.00;
    }

    public abstract void calcularSalario();
    void exibirNome(){
        System.out.println("Nome do funcionário: " + nome);
    }
}
