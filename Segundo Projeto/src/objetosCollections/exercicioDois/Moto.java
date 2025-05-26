package objetosCollections.exercicioDois;

public class Moto extends Veiculo{
    int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }
    @Override
    public void exibirInformacoes(){
        System.out.println("\n[MOTO]");
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + cilindradas + "cc");
    }
}
