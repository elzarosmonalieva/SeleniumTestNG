package day10_jUnit;

import org.junit.Assert;
import org.junit.Test;

public class IntroToJUnit {

    public int sum(int a, int b){
        return (a+b);
    }
//junit examples from developers side
    @Test
    public void testSum1(){
       Assert.assertEquals(9, sum(5,4));
    }

    @Test
    public void testSum2(){
        Assert.assertEquals(-12, sum(0,-12));
    }
    @Test
    public void testSum3(){
        Assert.assertEquals(5, sum(2,3));
    }

    @Test
    public void testSum4(){
        Assert.assertEquals(9, sum(7, 2));
    }
}
