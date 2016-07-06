import java.util.Scanner;


public class Temperature
{
	public static void main(String args[])
	{
		//input
		Double tempF = 0.0, tempC =0.0;
		System.out.println("Enter the Temperature in Farenheit Scale:");
		Scanner sc=new Scanner(System.in);
		tempF = Double.valueOf(sc.nextLine());
		//calculation
		tempC= (5*(tempF-32))/9;
		System.out.println("Temperature in celsius Scale:"+tempC);
		
	}
}