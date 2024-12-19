package classwork_day_8;

import java.util.Scanner;

public class q7 {

	public static void comp(int n, int n2) {
		if(n>n2) {
			System.out.println(n+" is greater than "+n2);
		}else if(n==n2){
			System.out.println(n+" is equal to "+n2);
		}else {
			System.out.println(n2+" is greater than "+n);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1");
		int n = sc.nextInt();
		System.out.println("enter number 2");
		int n2 = sc.nextInt();
		comp(n,n2);

	}

}
