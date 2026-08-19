package Basics;

public class CountPrime {

	public static void main(String[] args) {
			int n = 10;
	        int count=0;
	        if(n>=2) {
	        	count = 1;
	        }
	        for(int p=3; p<n; p++) {
	            boolean isPrime = false;
				for(int q=2; q<p; q++) {
					if(p%q != 0) {
						isPrime = true;
					}
					if(p%q == 0){
						isPrime = false;
						break;
					}
	                
				}
				if(isPrime == true){
                    count++;
				}

	            
			}
	        System.out.println (count);
	    

	}

}

