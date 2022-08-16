import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random rd = new Random();
        int number = rd.nextInt(100);

        Scanner inp = new Scanner(System.in);
        int MAX_RIGHT=5;
        int right = 0;
        int selected;
        int[] wrong = new int[MAX_RIGHT];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < MAX_RIGHT) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = inp.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasýnda bir deðer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak: " + (MAX_RIGHT - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz !");
                if (selected > number) {
                    System.out.println("\n"+selected + " sayısı, gizli sayýdan büyüktür.");
                } else {
                    System.out.println("\n"+selected + " sayısı, gizli sayýdan küçüktür.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkınız: " + (MAX_RIGHT - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz :(");
            System.out.println("Gizli sayı: "+number);
            if (!isWrong) {
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
            }
        }
        inp.close();
    }
}