import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = ent.next();

        System.out.print("O seu nome tem " + nome.length() + " letras.");
        
        ent.close();
    }
}
