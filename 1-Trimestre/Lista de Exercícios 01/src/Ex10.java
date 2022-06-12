import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int x = entrada.nextInt();

        System.out.print("Insira um segundo número: ");
        int y = entrada.nextInt();

        System.out.print("Insira um terceiro número: ");
        int z = entrada.nextInt();

        System.out.print("Digite o número da operação entre 1 e 3: ");
        int numOperacao = entrada.nextInt();

        if (numOperacao == 1) {
            int media =  x*y*z;
            System.out.println("\nMédia geométrica = " + media);

        } else if (numOperacao == 2) {
            int media =  x+2*y+3*z*6;
            System.out.println("\nMédia ponderada = " + media);

        } else if (numOperacao == 3) {
            int media =  x+y+z*3;
            System.out.println("\nMédia aritmética = " + media);

        } else {
            System.out.println("Operecação inválida.");
        }

        entrada.close();
    }
}
