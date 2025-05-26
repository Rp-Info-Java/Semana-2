package objetosCollections.exercicioDois;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList <Veiculo> veiculos = new ArrayList<>();
        Carro carro1 = new Carro("Honda", "Civic", "Flex");
        Carro carro2 = new Carro("Fiat", "147", "Álcool");
        Moto moto1 = new Moto("Yamaha", "MT-03", 321);
        Moto moto2 = new Moto("Suzuki", "Intruder", 125);

        veiculos.add(carro1);
        veiculos.add(carro2);
        veiculos.add(moto1);
        veiculos.add(moto2);

        for (Veiculo veiculo : veiculos){
            veiculo.exibirInformacoes();
        }
    }
}
