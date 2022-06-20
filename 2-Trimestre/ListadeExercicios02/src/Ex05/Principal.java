package Ex05;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        Agenda[] agenda = new Agenda[10];
        int countAgendas = 0;

        int opcao = 0;

        do {

            System.out.println("\nDigite 1 para adicionar contato.");
            System.out.println("Digite 2 para buscar contato.");
            System.out.println("Digite 3 para remover contato.");
            System.out.println("Digite 4 para editar o contato.");
            System.out.println("Digite 0 para encerrar o programa.");
            opcao = ent.nextInt();
            ent.nextLine();

            switch (opcao) {
                case 1:
                    if (countAgendas < agenda.length) {
                        System.out.print("\nDigite o nome: ");
                        String nome = ent.nextLine();
                        System.out.print("Digite o número: ");
                        int contato = ent.nextInt();

                        Agenda a = new Agenda(nome, contato);
                        agenda[countAgendas] = a;
                        countAgendas++;
                    }
                    break;
                case 2:
                    System.out.print("\nDigite o contato: ");
                    int contato = ent.nextInt();

                    for (Agenda obj: agenda) {
                        if (obj != null) {
                            if (obj.getContato() == contato) {
                                System.out.println(obj);

                            } else {
                                System.out.println("Contato não encontrado.");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.print("\nDigite o contato: ");
                    contato = ent.nextInt();

                    for (int i = 0; i < agenda.length; i++) {
                        if (agenda[i] != null) {
                            if (agenda[i].getContato() == contato) {
                                agenda[i] = null;
                                //obj = null;
                                //obj = new Agenda();
                                i = agenda.length;
                            }
                        } else {
                            System.out.println("Contato não encontrado.");
                            i = agenda.length;
                        }
                    }
                    break;
                case 4:
                    System.out.print("\nDigite o número do contato que deseja editar: ");
                    contato = ent.nextInt();
                    ent.nextLine();

                    for (Agenda obj: agenda) {
                        if (obj != null) {
                            if (obj.getContato() == contato) {
                                System.out.print("O que deseja editar: nome, numero ou ambos ");
                                String editar = ent.nextLine();

                                switch (editar) {
                                    case "nome":
                                        System.out.print("\nDigite o novo nome: ");
                                        String nome = ent.nextLine();
                                        obj.setNome(nome);

                                    case "numero":
                                        System.out.print("\nDigite o novo numero: ");
                                        nome = ent.nextLine();
                                        obj.setContato(contato);

                                    case "ambos":
                                        System.out.print("\nDigite o novo nome: ");
                                        nome = ent.nextLine();
                                        System.out.print("Digite o novo numero: ");
                                        contato = ent.nextInt();
                                        obj.setNome(nome);
                                        obj.setContato(contato);
                                }
                            } else {
                                System.out.println("Contato não encontrado.");
                            }
                        }
                    }
                    break;
            }

        } while (opcao != 0);
    }
}
