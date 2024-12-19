package classwork_day_8;

import java.util.Scanner;

public class q8 {
	public static double perimeter(double a,double b) {
		return 2*(a+b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of lenght");
		double base = sc.nextDouble();
		System.out.println("enter the size of width");
		double side1 = sc.nextDouble();
		System.out.println("permeter of rectangle is : "+perimeter(base,side1));
	}
}
