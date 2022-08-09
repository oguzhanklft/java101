import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        int a,b, combination, totala = 1, totalb = 1, totalab = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("C(a,b) biçimindeki a değerini giriniz: ");
        a = inp.nextInt();
        System.out.print("C(a,b) biçimindeki b değerini giriniz: ");
        b = inp.nextInt();

        for (int i = 1; i <= a; i++) {
            totala = totala * i;
        }
        for (int j = 1; j <= b; j++) {
            totalb = totalb * j;
        }
        int aMinusB = a - b;

        for (int k = 1; k <= aMinusB; k++){
            totalab = totalab * k;
        }

        combination = (totala / (totalb * totalab));

        System.out.println("C(" + a + "," + b + ") = " + combination);
        }

    }