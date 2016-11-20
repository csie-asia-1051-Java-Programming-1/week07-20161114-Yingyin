package hw;

import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	int m=sca.nextInt();
	int n=sca.nextInt();
	System.out.println(C(m,n));
	}

	public static int C(int m, int n) {
		return fun(m)/(fun(n)*(fun(m-n)));
	}
	public static int fun(int x)
	{
		if(x>1)
		{
			return x*fun(x-1);
		}else{
			return 1;
		}
	}

}
