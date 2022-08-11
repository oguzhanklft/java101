import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int number,quantity,max = 1,min = 1;
        boolean isTrue = false;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kaç tane değer gireceksiniz ?");
        quantity = inp.nextInt();

        for(int i=1;i<=quantity; i++){
            System.out.print("Sayı giriniz: ");
            number = inp.nextInt();
            if(number>max) {
                max = number;
            } else {
                min = number;
            }
            }
        System.out.println("Max sayı: " + max);
        System.out.println("Min sayı: "+ min);
        }

    }