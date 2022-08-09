import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;
        boolean bissexTile;

        Scanner inp = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        year = inp.nextInt();

        if((year%4 == 0 && year % 100 !=0) || year % 400 == 0) {
            bissexTile = true;
        } else {
            bissexTile = false;
        }

        if(bissexTile == true)
            System.out.println(year + " bir artık yıldır.");
        else
            System.out.println(year + " bir artık yıl değildir.");
        }
    }