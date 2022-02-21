import java.util.*;

public class Telephone {
    public static void rand_phone_num(){
        Random generator = new Random();
        String first = String.valueOf(generator.nextInt(999-100)+100);
//        System.out.println(first);
        if (!first.contains("8")){
            if (!first.contains("9")){
                String second = String.valueOf(generator.nextInt(655-100)+100);
                String last = String.valueOf(generator.nextInt(9999-1000)+1000);
                String phoneNumber = String.format("%s-%s-%s",first,second,last);
                System.out.println(phoneNumber);
            }
            else {
                rand_phone_num();
            }
        }else {
            rand_phone_num();
        }
    }
    public static void main(String[] args){
        System.out.println("How many phone numbers do you want? ");
        int n = new Scanner(System.in).nextInt();
        int number = Integer.parseInt(String.valueOf(n));
        int i;
        for (i=0;i<number;i++){
            rand_phone_num();
        }
    }
}
