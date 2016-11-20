package hw;

import java.util.Scanner;

public class hw04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		System.out.println(gcd(m, n));
	}
	public static int gcd(int m,int n){
		if(m%n==0)
			return n;
		else {
			return gcd(n, m%n);
		}
}
}