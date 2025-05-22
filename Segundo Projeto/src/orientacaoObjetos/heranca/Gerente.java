package orientacaoObjetos.heranca;

public class Gerente extends Funcionario{

    public Gerente(String nome){
        super(nome);
    }

    @Override
    public void calcularSalario(){
        this.salarioBase += 2000;
    }

    void exibirSalario(){
        System.out.println("Salário do gerente: R$" + this.salarioBase);
    }
}
