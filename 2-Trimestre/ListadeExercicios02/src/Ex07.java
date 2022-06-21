import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("Digite o tamanho da lista: ");
        int tamanho = ent.nextInt();

        int[] lista = new int[tamanho];

        int s = 0;

        for (int i = 0; i < lista.length;) {
            System.out.println("Digite um número positivo divisível por 3: ");
            int num = ent.nextInt();
            if (num % 3 == 0 && num >= 0) {
                lista[i] = num;
                s += lista[i];
                i++;
            }
        }

        int resultado = s / lista.length;
        System.out.println(resultado);
    }
}
