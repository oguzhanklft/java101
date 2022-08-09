import java.util.Scanner;

public class CiftSayi {
    public static void main(String[] args) {
        int number,k,average;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı: ");
        number = inp.nextInt();

        int total = 0;
        int kactane = 0;

        for(k = 1; k <= number; k++){
            if(k%3 == 0 && k%4 == 0) {
                total += k;
                kactane += 1;
            }
            }
        if(kactane > 0) {
            average = total / kactane;
            System.out.print("Sayıların ortalaması: " + average);
        } else {
            System.out.println(number +"'dan küçük 3 ve 4'e bölünebilen bir sayı yoktur.");
        }
        }
    }