package Lista_01;

import java.util.Scanner;

public class ex06 {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        double C, F;

        System.out.println("Digite a temperatura atual em graus Celcius:");
        C = entrada.nextDouble();

        F = C*(9/5)+32;

        System.out.println("A temperatura atual em Fahrenheits é de " + F);
    }
}
