package palindrome;

public class Palindrome {

	public static void main(String[] args) {
	
		for(int i=100;i<999;i++) {
			if(isPaindrome(i)) {
				System.out.println(i  + "");
			}
		}
		
	}
	
	public static boolean isPaindrome(int num) {
		int reverse=0;
		for(int i=num;i>0;i/=10)
			reverse=reverse*10+i%10;
		return num==reverse;
	}

}
