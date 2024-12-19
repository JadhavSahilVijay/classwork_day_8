package classwork_day_8;
import java.util.*;
public class q5 {

	public static void check(int n) {
		if(n<0) {
			System.out.println(n+" is negative");
		}else if(n==0) {
			System.out.println(n+" is 0");
		}else {
			System.out.println(n+" is positive");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		check(n);

	}

}
