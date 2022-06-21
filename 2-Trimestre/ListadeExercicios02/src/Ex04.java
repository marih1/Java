import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = ent.nextInt();

        int[] abc = new int[20];
        int count = 0;

        for (int i = 1; i <= abc.length && i <= num; i++) {
            if (num % i == 0 && i > 0) {
                abc[count] = i;
                System.out.println(abc[count]);
                count++;
            }
        }
    }
}
