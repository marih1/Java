import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("Digite um número qualquer entre 0 e 100: ");
        float num = ent.nextFloat();

        int f = 1;

        for (int i = 1; i <= num; i++) {
            f = f * i;
        }

        System.out.println(f);
    }
}
