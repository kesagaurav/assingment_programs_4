package sumofevenandodd;

public class SumofEvenAndOdd {

	public static void main(String[] args) {
		//this is the sum of even
				int evensum=0;
					for(int i=1;i<=100;i++) {
						if(i%2==0) {
							evensum+=i;
							
							
						}
						}
					System.out.println("sum of even nos is " + evensum);
					
					// sum of odd nos between 1 to 100
					int oddsum=0;
					for(int y=1;y<=100;y++) {
						if(y%2==1) {
							oddsum+=y;
							
						}
					}
					System.out.println("sum of odd nos is " + oddsum);
				
						if(evensum>oddsum) {
							System.out.println("max of even is:" + evensum);
						}else {
							System.out.println("max of odd is:" + oddsum);
						}
					

	}

}
