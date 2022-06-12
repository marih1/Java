import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        Double h = entrada.nextDouble();

        System.out.print("Digite o seu sexo, F ou M : ");
        char sexo = entrada.next().charAt(0);
        
        if (sexo == 'M') {
            double pesoIdeal = (72.2*h) - 58;
            System.out.println("O peso ideal para a sua altura é de : " + pesoIdeal);
        } else {
            double pesoIdeal = (62.1*h) - 44.7;
            System.out.println("O peso ideal para a sua altura é de : " + pesoIdeal);
        }

        entrada.close();
    }
}
