import java.util.Scanner;

public class Main {
	public static void main() {
		double radius;
		double area;
		double perimeter;
		
		Scanner x = new Scanner(System.in);
		radius = x.nextDouble();
		area = Math.PI*Math.pow(radius, 2);
		perimeter = 2*Math.PI*radius;
		System.out.println("Half Area:"+ area/2);
		
	}
}



