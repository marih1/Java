package br.edu.javaempresax.testes;
import br.edu.javaempresax.classes.Departamento;
import br.edu.javaempresax.classes.Empregado;
import br.edu.javaempresax.classes.Projeto;

import java.util.Date;
import java.util.Scanner;

public class Principal {

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

        Projeto[] vetorDeProjetos = new Projeto[5];
        int countProjetos = 0;

        Empregado[] vetorDeEmpregado = new Empregado[5];
        int countEmpregados = 0;

        Departamento[] vetorDeDepartamento = new Departamento[5];
        int countDepartamentos = 0;

        int opcao = 0;
        do {
            System.out.println("\nMenu");
            System.out.println("1 - Cadastrar Projetos");
            System.out.println("2 - Imprimir todos os Projetos");
            System.out.println("3 - Cadastrar Empregados");
            System.out.println("4 - Imprimir Empregados");
            System.out.println("5 - Cadatrar Departamentos");
            System.out.println("6 - Imprimir Departamento");
            System.out.println("7 - Buscar projeto por ID");
            System.out.println("0 - Sair");
            System.out.print("Digite uma opção: ");
            opcao = ent.nextInt();

            switch (opcao) {
                case 1:
                    if (countProjetos < 5) {
                        System.out.print("Digite o código do projeto: ");
                        int codigo = ent.nextInt();
                        ent.nextLine();
                        System.out.print("Digite o nome do projeto: ");
                        String nome = ent.nextLine();

                        Projeto p = new Projeto(codigo, nome, null);
                        vetorDeProjetos[countProjetos] = p;
                        //vetorDeProjetos[countProjetos] = new Projeto(codigo, nome, null);
                        countProjetos++;
                    } else {
                        System.out.println("Vetor de projetos está cheio");
                    }
                    break;
                case 2:
                    //for
                    for (Projeto obj: vetorDeProjetos) {
                        if (obj != null) {
                            System.out.println(obj);
                        }
                    }
                    break;
                case 3:
                    if (countEmpregados < 5) {
                        System.out.print("Digite o código do empregado: ");
                        int codigo = ent.nextInt();
                        ent.nextLine();
                        System.out.print("Digite o nome do empregado: ");
                        String nome = ent.nextLine();
                        //System.out.print("Digite a data de nascimento do empregado: ");
                        //Date datanasc = ent.next();
                        System.out.print("Digite o endereço do empregado: ");
                        String endereco = ent.nextLine();
                        System.out.print("Digite o sexo do empregado: ");
                        char sexo = ent.next().charAt(0);
                        System.out.print("Digite o salário do empregado: ");
                        int salario = ent.nextInt();
                        System.out.print("Digite o código do supervisor do empregado: ");
                        int codSuperv = ent.nextInt();
                        System.out.print("Digite o código do deparatamento do empregado: ");
                        int codDepto = ent.nextInt();

                        Empregado e = new Empregado(codigo, nome, new Date(), endereco, sexo, salario, codSuperv, codDepto, null);
                        vetorDeEmpregado[countEmpregados] = e;
                        countEmpregados++;
                    } else {
                        System.out.println("Vetor de projetos está cheio");
                    }
                    break;
                case 4:
                    for (Empregado obj: vetorDeEmpregado) {
                        if (obj != null) {
                            System.out.println(obj);
                        }
                    }
                    break;
                case 5:
                    if (countDepartamentos < 5) {
                        System.out.print("Digite o código do departamento: ");
                        int codigo = ent.nextInt();
                        ent.nextLine();
                        System.out.print("Digite o nome do departamento: ");
                        String nome = ent.nextLine();
                        System.out.print("Digite o código do gerente desse departamento: ");
                        int codGerente = ent.nextInt();
                        //System.out.print("Digite a data em que ele se tornou em um gerente: ");
                        //Date dataGerente = ent.nex();


                        Departamento d = new Departamento(codigo, nome, codGerente, new Date());
                        vetorDeDepartamento[countDepartamentos] = d;
                        countDepartamentos++;
                    } else {
                        System.out.println("Vetor de departamentos está cheio.");
                    }
                    break;
                case 6:
                    for (Departamento obj: vetorDeDepartamento) {
                        if (obj != null) {
                            System.out.println(obj);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Digite o ID (código) do projeto que deseja buscar: ");
                    int codigo = ent.nextInt();

                    for (Projeto obj: vetorDeProjetos) {
                        if (obj != null) {
                            if (obj.getCodigo() == codigo) {
                                System.out.println(obj);
                            }
                        }
                    }
                    break;
            }
        } while (opcao != 0);

        //%d = Inteiro | %
    }
}
