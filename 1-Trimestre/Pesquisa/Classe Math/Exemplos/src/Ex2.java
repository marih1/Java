import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite um número:");
        int num1 = ent.nextInt();

        System.out.print("Digite um segundo número:");
        int num2 = ent.nextInt();

        int result = Math.max(num1, num2);

        System.out.println("O maior número é o " + result);

        ent.close();
    }
}
