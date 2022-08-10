import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        int select, price;
        int right = 3, balance = 1500;
        String userName, password;

        Scanner inp = new Scanner(System.in);

        while(right >0){
            System.out.print("Kullanıcı Adınız: ");
            userName = inp.nextLine();

            System.out.print("Şifreniz: ");
            password = inp.nextLine();

            if(userName.equals("oguzhan") && password.equals("klft123")) {
                System.out.println("Merhaba, LTL Bankasına Hoşgeldiniz !");
                do {
                    System.out.println("1-Para Yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap\n");
                    select = inp.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Kaç para yatırmak istiyorsunuz?");
                            price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Kaç para çekmek istiyorsunuz?");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Geçersiz miktar.");
                            } else {
                                balance -= price;
                            }
                            break;

                        case 3:
                            System.out.println("Hesabınızdaki para miktarı: " + balance);
                            break;
                        default:
                            System.out.println("Geçersiz bir değer girdiniz.");
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar Görüşürüz.");
            } else {

                right--;
                System.out.println("Geçersiz kullanıcı adı veya şifre. Tekrar deneyiniz.");

                if(right == 0) {
                    System.out.println("Hesabınız kilitlenmiştir. Lütfen bankayla iletişime geçiniz.");
                } else {
                    System.out.print("Kalan Hakkınız: " + right);
                }
            }
            }

    }
}
