import java.util.Scanner;

public class YildizUcgen {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = girdi.nextInt();

        for(int i=1;i<=number;i++) {
            for (int j = i; j < number; j++) {
                System.out.print(" ");
            } for(int k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        } for(int i=number;i>=1;i--){
            for(int j=number;j>i;j--) {
                System.out.print(" ");
            } for(int k=1;k<2*i;k++) {
                System.out.print("*");
            }
            System.out.println();
            }
        }
    }