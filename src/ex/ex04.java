package ex;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n=sca.nextInt();
		System.out.print(fun(n));
		}

		private static int fun(int x) {
			if(x==1)
			{
				return 1;
			}
			else
			{
		return x*fun(x-1);
			}
	}

}
