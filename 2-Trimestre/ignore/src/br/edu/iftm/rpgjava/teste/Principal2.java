package br.edu.iftm.rpgjava.teste;

import br.edu.iftm.rpgjava.classes.Arqueiro;
import br.edu.iftm.rpgjava.classes.Guerreiro;
import br.edu.iftm.rpgjava.classes.Mago;

import java.util.Random;
import java.util.Scanner;

public class Principal2 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Crie dois personagens!!");

        //Primeiro personagem
        System.out.print("Qual a classe do primeiro personagem deseja escolher? ");
        char personagem = ent.next().charAt(0);

        System.out.print("Digite o nome do primeiro personagem: ");
        String nomePersonagem = ent.next();

        //Segundo personagem
        System.out.print("Qual a classe do segundo personagem deseja escolher? ");
        char personagem2 = ent.next().charAt(0);

        System.out.print("Digite o nome do segundo personagem: ");
        String nomePersonagem2 = ent.next();


        Guerreiro g = new Guerreiro(nomePersonagem, 50, 40, 25, 10, 15,
                30, 40, 45, 0, 5);
        Guerreiro g2 = new Guerreiro(nomePersonagem2, 50, 40, 25, 10, 15,
                30, 40, 45, 0, 5);

        Arqueiro a = new Arqueiro(nomePersonagem, 40, 50, 35, 20, 0,
                20, 30, 25, 35, 10);
        Arqueiro a2 = new Arqueiro(nomePersonagem2, 40, 50, 35, 20, 0,
                20, 30, 25, 35, 10);

        Mago m = new Mago(nomePersonagem, 10, 50, 5, 60, 0,
                15, 30, 10, 65, 70);
        Mago m2 = new Mago(nomePersonagem2, 10, 50, 5, 60, 0,
                15, 30, 10, 65, 70);


        //Combate
        Random dado = new Random();

        if (personagem == 'g' && personagem2 == 'g') {
            int round  = 1;
            while(g.getVida() > 0 && g2.getVida() > 0){
                System.out.println("Round: " + round);
                System.out.println("Oponente 1: " + g.getNome());
                System.out.println("Oponente 2: " + g2.getNome());

                //turno do guerreiro (g1)
                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = g.atacar(valorDado, g.getResistencia());
                g2.defender(valorAtaque);

                //turno do guerreiro 2 (g2)
                valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                valorAtaque = g2.atacar(valorDado, g2.getResistencia());
                g.defender(valorAtaque);

                //round = round +1
                round++;
            }

            if(g.getVida() <= 0){
                System.out.println("O gerreiro " + g2.getNome() + " foi campeão!!!" );
            }else if(g2.getVida() <= 0){
                System.out.println("O guerreiro " + g.getNome() + " foi campeão!!!");
            }

        } else if (personagem == 'g' && personagem2 == 'a') {
            int round  = 1;
            while(g.getVida() > 0 && a.getVida() > 0){
                System.out.println("Round: " + round);
                System.out.println("Oponente 1: " + g.getNome());
                System.out.println("Oponente 2: " + a.getNome());

                //turno do guerreiro (g1)
                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = g.atacar(valorDado, g.getResistencia());
                a.defender(valorAtaque);

                //turno do guerreiro 2 (g2)
                valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                valorAtaque = a.atacar(valorDado, a.getResistencia());
                g.defender(valorAtaque);

                //round = round +1
                round++;
            }

            if(g.getVida() <= 0){
                System.out.println("O gerreiro " + a.getNome() + " foi campeão!!!" );
            }else if(a.getVida() <= 0){
                System.out.println("O guerreiro " + g.getNome() + " foi campeão!!!");
            }

        } else if (personagem == 'g' && personagem2 == 'm') {
            int round  = 1;
            while(g.getVida() > 0 && m.getVida() > 0){
                System.out.println("Round: " + round);
                System.out.println("Oponente 1: " + g.getNome());
                System.out.println("Oponente 2: " + m.getNome());

                //turno do guerreiro (g1)
                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = g.atacar(valorDado, g.getResistencia());
                m.defender(valorAtaque);

                //turno do guerreiro 2 (g2)
                valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                valorAtaque = m.atacar(valorDado, m.getResistencia());
                g.defender(valorAtaque);

                //round = round +1
                round++;
            }

            if(g.getVida() <= 0){
                System.out.println("O gerreiro " + m.getNome() + " foi campeão!!!" );
            }else if(m.getVida() <= 0){
                System.out.println("O guerreiro " + g.getNome() + " foi campeão!!!");
            }

        } else if (personagem == 'a' && personagem2 == 'a') {
            int round  = 1;
            while(a.getVida() > 0 && a2.getVida() > 0){
                System.out.println("Round: " + round);
                System.out.println("Oponente 1: " + a.getNome());
                System.out.println("Oponente 2: " + a2.getNome());

                //turno do guerreiro (g1)
                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = a.atacar(valorDado, a.getResistencia());
                a2.defender(valorAtaque);

                //turno do guerreiro 2 (g2)
                valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                valorAtaque = a2.atacar(valorDado, a2.getResistencia());
                a.defender(valorAtaque);

                //round = round +1
                round++;
            }

            if(a.getVida() <= 0){
                System.out.println("O gerreiro " + a2.getNome() + " foi campeão!!!" );
            }else if(a2.getVida() <= 0){
                System.out.println("O guerreiro " + a.getNome() + " foi campeão!!!");
            }

        } else if (personagem == 'a' && personagem2 == 'm') {
            int round  = 1;
            while(a.getVida() > 0 && m.getVida() > 0){
                System.out.println("Round: " + round);
                System.out.println("Oponente 1: " + a.getNome());
                System.out.println("Oponente 2: " + m.getNome());

                //turno do guerreiro (g1)
                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = a.atacar(valorDado, a.getResistencia());
                m.defender(valorAtaque);

                //turno do guerreiro 2 (g2)
                valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                valorAtaque = m.atacar(valorDado, m.getResistencia());
                a.defender(valorAtaque);

                //round = round +1
                round++;
            }

            if(a.getVida() <= 0){
                System.out.println("O gerreiro " + m.getNome() + " foi campeão!!!" );
            }else if(m.getVida() <= 0){
                System.out.println("O guerreiro " + a.getNome() + " foi campeão!!!");
            }

        } else if (personagem == 'm' && personagem2 == 'm') {
            int round  = 1;
            while(m.getVida() > 0 && m2.getVida() > 0){
                System.out.println("Round: " + round);
                System.out.println("Oponente 1: " + m.getNome());
                System.out.println("Oponente 2: " + m2.getNome());

                //turno do guerreiro (g1)
                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = m.atacar(valorDado, m.getResistencia());
                m2.defender(valorAtaque);

                //turno do guerreiro 2 (g2)
                valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                valorAtaque = m2.atacar(valorDado, m2.getResistencia());
                m.defender(valorAtaque);

                //round = round +1
                round++;
            }

            if(m.getVida() <= 0){
                System.out.println("O gerreiro " + m2.getNome() + " foi campeão!!!" );
            }else if(m2.getVida() <= 0){
                System.out.println("O guerreiro " + m.getNome() + " foi campeão!!!");
            }
        }

    }
}
