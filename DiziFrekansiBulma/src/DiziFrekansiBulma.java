import java.util.Arrays;

public class DiziFrekansiBulma {
    public static void main(String[] args) {
        int list[] = {30,12,12,30,30,12,3,12,44,87,52,87,44};
        int frequency [] = new int[list.length];

        for(int i =0;i<list.length;i++){
            frequency[i] =1;
            for(int j= i+1; j<list.length;j++){
                if( (list[i]==list[j])){
                    frequency[i]++;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = i+1; j < list.length; j++) {
                if ((list[i] == list[j])) {
                    list[j] = 0;
                }
            }
        }
        for(int i=0;i<list.length;i++){
            if(frequency[i]>1){
                if(list[i] != 0){
                    System.out.println(list[i]+ " sayısı "+ frequency[i]+" kere tekrar edildi.");
                }
            }else if(frequency[i] ==1){
                if(list[i] != 0){
                    System.out.println(list[i]+ " sayısı "+ frequency[i]+" kere tekrar edildi.");
                }

            }
        }
    }
}