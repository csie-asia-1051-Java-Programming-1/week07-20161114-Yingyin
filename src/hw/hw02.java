package hw;

import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
	Scanner sca= new Scanner(System.in);
	int n=sca.nextInt();
	System.out.println(sum(n));
	}

	public static int sum(int n) {
        if(n!=0)
        {
        	return sum(n/10)+1;
        }
		return 0;
	}

}
