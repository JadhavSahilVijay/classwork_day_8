package classwork_day_8;
import java.util.*;
public class q4 {

	public static double perimeter(double a,double b,double c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of base");
		double base = sc.nextDouble();
		System.out.println("enter the size of side1");
		double side1 = sc.nextDouble();
		System.out.println("enter the size of side2");
		double side2 = sc.nextDouble();
		System.out.println("permeter of traingle is : "+perimeter(side1,base,side2));
	}

}
