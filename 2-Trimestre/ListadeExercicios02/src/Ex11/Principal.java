package Ex11;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        Elevador e = new Elevador();
        int opcao = 0;

        System.out.print("Insira a capacidade máxima de pessoas do elevador: ");
        int capacidade = ent.nextInt();
        e.setCapacidade(capacidade);

        System.out.print("Insira o número de andares do prédio: ");
        int andares = ent.nextInt();
        e.setTotalDeAndares(andares);

        do {
            System.out.println("\n\nDigite 1 para verificar o andar atual.");
            System.out.println("Digite 2 para verificar a quantidade de pessoas no elavador e sua capacidade máxima.");
            System.out.println("Digite 3 para entrar no elevador.");
            System.out.println("Digite 4 para sair do elevador.");
            System.out.println("Digite 5 para subir um andar.");
            System.out.println("Digite 6 para descer um andar.");
            opcao = ent.nextInt();

            switch (opcao) {
                case 1:
                    if (e.getAndar() == 0) {
                        System.out.println("\nO andar altual é o térreo.");
                    } else {
                        System.out.printf("\nO andar altual é %d.", e.getAndar());
                    }
                    break;
                case 2:
                    System.out.printf("\nHá %d pessoas e a capidade máxima é de %d.", e.getPessoas(), e.getCapacidade());
                    break;
                case 3:
                    e.entrar();
                    System.out.printf("\nNúmero atual de pessoas: %d", e.getPessoas());
                    break;
                case 4:
                    e.sair();
                    System.out.printf("\nNúmero atual de pessoas: %d", e.getPessoas());
                    break;
                case 5:
                    e.subir();
                    System.out.printf("\nAndar atual: %d", e.getAndar());
                    break;
                case 6:
                    e.descer();
                    if (e.getAndar() == 0) {
                        System.out.println("\nO andar altual: térreo");
                    } else {
                        System.out.printf("\nO andar altual: %d", e.getAndar());
                    }
                    break;
            }

        } while (opcao != 0);
    }
}
