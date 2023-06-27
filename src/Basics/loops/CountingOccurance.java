package Basics.loops;

import java.util.Scanner;

public class CountingOccurance {
    public static void main(String[] args) {
        int a = 1233329382;
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int count = 0;
        while(a>0){
            if(a%10 == input  ){
                count++;
                a = a/10;
            } else {
                a = a/10;
            }

        }
        System.out.println(count);
    }
}
