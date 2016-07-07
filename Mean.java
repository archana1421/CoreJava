import java.util.Scanner;


public class Mean
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of data items:");
		int n=Integer.parseInt(sc.nextLine());
		double[] items=new double[n];
		double sum=0.0;
		double min=0.0;
		double max=0.0;
		System.out.println("Enter numeric data items:");
		for(int i=0;i<n;i++)
		{
			items[i]=Double.parseDouble(sc.nextLine());
			sum=sum+items[i];
			if(i==0)
			{
				min=items[i];
				max=items[i];
			}
			else
			{
				if(items[i]<min)
				{
					min=items[i];
				}
				if(items[i]>max)
				{
					max=items[i];
				}
			}
		}
		double mean=sum/(n*1.0);
		System.out.println("Mean="+mean);
		System.out.println("Smallest="+min);
		System.out.println("Largest="+max);
	}
}