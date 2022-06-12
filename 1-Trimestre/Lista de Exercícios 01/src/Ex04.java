import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        float salario = entrada.nextFloat();

        System.out.print("Valor da prestação de um empréstimo: ");
        float prestacao = entrada.nextFloat();

        if ( prestacao > salario*0.2) {
            System.out.println("Empréstimo não concedido.");
        } else {
            System.out.println("Empréstimo concedido.");
        }

        entrada.close();
    }
}
