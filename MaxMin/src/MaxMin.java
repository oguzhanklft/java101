import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] list = {15, 35, 52, 80, 55, 754, 15, 93, 138};
        int min = list[0];
        int max = list[0];

        System.out.println(Arrays.toString(list));
        System.out.println("Numarayı Gir: ");
        int number = inp.nextInt();

        Arrays.sort(list);
        {
        }

        for (int i : list) {
            if (i < number) {
                min = i;
            }
            if (i > number) {
                max = i;
                break;
            }
        }
        System.out.println("Girilen numaraya en yakın ve min numara: " + min);
        System.out.println("Girilen numaraya en yakın ve max numara: " + max);
    }
}