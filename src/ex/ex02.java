package ex;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n=sca.nextInt();
		int sum=0;
		int data[]=new int [n];
		for(int i=0;i<n;i++)
		{
			data[i]=sca.nextInt();
			sum+=data[i];
		}
		sum=sum/n;
		System.out.println(var(sum,data,n)/n);
		System.out.println(std(var(sum,data,n)/n));
		}
		
		public static float std(float f) {
			  f=(float)Math.sqrt(f);
		     return f;
	}

		public static float var(int x, int[] data,int n) {
			int y;
			float sum=0;
			for(int i=0;i<n;i++)
			{
				y=x-(data[i]);
				sum=(float)(sum+(Math.pow(y, 2)));
			}
			return sum;
	}

}
