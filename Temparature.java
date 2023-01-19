//Write a Java program to read temperature in centigrade and display a suitable message according to temperature state below
//Temp < 0 then Freezing weather
//Temp 0-10 then Very Cold weather
//Temp 10-20 then Cold weather
//Temp 20-30 then Normal in Temp
//Temp 30-40 then Its Hot
//Temp >=40 then Its Very Hot
//formula = (x°C × 9/5) + 32 = 32°F
package assignments;
public class Temparature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the temp in celcius");
		float celci = new java.util.Scanner(System.in).nextFloat();
		if(celci < 0)
		{
			System.out.println("Freezing Weather");
			System.exit(0);
		}
		else if(celci>=0 && celci<10)
		{
			System.out.println("Very Cold weather");
			System.exit(0);
		}
		else if(celci>=10 && celci<20)
		{
			System.out.println("Cold weather");
			System.exit(0);
		}
		else if(celci>=20 && celci<30)
		{
			System.out.println("Normal in Temperature");
			System.exit(0);
		}
		else if(celci>=30 && celci<40)
		{
			System.out.println("Its Hot");
			System.exit(0);
		}
		else {
			System.out.println("its very hot");
		}
		
	}

}
