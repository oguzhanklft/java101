public class BoxingMatch {
    public static void main(String[] args) {
        Fighter ali = new Fighter("Ali", 15, 100, 90, 0);
        Fighter utku = new Fighter("Utku", 10, 95, 100, 0);
        Saha r = new Saha(ali,utku,90,100);
        r.run();
    }
}