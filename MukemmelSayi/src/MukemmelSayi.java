import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int number,i,total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        for(i=1;i<number; i++) {
            if (number % i == 0) {
                total +=i ;
            }
        }
        if(number == total) {
            System.out.println(number + " mükemmel sayıdır.");
        } else {
            System.out.println(number + " mükemmel sayı değildir.");
            }
        }
    }