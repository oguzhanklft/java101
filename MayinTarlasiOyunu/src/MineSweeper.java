import java.util.Scanner;
import java.util.Random;

public class MineSweeper {
    static String[][] mayinTarlasiAlani(int a, int b) {
        Random randomNumber = new Random();
        String[][] alan = new String[a][b];

        int low = 0;
        int highA = a;
        int highB = b;
        int mine = a * b / 4;
        int i = 0;


        while (i < mine) {
            int randomrow = randomNumber.nextInt(highA - low) + low;
            int randomcol = randomNumber.nextInt(highB - low) + low;
            if (alan[randomrow][randomcol] != " * ") {
                alan[randomrow][randomcol] = " * ";
                i++;
            }

        }

        for (i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (alan[i][j] != " * ") {
                    alan[i][j] = " - ";
                }
            }
        }
        return alan;
    }

    static void print(String[][] alan) {
        for (int i = 0; i < alan.length; i++) {
            for (int j = 0; j < alan[i].length; j++) {
                System.out.print(alan[i][j]);
            }
            System.out.println();
        }
    }

    static String[][] bosAlan(int a, int b) {
        String[][] bosAlan = new String[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                bosAlan[i][j] = " - ";
            }
        }
        return bosAlan;
    }

    static String[][] check(String[][] alan, String[][] bosAlan, int x, int y) {
        int mine = x * y / 4;
        int kalan = (x * y) - mine;

        boolean devam = true;

        while (devam) {
            Scanner input = new Scanner(System.in);
            System.out.print("Satır seçiniz: ");
            int a = input.nextInt();
            System.out.print("Sütun seçiniz: ");
            int b = input.nextInt();

            if (a < 0 || a >= x || b < 0 || b >= y){
                System.out.println("Hatalı değer girdiniz.");
                continue;
            }

            if (alan[a][b].equals(" * ")) {
                System.out.println("===Game Over===");
                System.out.println("==Mayın Tarlası==");
                MineSweeper.print(alan);
                devam = false;
                break;

            } else if (alan[a][b].equals(bosAlan[a][b])) {
                int count = 0;
                for (int i = -1; i <= 1; i++) {
                    if (((a + i) < 0) || (a + i >= alan.length)) {
                        continue;
                    }
                    for (int j = -1; j <= 1; j++) {
                        if (((b + j) < 0) || (b + j >= alan.length)) {
                            continue;
                        }
                        if (alan[a + i][b + j].equals(" * ")) {
                            count++;
                        }
                    }
                }
                bosAlan[a][b] = " " + count + " ";
                MineSweeper.print(bosAlan);
                kalan--;
            }
            System.out.println("Kalan boşluk: " + kalan);
            if (kalan == 0) {
                System.out.println("WIN !");
                break;
            }
        }
        return alan;
    }
}