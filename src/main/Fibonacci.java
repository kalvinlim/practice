package main;

/**
 * Created by Kalvin on 11/29/2016.
 */
public class Fibonacci {
    public static void main(String args []) {
        int number = 3;
        int result = 1;
        for(int i=number;i> 0;i--){
            System.out.println(i);
            result *= i;
        }
        System.out.println(result);
    }
}
