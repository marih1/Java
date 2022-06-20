import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int count = 0;

        int soma = 0;
        int numero = 0;

        for (int i=0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numero = ent.nextInt();

            if (numero > 0 && numero % 3 == 0) {
                soma = soma + numero;
                count++;

            } else {
                System.out.println("\nNúmero não divisível por 3");
            }
        }
        int media = soma / count;
        System.out.printf("\nA média dos números é %d", media);
    }
}
