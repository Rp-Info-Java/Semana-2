package orientacaoObjetos.abstracao;

class Boleto extends Pagamento{
    public void validacao(){
        System.out.println("Validando os dados do boleto antes do processamento.");
    }
    public void processar(){
        System.out.println("Processando pagamento do boleto.");
    }
}
