import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valor = entrada.nextDouble();

        System.out.print("Digite o estado destinatário: ");
        String estado = entrada.next();

        if (estado.contains("MG")) {
            double custo = valor + (valor*0.07);
            System.out.println("Custo total do produto: " + custo);

        } else if (estado.contains("SP")) {
            double custo = valor + (valor*0.12);
            System.out.println("Custo total do produto: " + custo);

        } else if (estado.contains("RJ")) {
            double custo = valor + (valor*0.15);
            System.out.println("Custo total do produto: " + custo);

        } else if (estado.contains("MS")) {
            double custo = valor + (valor*0.08);
            System.out.println("Custo total do produto: " + custo);
        }

        entrada.close();
    }
}
