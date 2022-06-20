package Ex10;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        Conta c = new Conta();
        int opcao = 0;

        do {

            System.out.println("\nDigite 1 para verificar o saldo da sua conta.");
            System.out.println("Digite 2 para depositar na sua conta.");
            System.out.println("Digite 3 para sacar.");
            System.out.println("Digite 0 para encerrar o programa.");
            opcao = ent.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("\nO saldo da sua conta é de %d.", c.getSaldo());
                    break;
                case 2:
                    System.out.print("\nDigite a quantia que deseja depositar: ");
                    int deposito = ent.nextInt();
                    c.depositar(deposito);
                    break;
                case 3:
                    System.out.print("\nDigite a quantia que deseja sacar: ");
                    int saque = ent.nextInt();
                    c.sacar(saque);
                    break;
            }

        } while (opcao != 0);
    }
}
