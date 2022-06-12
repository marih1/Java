package Lista_01;

public class ex07 {
    
    public static void main(String[] args){

        int award = 780000;

        double winner1 = award*(0.46);
        double winner2 = award*(0.32);
        double winner3 = award - (winner1 + winner2);

        System.out.println("1º lugar: " + winner1);
        System.out.println("2º lugar: " + winner2);
        System.out.println("3º lugar: " + winner3);
    }
}
