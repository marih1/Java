import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = ent.nextInt();

        int x = 0;

        for (int i=1; x <= 20; i++) {
            if (num % i == 0) {
                x++;
                System.out.print(i + ", ");
            }
        }
    }
}
