import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Equação de segundo grau");

        System.out.print("\nDigite o coeficiente 'a': ");
        Double a = entrada.nextDouble();

        System.out.print("Digite o coeficiente 'b': ");
        Double b = entrada.nextDouble();

        System.out.print("Digite o coeficiente 'b': ");
        Double c = entrada.nextDouble();

        Double delta = (b * b) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Não existe raiz.");

        } else if (delta == 0) {
            Double x = -(b) / 2 * a;
            System.out.println("Raiz única");
            System.out.println("X linha = " + x);

        } else if (delta > 0) {
            Double raiz = Math.sqrt(delta);
            Double x1 = (-(b) + raiz) / 2 * a;
            Double x2 = (-(b) - raiz) / 2 * a;
            System.out.println("X linha = " + x1 + "\nX duas linhas = " + x2);
        }

        entrada.close();
    }
}
