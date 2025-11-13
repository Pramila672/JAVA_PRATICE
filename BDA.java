/* Example: Blood Donation Eligibility
Consider a scenario where a person's eligibility to donate blood depends on their age and weight. Both conditions must be met, and the weight condition is only relevant if the age condition is already satisfied.
Java

*/

import java.util.Scanner;

public class BDA{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter your age:");
		int age = input.nextInt();

		if (age >= 18)
		{
		 System.out.print("Please enter your weight:");
		 double weight = input.nextDouble();


			if (weight >= 55){
		
			System.out.println("You are eligible to donate your blood!!!");
			}
		
			else{
			System.out.println("You aren't eligible to donate your blood as your weight not matches criteria");
			}
			
		}else {
			System.out.println("You are not old enough to donate blood");
		    	}

		input.close();

	}
}		