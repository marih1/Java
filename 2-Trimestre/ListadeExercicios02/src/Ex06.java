import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int[] num = new int[10];

        for (int i=0; i<10; i++) {
            System.out.print("\n\nDigite um número: ");
            num[i] = ent.nextInt();

            System.out.printf("A raiz de %d é igual a %f", num[i], Math.sqrt(num[i]));
        }
    }
}
