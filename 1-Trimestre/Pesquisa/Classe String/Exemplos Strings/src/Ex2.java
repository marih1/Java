import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite o nome de um dos representantes do Segundo Informática: ");
        String nome = ent.nextLine();

        if (nome.contains("Pedro")) {
            System.out.println("Vice-representante");
        } else if (nome.contains("Maju")) {
            System.out.println("Representante");
        } else {
            System.out.println("Não é um representante");
        }

        ent.close();
    }
}
