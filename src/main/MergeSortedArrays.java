package main;

import java.util.Arrays;

/**
 * Created by Kalvin on 11/28/2016.
 */
public class MergeSortedArrays {
    public static void main(String args[]) {
        int[] a = {1,3,5,7,9};
        int[] b = {2,4,6,8,10};
        int[] c = new int[10];

        int a_pointer = 0;
        int b_pointer = 0;
        int i = 0;

        int a_length = a.length;
        int b_length = b.length;

        while(a_pointer < a_length && b_pointer < b_length) {
            if(a[a_pointer] < b[b_pointer]) {
                c[i] = a[a_pointer];
                a_pointer++;

            }
            else {
                c[i] = b[b_pointer];
                b_pointer++;
            }
            i++;
        }

        while(a_pointer < a_length) {
            c[i] = a[a_pointer];
            a_pointer++;
            i++;
        }
        while(b_pointer < b_length) {
            c[i] = b[b_pointer];
            b_pointer++;
            i++;
        }
        System.out.println(Arrays.toString(c));

    }
}
