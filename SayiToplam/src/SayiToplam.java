import java.util.Scanner;

public class SayiToplam {
    public static void main(String[] args) {
        int number, total =0;
        do {
            Scanner inp = new Scanner(System.in);
            System.out.print("Sayı Gir: ");
            number = inp.nextInt();
            if (number % 2 == 0 && number % 4 == 0) {
                total += number;
            }
        }while (number % 2 == 0) ;
            System.out.println("Toplam= " + total);

    }
}
