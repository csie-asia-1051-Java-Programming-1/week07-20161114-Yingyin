package ex;

import java.util.Scanner;

/*
 * Date: 2016/11/14
 * Author: 1050210XX OOO
 */
public class ex01 {

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
