package Ex09;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        Lampada l = new Lampada();
        int opcao = 0;

        do {

            System.out.println("\nDigite 1 para verificar o estado da lâmpada");
            System.out.println("Digite 2 para acender a lampada");
            System.out.println("Digite 3 para apagar a lampada");
            System.out.println("Digite 0 para sair do programa");
            opcao = ent.nextInt();

            switch (opcao) {
                case 1:
                    l.estado();
                    break;
                case 2:
                    l.setLigado(true);
                    break;
                case 3:
                    l.setLigado(false);
                    break;
            }

        } while (opcao != 0);
    }
}
