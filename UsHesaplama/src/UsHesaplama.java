import java.util.Scanner;

public class UsHesaplama {
public static int us(int a, int n){
    int total = 1;
    for (int i=0;i<n; i++){
        total *= a;
    }
    return total;

}

    public static void main(String[] args) {
        int n,a;
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban sayıyı giriniz: ");
        a = inp.nextInt();
        System.out.print("Üs değerini giriniz: ");
        n = inp.nextInt();
        System.out.println(us(a,n));
        System.out.println("Sonucunuz yukarıda yazmaktadır.");
    }
}
