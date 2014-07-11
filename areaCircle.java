import java.util.Scanner;
public class areaCircle {
	public void areaCircle(){
		double r, a;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Radius = ");
		r = keyboard.nextDouble();
		a = r * r * Math.PI;
		System.out.print("Area = ");
		System.out.println(a);
	}
}
