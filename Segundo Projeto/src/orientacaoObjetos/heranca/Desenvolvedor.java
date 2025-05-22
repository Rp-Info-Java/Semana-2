package orientacaoObjetos.heranca;

public class Desenvolvedor extends Funcionario{

    Desenvolvedor(String nome){
        super(nome);
    }

    @Override
    public void calcularSalario(){
        this.salarioBase += 0.1*salarioBase;
    }

    void exibirSalario(){
        System.out.println("Salário do desenvolvedor: R$ " + this.salarioBase);
    }
}
