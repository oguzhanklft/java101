import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int i,j,k,line;

        Scanner inp = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz: ");
        line = inp.nextInt();

        for(i=line;i>=1;i--){
            for(j=line;j>i;j--) {
                System.out.print(" ");
            }
            for(k=1;k<2*i;k++) {
                System.out.print("*");
            }
            System.out.println();
            }
        }
    }