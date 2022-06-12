import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite um número qualquer: ");
        double num = ent.nextDouble();

        System.out.println("O módulo desse número é: " + Math.abs(num));

        ent.close();
    }
}
