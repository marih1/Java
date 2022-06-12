import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite um segundo número: ");
        int num2 = entrada.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " é maior que " + num2);
        } else if (num1 < num2){
            System.out.println(num2 + " é maior que " + num1);
        } else if (num1 == num2){
            System.out.println("Números iguais.");
        }

        entrada.close();
    }    
}
