package classwork_day_8;
import java.util.*;
public class q6 {

	public static void squareCube(int n) {
		System.out.println("sqare of "+n+" is "+(n*n));
		System.out.println("cube of "+n+" is "+(n*n*n));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		squareCube(n);
	}

}
