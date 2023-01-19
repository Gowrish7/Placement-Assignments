//Write a Java program to accept a coordinate point in a XY coordinate system and determine in which quadrant the coordinate point lies.
//in terms of Points
package assignments;

import java.util.Scanner;

public class QuadrantsPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x co-ordinates");
		int x = sc.nextInt();
		System.out.println("Enter the y co-ordinates");
		int y = sc.nextInt();
		if(x>0 && y>0)
		{
			System.out.println("1st Quadrant");
			System.exit(0);
		}
		if(x<0 && y>0)
		{
			System.out.println("2nd Quadrant");
			System.exit(0);
		}
		if(x<0 && y<0)
		{
			System.out.println("3rd Quadrant");
			System.exit(0);
		}
		if(x>0 && y<0)
		{
			System.out.println("4th Quadrant");
			System.exit(0);
		}
		
	}

}
