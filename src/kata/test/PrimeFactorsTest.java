package kata.test;

import junit.framework.TestCase;
import kata.src.PrimeFactors;

import java.util.ArrayList;
import java.util.List;


public class PrimeFactorsTest extends TestCase {
    public void testOne() throws Exception{
        assertEquals(list(), PrimeFactors.generateOpt(1));
    }
    public void testTwo() throws Exception{
        assertEquals(list(2), PrimeFactors.generateOpt(2));
    }
    public void testThree() throws Exception{
        assertEquals(list(3), PrimeFactors.generateOpt(3));
    }
    public void testFour() throws Exception{
        assertEquals(list(2,2), PrimeFactors.generateOpt(4));
    }
    public void testSix() throws Exception{
        assertEquals(list(2,3), PrimeFactors.generateOpt(6));
    }
    public void testEight() throws Exception{
        assertEquals(list(2,2,2), PrimeFactors.generateOpt(8));
    }
    public void testNine() throws Exception{
        System.out.println("Running for 9");
        assertEquals(list(3,3), PrimeFactors.generateOpt(9));
    }
    public void test630() throws Exception{
        assertEquals(list(2,3,3,5,7), PrimeFactors.generateOpt(630));
    }

    private List<Integer> list(int... ints){
        List<Integer> list = new ArrayList<>();
        for (int i : ints)
            list.add(i);
        return list;
    }
}
