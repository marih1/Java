import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("CALCULADORA");

        System.out.print("\nDigite um número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite um segundo número: ");
        int num2 = entrada.nextInt();

        System.out.print("Operação +, -, * ou / : ");
        char operacao = entrada.next().charAt(0);

        if (operacao == '+') {
            int result = (num1 + num2);
            System.out.println("Resultado: " + result);

        } else if (operacao == '-') {
            int result = (num1 - num2);
            System.out.println("Resultado: " + result);

        } else if (operacao == '*') {
            int result = (num1 * num2);
            System.out.println("Resultado: " + result);

        } else if (operacao == '/') {
            int result = (num1 / num2);
            System.out.println("Resultado: " + result);
        }

        entrada.close();
    }
}