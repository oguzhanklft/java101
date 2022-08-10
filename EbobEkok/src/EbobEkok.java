import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOne, numberTwo;
        boolean a = false;
        do {
            System.out.print("İlk sayıyı giriniz: ");
            numberOne = input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            numberTwo = input.nextInt();
            if (numberOne <= 0 || numberTwo <= 0) {
                System.out.println("Pozitif Sayı Giriniz!");
            } else {
                a = true;
            }
        } while (!a);
        if (numberTwo < numberOne) {
            int tempN2 = numberTwo;
            numberTwo = numberOne;
            numberOne = tempN2;
        }
        int i = numberOne;
        while (i >= 1) {
            if ((numberOne % i == 0) && (numberTwo % i == 0)) {
                System.out.println("En büyük ortak bölen(EBOB): " + i);
                break;
            } else {
                i--;
            }
        }
        int k = numberTwo;
        while (k <= (numberOne * numberTwo)) {
            if ((k % numberOne == 0) && (k % numberTwo == 0)) {
                System.out.println("En küçük ortak kat(EKOK): " + k);
                break;
            } else {
                k++;
            }
        }


    }
}