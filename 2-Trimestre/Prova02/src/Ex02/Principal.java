package Ex02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Agenda agenda = new Agenda();

        Agenda[] vetorAgenda = new Agenda[10];
        int countAgenda = 0;

        int opcao = 0;

        do {
            System.out.println("\n1 - Adicionar contato");
            System.out.println("2 - Buscar contato por ID");
            System.out.println("3 - Remover contato");
            System.out.println("4 - Editar contato");
            System.out.println("0 - Encerrar programa");
            opcao = ent.nextInt();
            ent.nextLine();

            switch (opcao) {
                case 1:
                    if (countAgenda < vetorAgenda.length) {
                        boolean idExiste;
                        int id;

                        do {
                            idExiste = false;
                            System.out.print("\nCadastre o ID: ");
                            id = ent.nextInt();

                            for (int i = 0; i < vetorAgenda.length; i++) {
                                if (vetorAgenda[i] != null && vetorAgenda[i].getId() == id) {
                                    idExiste = true;
                                    System.out.printf("O ID %d já existe", id);
                                }
                            }
                        } while (idExiste == true);


                        ent.nextLine();
                        System.out.print("\nCadastre o nome: ");
                        String nome = ent.nextLine();
                        System.out.print("\nCadastre o telefone: ");
                        int tel = ent.nextInt();
                        ent.nextLine();
                        System.out.print("\nCadastre o e-mail: ");
                        String email = ent.nextLine();

                        vetorAgenda[countAgenda] = new Agenda(id, nome, tel, email);
                        countAgenda++;
                    }
                    break;

                case 2:
                    System.out.print("\nInforme o ID: ");
                    int id = ent.nextInt();
                    boolean temAgenda = false;

                    for (int i = 0; i < vetorAgenda.length; i++) {
                        if (vetorAgenda[i] != null && vetorAgenda[i].getId() == id) {
                            System.out.println(vetorAgenda[i]);
                            temAgenda = true;
                        }
                    }
                    if (temAgenda == false) {
                        System.out.println("Esse ID não está cadastrado.");
                    }
                    break;

                case 3:
                    System.out.print("\nInforme o ID: ");
                    id = ent.nextInt();
                    temAgenda = false;

                    for (int i = 0; i < vetorAgenda.length; i++) {
                        if (vetorAgenda[i] != null && vetorAgenda[i].getId() == id) {
                            vetorAgenda[i] = new Agenda();
                            System.out.println("Contato removido");
                            temAgenda = true;
                        }
                    }
                    if (temAgenda == false) {
                        System.out.println("Esse ID não está cadastrado.");
                    }
                    break;
                case 4:
                    System.out.print("\nInforme o ID: ");
                    id = ent.nextInt();
                    temAgenda = false;

                    for (int i = 0; i < vetorAgenda.length; i++) {
                        if (vetorAgenda[i] != null && vetorAgenda[i].getId() == id) {

                            ent.nextLine();
                            System.out.print("\nEdite o nome: ");
                            String nome = ent.nextLine();
                            System.out.print("\nEdite o telefone: ");
                            int tel = ent.nextInt();
                            ent.nextLine();
                            System.out.print("\nEdite o e-mail: ");
                            String email = ent.nextLine();

                            vetorAgenda[i] = new Agenda(id, nome, tel, email);
                            temAgenda = true;
                        }
                    }
                    if (temAgenda == false) {
                        System.out.println("Esse ID não está cadastrado.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
            }
        } while (opcao != 0);
    }
}
