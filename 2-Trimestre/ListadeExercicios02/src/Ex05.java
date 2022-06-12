import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        boolean programa = true;

        while (programa == true) {


            System.out.println("(1)Adicionar contanto");
            System.out.println("(2)Buscar contato");
            System.out.println("(3)Remover contato");
            System.out.println("(4)Editar contanto");
            System.out.println("(5)Sair");
            int comando = ent.nextInt();

            int[] contato;

            switch (comando) {
                case 1:
                    System.out.print("Digite o contato: ");
                    int cont = ent.nextInt();


                    System.out.println(contato);
                    break;
                case 2:
                    System.out.println("a");
                    break;
                case 3:
                    //code
                    break;
                case 4:
                    //code
                    break;
                case 5:
                    //code
                    break;
                default:
                    //code
            }
        }
    }
}
