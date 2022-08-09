import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int day, month;
        String burc = "";

        // Kullanıcıdan gün ve ay bilgisi alınır.
        Scanner input = new Scanner(System.in);

        System.out.print("Ay giriniz: ");
        month = input.nextInt();

        System.out.print("Gün giriniz: ");
        day = input.nextInt();

        if(month >= 1 && month <=12 && day >= 1) {

            if((month == 1) && (day <= 21) || (month == 12) &&(day > 22 && day <= 31))
                burc = "Oğlak";

            else if ( ((month == 1) && (day >21 && day <= 31)) || ( month == 2 && day <= 19 ) )
                burc = "Kova";

            else if ( ((month == 2) && (day > 19 && day <= 29)) || ( month ==3 && day <= 2) )
                burc = "Balık";

            else if ( ((month == 3) && (day > 20 && day <= 31)) || (month == 4 && day <= 20) )
                burc = "Koç";

            else if( ((month == 4) &&(day > 20 && day <= 30)) || (month == 5 && day <= 21) )
                burc = "Boğa";

            else if ( ((month == 5) && (day > 21 && day <= 31)) || (month == 6 && day <= 22) )
                burc = "İkizler";

            else if ( ((month == 6) && (day > 22 && day <= 30)) || (month == 7 && day <= 22) )
                burc = "Yengeç";

            else if( (month == 7) && (day > 22 && day <= 31) || (month == 8) && (day <= 22) )
                burc = "Aslan";

            else if ( (month == 8) && (day > 22 && day <= 31) || (month == 9 && day <= 22) )
                burc = "Başak";

            else if ( (month == 9) && (day > 22 && day <= 30) || (month == 10 && day <= 22) )
                burc = "Terazi";

            else if ( (month == 10) && (day > 22 && day <= 31) || (month == 11 && day < 22) )
                burc = "Akrep";

            else if( (month == 11) && (day >= 22 && day <= 30) || (month == 12 && day < 22) )
                burc = "Yay";

            else
                System.out.println("Tarih bulunamadı.Günü lütfen geçerli aralık arasında giriniz.\nÖrneğin, ocak ayı için 1-31 arasıdır.");

        }

        else
            System.out.println("Tarih bulunamadı.Ayı lütfen geçerli aralık arasında giriniz.\n1-12 arasıdır.");

        System.out.println("Burcunuz: "+burc);
    }
}