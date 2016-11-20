package hw;

import java.util.Scanner;

public class hw05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(reStr(n,0));
	}
	public static int reStr(int n,int p){
		p=p*10+(n%10);
		if(n>=10){
			return reStr(n/10, p);
		}
		return p;
		}

}
