package Ex08;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        Contador c = new Contador();

        int opcao = 0;

        do {

            System.out.println("\nDigite 1 para realizar contagem: ");
            System.out.println("Digite 2 para incrementar o contador em uma unidade: ");
            System.out.println("Digite 3 para zerar o contador: ");
            opcao = ent.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira a data do evento em ano: ");
                    int ano = ent.nextInt();
                    System.out.println("Insira a até quando irá ocorrer esse evento em ano: ");
                    int anoA = ent.nextInt();
                    System.out.println("Número de vezes que esse evento irá ocorrer no ano: ");
                    int repeticao = ent.nextInt();

                    c.setContagem((anoA - ano) * repeticao);
                    System.out.println("Contagem: " + c.getContagem());
                    break;
                case 2:
                    c.incrementarContador();
                    System.out.println("Contagem: " + c.getContagem());
                    break;
                case 3:
                    c.zerarContador();
                    System.out.println("Contagem: " + c.getContagem());
                    break;
                case 4:
                    System.out.println("Contagem: " + c.getContagem());
                    break;
            }

        } while (opcao != 0);
    }
}
