import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira a sua idade: ");
        int idade = entrada.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Classificação: Infantil A");

        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Classificação: Infantil B");

        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Classificação: Juvenil A");

        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Classificação: Juvenil B");

        } else if (idade >= 18) {
            System.out.println("Classificação: Sênior");

        } else {
            System.out.println("Sem categoria.");
        }

        entrada.close();
    }
}
