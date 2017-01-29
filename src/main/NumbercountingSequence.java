package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kalvin on 1/28/2017.
 */
public class NumbercountingSequence {
    public static String numberCountingSequence(int number) {
        String result="";
        for(int i=0;i<number+1;i++) {
            if(i==0) result = "";
            else if(i==1) result = "1";
            else {
                result = iteratePrevious(result);
            }
        }
        return ""+result;
    }

    public static String iteratePrevious(String numberString) {
        String result = "";

        if(numberString == "") return "1";
        List<NumberToken> counts = new ArrayList<>();
        int countsIndex = 0;
        char[] numberCharArray = String.valueOf(numberString).toCharArray();
        char current = numberCharArray[countsIndex];
        counts.add(countsIndex, new NumberToken(Character.getNumericValue(numberCharArray[countsIndex]), 1));
        for(int i=1;i<numberCharArray.length;i++) {
            if(numberCharArray[i] == current) {
                counts.get(countsIndex).count++;
                countsIndex++;
            } else {
                countsIndex++;
                current = numberCharArray[i];
                counts.add(countsIndex, new NumberToken(Character.getNumericValue(numberCharArray[countsIndex]), 1));
            }
        }

        for(NumberToken n : counts) {
            result+=n.count+""+n.numberValue;
        }

        return result;
    }

    static class NumberToken {
        public int numberValue;
        public int count;

        public NumberToken(int numberValue, int count) {
            this.numberValue = numberValue;
            this.count = count;
        }
    }
}
