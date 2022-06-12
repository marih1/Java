import java.util.Scanner;

public class Ex01 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = entrada.next();

        System.out.print("Qual o modelo do produto: ");
        String modelo = entrada.next();

        System.out.print("Qual o tamanho do produto: ");
        float tamanho = entrada.nextFloat();

        System.out.println("Qual o preço do produto: ");
        float preco = entrada.nextFloat();

        System.out.println("Quantidade desse produto: ");
        int qtde = entrada.nextInt();

        System.out.println(
            "Nome do produto: " + nome +
            "\nModelo do produto: " + modelo +
            "\nTamanho do produto: " + tamanho +
            "\nPreço do produto: " + preco +
            "\nQuantidade desse produto: " + qtde
        );
        
        entrada.close();
    }
}
