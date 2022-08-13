import java.util.Scanner;

public class AsalSayiBulanProgram {
    static boolean kontrolAsal(int number, int index){
        if(number<=2){
            return (number==2)?true:false;
        }
        if(number % index == 0){
            return false;
        }
        if(index*index>number){
            return true;
        }
        return kontrolAsal(number,index+1);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while(true){
            System.out.print("Sayı giriniz: ");
            int number = inp.nextInt();
            if(kontrolAsal(number,2)) {
                System.out.println(number + " sayısı asaldır.");
            } else {
                System.out.println(number + "sayısı asal bir sayı değildir.");
            }
        }
    }
}