import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Número de um dia da semana entre 1 e 7: ");
        int semana = entrada.nextInt();

        switch (semana) {

            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número incorreto.");
        }

        entrada.close();
    }
}
