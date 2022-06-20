import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("Digite um número qualquer entre 0 e 100: ");
        float num = ent.nextFloat();

        if (num >= 0 && num <= 100) {
            if (num % 2 == 0) {
                System.out.println("Número par");
            } else {
                System.out.println("Número ímpar");
            }
        }
    }
}
