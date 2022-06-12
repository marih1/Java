import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = entrada.nextDouble();

        if (num > 0) {
            System.out.println("O quadrado do número " + num + " é: " + num * num);

            double raiz = Math.sqrt(num);
            System.out.println("A raiz do número " + num + " é: " + raiz);
        }

        entrada.close();
    }
}