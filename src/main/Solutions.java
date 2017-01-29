package main;

/**
 * Created by Kalvin on 11/14/2016.
 */
public class Solutions {
    public static void main(String args[]) {
        //calculatePrime(1);
        //calculatePrime(2);
        //calculatePrime(3);
        //calculatePrime(4);

        System.out.println(calculatePrimeRecursive(1));
        System.out.println(calculatePrimeRecursive(2));
        System.out.println(calculatePrimeRecursive(3));
        System.out.println(calculatePrimeRecursive(4));
    }

    public static void calculatePrime(int input) {
        int result = input;
        if(input == 1 || input == 0) {
            result = 1;
        }
        else {
            for(int i=input-1;i>1;i--) {
                result *= i;
            }
        }

        System.out.println(result);
    }

    public static int calculatePrimeRecursive(int input) {
        if(input == 1 || input == 0) {
            return 1;
        }
        else {
            return input * calculatePrimeRecursive(input-1);
        }
    }
}
