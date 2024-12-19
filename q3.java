package classwork_day_8;
import java.util.*;
public class q3 {

	public static double Area(double r) {
		return 3.14*r*r;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius of circle");
		double radius = sc.nextDouble();
		System.out.println("area of circle is : "+Area(radius));

	}

}
