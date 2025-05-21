package orientacaoObjetos.abstracao;

class CartaoCredito extends Pagamento{
    public void validacao(){
        System.out.println("Validando os dados do cartão antes do processamento.");
    }
    public void processar(){
        System.out.println("Processando dados do cartão para o pagamento.");
    }
}
