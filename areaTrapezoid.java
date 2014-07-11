import java.util.Scanner;
public class areaTrapezoid {
	public void areaTrapezoid(){
		double h, b1, b2, a;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Height Of Trapezoid = ");
		h = keyboard.nextDouble();
		System.out.print("Base One Length = ");
		b1 = keyboard.nextDouble();
		System.out.print("Base Two Length = ");
		b2 = keyboard.nextDouble();
		a = ((b1 + b2) / 2) * h;			
		System.out.print("Area = ");
		System.out.println(a);
	}
}
