//Program to implement simple calculator
//Sample Input 1:
//10 + 3
//Sample Output 1
//10 + 3 = 13
//
//
//Sample Input 2:
//10.5 - 2.5
//
//Sample output 2:
//10.5 - 2.5 = 8


package assignments;
import java.util.Scanner;
public class SimpleCalculator {
	public static void main(String args[])
	{
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2= sc.nextInt();
		System.out.println("enter the operator '+,-,/,*");
		char operator = sc.next().charAt(0);
		double add = num1 + num2;
		double sub = num1 - num2;
		double mul = num1 * num2;
		double div = num1 / num2;
		switch(operator)
		{
		case '+' :
		{
			System.out.println(add);
			break;
		}
		case '-' :
		{
			System.out.println(sub);
			break;
		}
		case '*' :
		{
			System.out.println(mul);
			break;
		}
		case '/' :
		{
			if (num2<=0)
			{
				System.out.println("Divide by zero error");
				break;
			}
			else
			System.out.println(div);			
			break;
		}
		}		
	}
}
