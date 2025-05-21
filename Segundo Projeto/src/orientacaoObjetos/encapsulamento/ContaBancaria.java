package orientacaoObjetos.encapsulamento;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public void ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        System.out.println("\nConta de " + this.titular);
        System.out.println("Saldo: R$ " + this.saldo);
        System.out.println("Depósito: R$" + valor);

        this.saldo += valor;

        System.out.println("Seu saldo atual, após o depósito é de: R$ " + this.saldo);
    }

    public void sacar(double valor){
        System.out.println("\nConta de " + this.titular);
        System.out.println("Saldo: R$ " + this.saldo);

        if(this.saldo > 0 && this.saldo > valor){
            this.saldo -= valor;

            System.out.println("Seu saldo atual, após o saque é: R$ " + this.saldo);
            System.out.println("Dinheiro sacado: R$ " + valor);
        }else{
            System.out.println("Saldo insuficiente para o saque de R$ " + valor + ".");
        }


    }
}
