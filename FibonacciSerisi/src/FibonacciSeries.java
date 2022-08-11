import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int number,i,numberOne=0,numberTwo=1,numberThree=0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci serisi eleman sayısını giriniz: ");
        number = inp.nextInt();

        for(i=2;i<=number; i++){
            numberThree=numberOne+numberTwo;
            System.out.print(numberOne + " + " + numberTwo + " = " + numberThree);
            numberOne=numberTwo;
            numberTwo=numberThree;
            System.out.println();
        }
    }
}