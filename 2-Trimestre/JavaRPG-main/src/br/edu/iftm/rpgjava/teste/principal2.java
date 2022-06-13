package br.edu.iftm.rpgjava.teste;

import br.edu.iftm.rpgjava.classes.*;

import java.util.Random;
import java.util.Scanner;

public class principal2 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        Armadura arG = new Armadura("Armadura de cobre", 15, 45, 60);
        Armadura arA = new Armadura("Cota de malha", 8, 25, 50);
        Armadura arM = new Armadura("Armadura de couro", 3, 10, 20);

        Arma maG = new Arma("Espada de mythril", 45, 70);
        Arma maA = new Arma("Arco de pau-brasil", 25, 90);
        Arma maM = new Arma("Cajado de Midgar", 55, 50);

        System.out.println("Crie o guerreiro");
        System.out.print("Digite o seu nome: ");
        String nomeg = ent.next();
        Guerreiro g = new Guerreiro(nomeg,80, 50, 30, 3, 0, 25, 100, 70, 10, 20);
        g.setArmadura(arG);
        g.setArma(maG);

        System.out.println("Crie o arqueiro");
        System.out.print("Digite o seu nome: ");
        String nomea = ent.next();
        Arqueiro a = new Arqueiro(nomea,50, 70,60, 20, 0, 15, 100, 80, 20, 30);
        g.setArmadura(arA);
        g.setArma(maA);


        System.out.println("Crie o mago");
        System.out.print("Digite o seu nome: ");
        String nomem = ent.next();
        Mago m = new Mago(nomem,20, 30,90, 90, 0, 5, 100, 50, 10, 90);
        g.setArmadura(arM);
        g.setArma(maM);


        //Combate
        Random dado = new Random();

        int round  = 1;
        while((g.getVida() > 0 && m.getVida() > 0) || (g.getVida() > 0 && a.getVida() > 0) || (a.getVida() > 0 && m.getVida() > 0)){
            System.out.println("Oponente 1: " + g.getNome());
            System.out.println("Oponente 2: " + a.getNome());
            System.out.println("Oponente 3: " + m.getNome());

            //Primeiro Turno
            System.out.println("\nRound: " + round);
            System.out.println("Primeiro jogardor: Guerreiro");
            System.out.println("Qual oponente deseja atacar: Arqueiro ou Mago");
            char oponente = ent.next().charAt(0);

            if (oponente == 'a') {
                //code
                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado. " + valorDado);
                int valorAtaque = g.atacar(valorDado, a.getResistencia());
                a.defender(valorAtaque);
                round++;
            } else if (oponente == 'm') {
                //code
                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = g.atacar(valorDado, m.getResistencia());
                m.defender(valorAtaque);
                round++;
            }

            //Segundo turno
            System.out.println("\nRound: " + round);
            System.out.println("Segundo jogardor: Arqueiro");
            System.out.println("Qual oponente deseja atacar. Guerreiro ou Mago");
            oponente = ent.next().charAt(0);

            if (oponente == 'g') {
                //code
                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = a.atacar(valorDado, g.getResistencia());
                g.defender(valorAtaque);
                round++;
            } else if (oponente == 'm') {
                //code
                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = a.atacar(valorDado, m.getResistencia());
                m.defender(valorAtaque);
                round++;
            }

            //Terceiro turno
            System.out.println("\nRound: " + round);
            System.out.println("Terceiro jogardor: Mago");
            System.out.println("Qual oponente deseja atacar. Arqueiro ou Guerreiro");
            oponente = ent.next().charAt(0);

            if (oponente == 'a') {
                //code
                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = m.atacar(valorDado, a.getResistencia());
                a.defender(valorAtaque);
                round++;
            } else if (oponente == 'g') {
                //code
                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = m.atacar(valorDado, g.getResistencia());
                g.defender(valorAtaque);
                round++;
            }
            if(m.getVida() <= 0){
                System.out.println(m.getNome() + " morreu!");
                m = new Mago();
            }
            if(g.getVida() <= 0){
                System.out.println(g.getNome() + " morreu!");
                g = new Guerreiro();
            }
            if(a.getVida() <= 0) {
                System.out.println(a.getNome() + " morreu!");
                a = new Arqueiro();
            }
        }
    }
}