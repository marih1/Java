import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite um número qualquer: ");
        double num1 = ent.nextDouble();

        System.out.print("Digite um segundo número qualquer: ");
        double num2 = ent.nextDouble();

        System.out.print("Digite um terceiro número qualquer: ");
        double num3 = ent.nextDouble();

        if (num1 > num2  && num1 > num3) {
            if (num2 > num3){
                System.out.println("Maior número: " + num1);
                System.out.println("Menor número " + num3);
            } else {
                System.out.println("Maior número: " + num1);
                System.out.println("Menor número " + num2);
            }
        } else if (num2 > num1  && num2 > num3) {
            if (num1 > num3){
                System.out.println("Maior número: " + num2);
                System.out.println("Menor número " + num3);
            } else {
                System.out.println("Maior número: " + num2);
                System.out.println("Menor número " + num1);
            }
        } else if (num3 > num1  && num3 > num2) {
            if (num1 > num3){
                System.out.println("Maior número: " + num3);
                System.out.println("Menor número " + num3);
            } else {
                System.out.println("Maior número: " + num3);
                System.out.println("Menor número " + num1);
            }
        }
        
/*
        if (num1 > num2) {
            if (num1 > num3){
                System.out.println("Maior número: " + num1);
                if (num2 > num3) {
                    System.out.println("Menor número: " + num3);
                } else {
                    System.out.println("Menor número: " + num2);
                }
            } else {
                System.out.println("Maior número: " + num3);
                if (num2 > num3) {
                    System.out.println("Menor número: " + num3);
                } else {
                    System.out.println("Menor número: " + num2);
                }
            }
        } else if (num2 > num1) {
            if (num2 > num3){
                System.out.println("Maior número: " + num2);
                if (num1 > num3) {
                    System.out.println("Menor número: " + num3);
                } else {
                    System.out.println("Menor número: " + num1);
                }
            } else {
                System.out.println("Maior número: " + num3);
                if (num1 > num3) {
                    System.out.println("Menor número: " + num3);
                } else {
                    System.out.println("Menor número: " + num1);
                }
            }
        } else {
            System.out.println("Maior número: " + num3);
            if (num2 > num1) {
                System.out.println("Menor número: " + num1);
            } else {
                System.out.println("Menor número: " + num2);
            }
        }
*/

        ent.close();
    }
}
