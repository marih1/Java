import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = ent.nextInt();

        int f = 1;

        if (num > 0) {
            for (int i = 1; i < num; i++) {
                f = f * (i+1);
            }
            System.out.println(f);

        } else if (num == 0) {
            f = 1;
            System.out.println(f);

        } else {
            System.out.println("Fatorial inexistente.");
        }
    }
}
