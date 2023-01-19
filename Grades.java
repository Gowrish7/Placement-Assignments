//Write a java program to find the eligibility of admission for a professional course based on the following criteria:
//Eligibility Criteria : 
//Marks in Maths >=65 and Marks in Phy >=55 and Marks in Chem>=50 and Total in all three subject >=190 or Total in Maths and Physics >=140
package assignments;
import java.util.*;
public class Grades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks in maths");
		int maths = sc.nextInt();
		System.out.println("Enter the marks in physics");
		int phy = sc.nextInt();
		System.out.println("Enter the marks in chemistry");
		int chem = sc.nextInt();
		int sum = maths+chem+phy;
		int sum1 = maths+phy;
		if(maths>=65 && phy>=55 && chem>=50)
		{
			System.out.println("you are eligible");
			System.exit(0);
		}
		else if(sum>=190)
		{
			System.out.println("sum of 3 subs makes you eligible");
			System.exit(0);
		}
		else if(sum1>=140)
		{
			System.out.println("the sum of maths and physics is greater than 140 so you are eligible");
		}
		else
		{
			System.out.println("You are not eligible");
			System.exit(0);
		}
	}

}
