public class Ortalama {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        double total;
        double result = 0.0;
        for (int j : array){
            result += 1/j;
        }
        total = array.length/result;
        System.out.println("Harmonik ortalama = " + total);
    }
}
