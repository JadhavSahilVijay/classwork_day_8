package classwork_day_8;
import java.util.*;
public class q2 {

	public static double getAverage(double a, double b, double c) {
		return (a+b+c)/3;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the marks of maths");
		double maths = sc.nextDouble();
		System.out.println("enter the marks of CS");
		double CS = sc.nextDouble();
		System.out.println("enter the marks of electronics");
		double Ele = sc.nextDouble();
		System.out.println("Average of marks of maths,CS,electronics is : "+getAverage(maths,CS,Ele));
	}

}
