import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = entrada.nextInt();

        if (num % 3 == 0 && num % 5 != 0) {
            System.out.println(num + " é divisível por 3.");

        } else if (num % 5 == 0 && num % 3 != 0) {
            System.out.println(num + " é divisível por 5.");
        }

        entrada.close();
    }
}
