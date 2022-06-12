package br.edu.javaempresax.testes;
import br.edu.javaempresax.classes.Departamento;
import br.edu.javaempresax.classes.Empregado;
import br.edu.javaempresax.classes.Projeto;

import java.util.Date;

public class Principal {

    public Principal() {3
    }

    public static void main(String[] args) {

        Empregado empregado01 = new Empregado();

        empregado01.setCodigo(1);
        empregado01.setNome("Marina")
        empregado01.setSexo('F');

        Date dataInicio = new Date();

        Departamento d01 = new Departamento(1,"Pesquisa", 1, dataInicio);

        empregado01.setDepartamento(d01);

        Projeto p01 = new Projeto(1, "Transmogrifador", d01);

        System.out.println(empregado01);
        System.out.println(p01);
    }
}