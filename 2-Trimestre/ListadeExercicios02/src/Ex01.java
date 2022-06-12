import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("Digite um número qualquer entre 0 e 500: ");
        float num = ent.nextFloat();

        if (num >= 0 && num <= 500) {
            if (num >= 100 && num <= 200) {
                System.out.println("Você digitou um número entre 100 e 200");
            } else {
                System.out.println("Você digitou um número fora da faixa");
            }
        } else {
            System.out.println("Você digitou um número fora da faixa");
        }

    }
}
