import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite um número para a operação: ");
        double num1 = ent.nextDouble();

        System.out.print("Digite um segundo número para a operação: ");
        double num2 = ent.nextDouble();

        System.out.print("Digite a operação que deseja realizar, +, -, * ou /: ");
        char operacao = ent.next().charAt(0);

        double result;

        switch (operacao) {
            case '+':
                result = num1 + num2;
                System.out.println("Resultado: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Resultado: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Resultado: " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Resultado: " + result);
                break;
            default:
                System.out.println("Operação incorreta.");
        }

        ent.close();
    }
}
