import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int firstNumber, secondNumber, largeNumber;
        int Ebob = 1, Ekok = 1, divided = 1;

        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        firstNumber = inp.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        secondNumber = inp.nextInt();

        if (firstNumber > secondNumber) {
            largeNumber = firstNumber;
        } else {
            largeNumber = secondNumber;
        }
        while (divided < largeNumber) {
            if (firstNumber % divided == 0 && secondNumber % divided == 0) {
                Ebob = divided;
                divided++;
            }

            Ekok = (firstNumber * secondNumber) / Ebob;
            System.out.println("En büyük ortak bölen(EBOB): " + Ebob + "ve en küçük ortak kat(EKOK): " + Ekok);
            break;
        }
    }
}