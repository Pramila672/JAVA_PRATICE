/*
Declare an int variable named score and assign it an initial value of 100.
Print the initial score.
Assign a new value of 150 to the same score variable.
Print the new, updated score to confirm the change. 
*/

public class VariableOverwriting{
	public static void main(String[] args)
	{
	 int score = 100;
	
	 System.out.println("Initial Score: " + score);
	
	score = 150;
	System.out.println("Final Score: " + score);


	}
}
