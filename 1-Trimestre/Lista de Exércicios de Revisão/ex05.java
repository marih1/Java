package Lista_01;

import java.util.Scanner;

public class ex05 {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        double cotDolar, valDolar, valReal;
        
        System.out.println("Digite a cotação do dolar:");
        cotDolar = entrada.nextDouble();

        System.out.println("Digite o valor em dolar:");
        valDolar = entrada.nextDouble();

        valReal = cotDolar*valDolar;

        System.out.println("O valor em reais é de R$" + valReal);
    }
}
