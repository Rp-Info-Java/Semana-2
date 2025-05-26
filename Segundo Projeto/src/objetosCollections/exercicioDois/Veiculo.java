package objetosCollections.exercicioDois;

public class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirInformacoes(){
        System.out.println("Marca: " + marca + "\nModelo: " + modelo);
    }
}
