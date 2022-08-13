import java.util.Scanner;

public class DesenOlusturma {

    static void pattern(int a){
        if(a>0){
            System.out.print(a + " ");
            pattern(a-5);
        }
        System.out.print(a + " ");
    }

    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = inp.nextInt();

        pattern(n);
    }
}
