package orientacaoObjetos.heranca;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        String nome = "", cargo = "";

        try{
            System.out.println("-Recursos Humanos-");
            System.out.println("Sistema de cálculo de salário");
            System.out.println("Salário Base: R$ 5000,00");
            System.out.println("Digite seu nome: ");
            nome = teclado.nextLine();

            System.out.println("-Cargos-\n" + "D- Desenvolvedor\n" + "G- Gerente\n" + "Digite seu cargo (D ou G):");
            cargo = teclado.nextLine();
        }catch(Exception e){
            throw new Exception("Algo deu errado. Erro: " + e);
        }

        if(cargo.equals("D") || cargo.equals("d")){
            Desenvolvedor dev = new Desenvolvedor(nome);
            dev.calcularSalario();
            dev.exibirNome();
            dev.exibirSalario();
        }else if (cargo.equals("G") || cargo.equals("g")){
            Gerente gerent = new Gerente(nome);
            gerent.calcularSalario();
            gerent.exibirNome();
            gerent.exibirSalario();
        }else{
            System.out.println("Caractere digitado não corresponde a nenhum cargo!\n");
        }
    }
}
