import java.util.Arrays;
import java.util.Scanner;

public class ElemanlariSiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizide kaç eleman var? ");
        int length=inp.nextInt();
        int[] list1=new int[length];

        System.out.println("Dizideki elemanları giriniz:");

        for (int i = 0; i < list1.length ; i++){
            System.out.print((i+1)+".Eleman: ");
            list1[i]=inp.nextInt();
        }
        System.out.print("Girilen dizi: ");
        System.out.println("Girilen dizi: "+Arrays.toString(list1));
        Arrays.sort(list1);
        System.out.println("Sıralanan dizi:");
        System.out.println(Arrays.toString(list1));
        inp.close();
    }
}