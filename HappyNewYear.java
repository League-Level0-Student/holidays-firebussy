import java.util.Random;

// This recipe adds random numbers until the sum is exactly 2018!!!
//     Happy New Year!

public class HappyNewYear {
	public static void main(String[] args) {
		// 1. Make a variable 'newYear' and initialize it to 2018.
int newYear=2018;

		// 7. Repeat steps 2 to 6 (10 times)

			// 2. Make a variable 'sum' and initialize to 0
int sum=0;
			
			// 3. Repeat steps 4 to 6 (500 times) 
for (int i = 0; i < 500; i++) {
	

				// 4. Get a random number between 0 and 50
Random arby =new Random();
int x= arby.nextInt(50);

				
				// 5. If sum is less than newYear then add your random
				//    number to your sum, otherwise subtract it.
				if (sum<newYear) {
					 sum+=x;
				} else {
sum-=x;
				}

				// 6. If your sum matches newYear, then print the number of tries
				//    to the console and use the "break" statement to exit the loop
				if (sum==newYear) {
					System.out.println(i);
					break;
				}
		}		

		
		// *** BONUS: Keep track of your best score and worst score, and print
		//            the results to the console.
		
	}
}
