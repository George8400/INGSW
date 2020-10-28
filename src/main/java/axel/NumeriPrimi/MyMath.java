package axel.NumeriPrimi;

import java.util.List;
import java.util.LinkedList;

public class MyMath {

	
	public List<Integer> primeNumbersGenerator(int n) {
		
		List<Integer> primeNumbers = new LinkedList<>();
		
		if(n >= 2) {
			primeNumbers.add(2);
		}
		for(int i = 3; i <= n; i +=2) {
			if(this.isPrime(i)) {
				primeNumbers.add(i);
			}
		}
		
		return primeNumbers;
	}
	
	public boolean isPrime(int n) {
		
		if(n < 2) {
			return false;
		}
		
		for(int i = 2; i*i <= n; i++) {
			if(n%i == 0)
				return false;
		}
		
		return true;
		
	}
	
	
}
