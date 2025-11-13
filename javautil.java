import java.util.Scanner; 

public class javautil{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your name");
		String name = input.nextLine();
		

		
		System.out.println("Please enter you age:");
		int age = input.nextInt();


		System.out.println("NAME: " + name);
		System.out.println("Age:" + age);
		
		input.close();

		}
}

		