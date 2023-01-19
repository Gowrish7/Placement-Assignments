
//Write a Java program to accept a coordinate point in a XY coordinate system and determine in which quadrant the coordinate point lies.
//in terms of degree
package assignments;
import java.util.*;
public class Quadrants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x co-ordinates");
		int x = sc.nextInt();
		System.out.println("Enter the y co-ordinates");
		int y = sc.nextInt();
		if(x<=90 && y<=90)
		{
			System.out.println("You are in 1st Quadrant");
			System.exit(0);
		}
		if(x<=180 && y<=180 && x>90 && y>90)
		{
			System.out.println("You are in 2nd Quadrant");
			System.exit(0);
		}
		if(x<=270 && y<=270 && x>180 && y>180)
		{
			System.out.println("You are in 3rd Quadrant");
			System.exit(0);
		}
		if(x<=360 && y<=360 && x>270 && y>270)
		{
			System.out.println("You are in 4th Quadrant");
			System.exit(0);
		}
		
	}

}
