import java.util.Scanner;

public class DortVeBesKatlari {
    public static void main(String[] args) {
        int number;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        number = girdi.nextInt();

        System.out.println(number +"sayısından küçük dördün kuvvetleri: ");
        for(int i=1; i<=number; i*=4) {
            System.out.println(i + "    ");
        }
        System.out.println(number + "sayısından küçük beşin kuvvetleri: ");
        for(int i=1; i<=number; i*=5){
            System.out.println(i + "   ");
        }
    }
}
