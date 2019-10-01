

import java.util.Scanner;

public class helloworld {
    public static void main (String [] args){
        Scanner text = new Scanner(System.in);
        String text2 = text.next();
        String dop =text.next();
        int b = text2.length();
        for (int i = 0;i < b;i++){
            System.out.print(text2.charAt(i));
            System.out.print(" " + dop  + " ");


        }



    }
}
