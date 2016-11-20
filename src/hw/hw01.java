package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x,y,z;
		x=scan.nextInt();
		y=scan.nextInt();
		z=scan.nextInt();
		System.out.println(lcm(x, y, z));
	}
	public static int gcd(int x,int y){
		int r;
		while((r=x%y)!=0){
			x=y;
			y=r;
		}
		return y;
	}
	public static int lcm(int x,int y){
		return x*y/gcd(x, y);
	}
	public static int lcm(int x,int y,int z){
		return lcm(x, y)*z/gcd(lcm(x, y), z);
	}

}
