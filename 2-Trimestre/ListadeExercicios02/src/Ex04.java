import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = ent.nextInt();

        int countNum = 0;

        for (int i = 1; countNum <= 20; i++) {
            if (num % i == 0 && i > 0) {
                System.out.printf(i + " ");
                countNum++;
                if (i == num) {
                    countNum = 21;
                }
            }
        }
    }
}
