import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("Digite um número qualquer: ");
        int num = ent.nextInt();

        int f = 1;

        for (int i = 1; i < num; i++) {
            f = f * (i+1);
        }

        System.out.println(f);
    }
}
