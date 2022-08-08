import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password,newPassword;
        int select;

        // Username ve password kullanıcıdan alınır
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = inp.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = inp.nextLine();

        // Username ve password kontrol edilir
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız.");
        } else {
            System.out.println("Yanlış şifre girdiniz.\nŞifrenizi yenilemek istiyorsanız 1'e istemiyorsanız 2'ye basın.");
            select = inp.nextInt();

            switch(select){
                case 1:
                    Scanner input = new Scanner(System.in);
                    System.out.println("Yeni şifrenizi girin.");
                    newPassword = input.nextLine();
                    if (newPassword.equals("java123") || newPassword.equals(password)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifreniz başarıyla değiştirildi.");
                    }
                    break;
                default:
                    System.out.println("Sistemden çıkış yaptınız.");
            }
        }
    }
}
