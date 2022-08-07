import java.util.Scanner;

public class daireHesap {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz: ");
        r = inp.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.print("Dairenin alanı: " + alan);
        System.out.print("Dairenin çevresi: " +cevre);
    }
}
