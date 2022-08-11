
public class AsalSayi {
    public static void main(String[] args) {
        int counter = 0,number,i;


        for(number=2;number<=100; number++){
            boolean remind=true;
            for(i=2;i<number; i++) {
                if (number % i == 0) {
                    remind = false;
                    break;
                }
            }

            if(remind == true){
                System.out.print(number +"\n");
                counter++;
                }
            }
        }

    }