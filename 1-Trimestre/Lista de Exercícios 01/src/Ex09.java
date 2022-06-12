import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira sua altura: ");
        float alt = entrada.nextFloat();

        System.out.print("Insira seu peso: ");
        float peso = entrada.nextFloat();

        if (alt < 1.2){
            if (peso <= 60){
                System.out.println("Classificação: A");

            } else if (peso > 60 && peso <= 90) {
                System.out.println("Classificação: D");
                
            } else if (peso > 90){
                System.out.println("Classificação: G");
            }

        } else if (alt >= 1.2 && alt <= 1.7) {
            if (peso <= 60){
                System.out.println("Classificação: B");

            } else if (peso > 60 && peso <= 90) {
                System.out.println("Classificação: E");
                
            } else if (peso > 90){
                System.out.println("Classificação: H");
            }

        } else if (alt > 1.7) {
            if (peso <= 60){
                System.out.println("Classificação: C");

            } else if (peso > 60 && peso <= 90) {
                System.out.println("Classificação: F");
                
            } else if (peso > 90){
                System.out.println("Classificação: I");
            }
        }

        entrada.close();
    }
}
