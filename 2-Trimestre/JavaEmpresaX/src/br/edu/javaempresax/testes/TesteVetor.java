package br.edu.javaempresax.testes;

import br.edu.javaempresax.classes.Projeto;

import java.util.Scanner;

public class TesteVetor {

    public static void main(String[] args) {

        /*Scanner ent = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanhoVetor = ent.nextInt();

        int[] vetorDeInteiros = new int[tamanhoVetor];
        vetorDeInteiros[0] = 1;
        vetorDeInteiros[1] = 2;
        vetorDeInteiros[2] = 3;
        vetorDeInteiros[3] = 4;
        vetorDeInteiros[4] = 5;

        System.out.print("Digite valores para o vetor");
        for (int i = 0; i < vetorDeInteiros.length; i++) {
            System.out.printf("\nVetor[%d] = %d ", i + 1, vetorDeInteiros[i]);
            vetorDeInteiros[i] = ent.nextInt();
        }

        for (int i = 0; i < vetorDeInteiros.length; i++) {
            System.out.println(vetorDeInteiros[i]);
        }*/

        Scanner ent = new Scanner(System.in);

        Projeto[] vetorDeProjetos = new Projeto[10];
        int countProjetos = 0;

        int opcao = 0;
        do {
            System.out.println("Menu");
            System.out.println("1 - Cadastrar Projetos");
            System.out.println("2 - Imprimir todos os Projetos");
            System.out.println("0 - Sair");
            System.out.println("Digite uma opção: ");
            opcao = ent.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o código do projeto: ");
                    int codigo = ent.nextInt();
                    System.out.println("Digite o npme do projeto: ");
                    String nome = ent.nextLine();
                    vetorDeProjetos[countProjetos] = new Projeto(codigo, nome, null);
                    countProjetos++;
                    break;
                case 2:
                    for (int i = 0;)
                    break;
            }
        } while (opcao != 0);
    }
}
