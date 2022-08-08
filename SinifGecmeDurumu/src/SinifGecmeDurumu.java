import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Matematik notunuzu yazınız: ");
        mat = girdi.nextInt();

        System.out.print("Fizik notunuzu yazınız: ");
        fizik = girdi.nextInt();

        System.out.print("Türkçe notunuzu yazınız: ");
        turkce = girdi.nextInt();

        System.out.print("Kimya notunuzu yazınız: ");
        kimya = girdi.nextInt();

        System.out.print("Müzik notunuzu yazınız: ");
        muzik = girdi.nextInt();

        if(mat < 0 || mat > 100)
            mat = 0;
        if(fizik < 0 || fizik > 100)
            fizik = 0;
        if(turkce < 0 || turkce > 100)
            turkce = 0;
        if(kimya < 0 || kimya > 100)
            kimya = 0;
        if(muzik < 0 || muzik > 100)
            muzik = 0;

        double ortalama = (mat + fizik + turkce + kimya + muzik)/5;
        if(ortalama < 55) {
            System.out.println("Sınıfta kaldınız. Seneye görüşmek üzere :)");
        }
        else {
            System.out.println("Sınıfı geçtiniz. Tebrikler :)");
        }
        System.out.println("Ortalamanız: "+ortalama);
    }
}
