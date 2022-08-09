import java.util.Scanner;

public class BasamakSayiToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b=0,c=0;
        System.out.print("Sayı Giriniz :");
        a = input.nextInt();

        while (a!=0) {


            b = a%10;
            a/=10;
            System.out.println(b);
            System.out.println(a);
            c+=b;

        }
        System.out.println("Sayı basamağı toplamı: " + c);


    }
}