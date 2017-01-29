package test;

import main.NumbercountingSequence;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kalvin on 1/28/2017.
 */
public class NumberCountingSequenceTest {
    @Test
    public void testFoo() {
        assertEquals("111221", NumbercountingSequence.iteratePrevious("1211"));
    }

    @Test
    public void testFoo2() {
        assertEquals("1211", NumbercountingSequence.iteratePrevious("21"));
    }

    @Test
    public void numberCountingSequenceZero() {
        assertEquals("", NumbercountingSequence.numberCountingSequence(0));
    }

    @Test
    public void numberCountingSequenceOne() {
        assertEquals("1", NumbercountingSequence.numberCountingSequence(1));
    }

    @Test
    public void numberCountingSequenceTwo() {
        assertEquals("11", NumbercountingSequence.numberCountingSequence(2));
    }

    @Test
    public void numberCountingSequenceThree() {
        assertEquals("21", NumbercountingSequence.numberCountingSequence(3));
    }

    @Test
    public void numberCountingSequenceFour() {
        assertEquals("1211", NumbercountingSequence.numberCountingSequence(4));
    }


    @Test
    public void numberCountingSequenceFive() {
        assertEquals("111221", NumbercountingSequence.numberCountingSequence(5));
    }

}
