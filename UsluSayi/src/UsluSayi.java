import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int a,b;
        int total = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        a = inp.nextInt();
        System.out.print("Üs yazılacak sayı: ");
        b = inp.nextInt();

        for(int i =1;i<=b;i++) {

            total*=a;
        }
        System.out.println("Cevap: " +total);
        }
    }