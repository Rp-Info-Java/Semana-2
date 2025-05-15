package metodos;
import java.util.Arrays;
import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        do{
            System.out.println("Digite um número inteiro entre 1 e 3999: ");
            num = teclado.nextInt();

            if(num < 1 || num > 3999){
                System.out.println("O número digitado está fora do escopo solicitado. Por favor, digite um número válido entre 1 e 3999: \n");
            }
        }while (num < 1 || num > 3999);

        romano(num);
        /*int num2 = 1278;
        System.out.println("Num unidade: " + num2%10);
        System.out.println("Num Dezena: " + ((num/10)%10)*10);
        System.out.println("Num cent: " + (num2/100)%10);
        System.out.println("Num milha: " + num2/1000);*/
    }

    public static void romano(int num){
        String  numero = "", numDez = "", numCent = "", numMilha = "";

        if(num < 10){
            numero = unidades(num);
            System.out.println("Número em unidade em Romano: " + numero);
            //Podemos fazer dentro do for o print pois, como num é <10, ele jamais será dois números ao mesmo tempo

        }else if(num >= 10 && num <= 99){
            numDez = dezenas(num);
            System.out.println("Numero em dezenas em Romano: " + numDez);

        }else if (num >= 100 && num < 1000){
            numCent = centenas(num);
            System.out.println("Numero em centenas em Romano: " + numCent);

        }else if (num >= 1000 && num <= 3999){
            numMilha = milhares(num);
            System.out.println("Número em milhares em Romano: " + numMilha);
        }
    }
    public static String unidades(int num){
        String[] unidadesRom = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String numero = "";

        try{
            for(int i = 0; i < unidadesRom.length; i++){
                if(num == i + 1){
                    numero = unidadesRom[i];
                }
            }
            return numero;
        }catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    public static String dezenas(int num){
        String[] dezenasRom = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String  numero = "", numDez = "";

        try{
            for(int i = 0; i < dezenasRom.length; i++){
                if(num % 10 == i + 1) {
                    numero = unidades(num % 10);
                }
                if(num / 10 == i + 1){
                    numDez = dezenasRom[i];
                }
            }

            return (numDez + numero);
        }catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    public static String centenas(int num){
        String[] centenasRom = {"C", "CC", "CCC", "CD", "D" , "DC", "DCC", "DCCC", "CM"};
        String  numero = "", numDez = "", numCent = "";

        try{
            for(int i = 0; i < centenasRom.length; i++){
                if(num % 10 == i + 1) {
                    numero = unidades(num % 10);
                }
                if((num/10)%10 == i + 1){
                    numDez = dezenas(((num/10)%10)*10);
                }
                if(num/100 == i + 1){
                    numCent = centenasRom[i];
                }
            }

            return (numCent + numDez + numero);
        }catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    public static String milhares(int num){
        String[] milharesRom = {"M", "MM", "MMM"};
        String  numero = "", numDez = "", numCent = "", numMilha = "";

        try{
            for(int j = 0; j < milharesRom.length; j++){
                if(num/1000 == j+ 1){
                    numMilha = milharesRom[j];
                }
            }
            for(int i = 0; i < 9; i++){
                if(num % 10 == i + 1) {
                    numero = unidades(num % 10);
                }
                if((num/10)%10 == i + 1){
                    numDez = dezenas(((num/10)%10)*10);
                }
                if((num/100)%10 == i + 1){
                    numCent = centenas(((num/100)%10)*100);
                }
            }

            return (numMilha + numCent + numDez + numero);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
