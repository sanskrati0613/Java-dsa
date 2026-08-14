
public class BasicMath {

	public static int getGCD(int a, int b) {
		while(b!=0) {
			int temp = b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	
	public static int getLCM(int a, int b) {
		int gcd = getGCD(a,b);
		int prod = a*b;
		int lcm = prod/gcd;
		return lcm;
	}
	
	public static boolean isArmstrong(int num) {
		int sum = 0;
		int original = num;
		while(num!=0) {
			int digit = num%10;
			int cubeOfDigit = digit*digit*digit;
			sum+=cubeOfDigit;
			num/=10;
		}
		return (sum == original);
	}
	
	public static boolean isPerfect(int num) {
		int sum = 1;
		for(int i=2; i*i<=num; i++) {
			if(num%i == 0) {
				int firstFactor = i;
				int secondFactor = num/i;
				sum=sum+firstFactor+secondFactor;
			}
		}
		return(sum == num);
	}
	
	public static void main(String[] args) {
		System.out.println(getGCD(24,36));
		System.out.println(getLCM(24,36));
		System.out.println(isArmstrong(153));
		System.out.println(isPerfect(6));
	}

}
