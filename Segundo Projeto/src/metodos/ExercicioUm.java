package metodos;

import java.util.Scanner;

public class ExercicioUm{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String senha = "";

        System.out.println("""
                ---Verificador de Senhas---
                Critérios:
                - Mínimo de 8 caracteres
                - Pelo menos uma letra maiúscula
                - Pelo menos uma letra minúscula
                - Pelo menos um número
                - Pelo menos um caractere especial (por exemplo, !@#$%^~&*)
                """);
        System.out.println("Digite sua senha: ");
        senha = teclado.nextLine();

        try{
            if( caracteres(senha) &&
                maiuscula(senha) &&
                minuscula(senha) &&
                numeros(senha) &&
                caractereEspecial(senha)
            ){
                System.out.println("Sua senha atendeu todos os critérios para a criação de uma senha forte! Anote em algum lugar e não esqueça!");
            }

        }catch (NullPointerException e){
            throw new NullPointerException("Ocorreu um erro ao executar o método pois a String é igual a null. Motivo: " + e.getMessage());
        }
    }

    public static boolean caracteres(String senha){
        if(senha.length() < 8){
            System.out.println("Sua senha deve possuir, no mínimo, 8 caracteres!");
            return false;
        }else{
            return true;
        }
    }

    public static boolean maiuscula(String senha){
        char texto;
        boolean verificador = false;

        for(int i = 0; i<senha.length(); i++){
            texto = senha.charAt(i);

            if(Character.isUpperCase(texto)){
                verificador = true;
                break;
            }
        }

        if(!verificador){
            System.out.println("Sua senha não possui caracteres maiúsculos!");
        }

        return verificador;
    }

    public static boolean minuscula(String senha){
        char texto;
        boolean verificador = false;

        for(int i = 0; i<senha.length(); i++){
            texto = senha.charAt(i);

            if(Character.isLowerCase(texto)){
                verificador = true;
                break;
            }
        }

        if(!verificador){
            System.out.println("Sua senha não possui caracteres minúsculos!");
        }

        return verificador;
    }

    public static boolean numeros(String senha){
        boolean verificador = false;
        char texto;

        for(int i = 0; i < senha.length(); i++){
            texto = senha.charAt(i);

            if (Character.isDigit(texto)){
                verificador = true;
                break;
            }
        }
        if(!verificador){
            System.out.println("Sua senha não possui números!");
        }

        return verificador;
    }

    public static boolean caractereEspecial(String senha){
        String especiais = "!@#$%^&*()´ç`.,<>{}?";
        boolean verificador = false;

        for(int i=0; i<senha.length(); i++){
            if(especiais.contains(String.valueOf(senha.charAt(i)))){
                verificador = true;
                break;
            }
        }
        if(!verificador){
            System.out.println("Sua senha não possui caracteres especiais!");
        }

        return verificador;
    }
}
