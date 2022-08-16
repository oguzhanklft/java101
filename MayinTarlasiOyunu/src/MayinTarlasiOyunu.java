import java.util.Scanner;

public class MayinTarlasiOyunu {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Satır sayısı: ");
        int a = inp.nextInt();
        System.out.print("Sütun sayısı: ");
        int b = inp.nextInt();
        String[][] alan = MineSweeper.mayinTarlasiAlani(a, b);
        String[][] bosAlan = MineSweeper.bosAlan(a, b);
        MineSweeper.print(bosAlan);


        MineSweeper.check(alan, bosAlan, a, b);
    }
}