public class DersNotlari
{
    public DersNotlari()
    {
        System.out.println("1");
        new DersNotlari(10);
        System.out.println("5");
    }
    public DersNotlari(int temp)
    {
        System.out.println("2");
        new DersNotlari(10, 20);
        System.out.println("4");
    }
    public DersNotlari(int data, int temp)
    {
        System.out.println("3");
    }

    public static void main(String[] args) {
        DersNotlari obj = new DersNotlari();
    }
}
