import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = ent.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = ent.next();

        String nomecompleto = nome.concat(sobrenome);

        System.out.println("Nome completo: " + nomecompleto);

        ent.close();
    }
}
