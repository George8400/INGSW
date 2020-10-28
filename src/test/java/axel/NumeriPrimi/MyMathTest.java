package axel.NumeriPrimi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

import org.junit.BeforeClass;
import org.junit.Test;


public class MyMathTest 
{

    private static MyMath math;
    
    @BeforeClass
    public static void prepare() {
    	math = new MyMath();
    }
    
    @Test  // -> dice a junit che questa è una finzione test
    public void primeNumbersGeneratorWorks() {
    	assertEquals(new LinkedList<Integer>(), math.primeNumbersGenerator(1));
    	assertEquals(Arrays.asList(2,3,5,7,11,13,17,19), math.primeNumbersGenerator(20));
    }
    
    @Test
    public void isPrimeWorks() {
    	assertFalse(math.isPrime(9));
    	assertFalse(math.isPrime(1));
    	
    	List<Integer> primes = Arrays.asList(11,101);
    	
    	for(int prime : primes) {
    		assertTrue(math.isPrime(prime));
    	}
    }
    
    
    
}
