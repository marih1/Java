import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws Exception {

        Scanner ent = new Scanner(System.in);
        ConversaoDeTemperatura conv = new ConversaoDeTemperatura();

        System.out.print("Digite a temperatura atual em Celsius: ");
        conv.temp = ent.nextDouble();

        System.out.println("Caso deseje ver a temperatura em Kelvin digite 'K'\n" +
                "Caso deseje ver a temperatura em Farennheit digite 'F'");
        conv.operacao = ent.nextline.charat(0);

        double tempA = conv.conversor()

        System.out.println("A temperatura na escala fahrenheit é de " + tempF);
        System.out.println("A temperatura na escala kelvin é de " + tempK);

        ent.close();
    }
}
