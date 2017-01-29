package main;

/**
 * Created by Kalvin on 11/28/2016.
 */
public class FizzBuzz {
    public static void main (String args[]) {
        for(int i=0;i<100;i++) {
            if(i%3==0 && i%5==0) {
                System.out.println("fizzbuzz");
            }
            else if(i%3==0) {
                System.out.println("fizz");
            }
            else if(i%5==0) {
                System.out.println("buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
