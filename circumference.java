import java.util.Scanner;
public class circumference {
	public void circumference(){
		double d, c;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Diameter = ");
		d = keyboard.nextDouble();
		c = Math.PI * d;
		System.out.print("Circumference = ");
		System.out.println(c);
	}
}
