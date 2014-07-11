import java.util.Scanner;
public class discriminant {
	public void discriminant(){
		double a, b, c, d;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("A Value = ");
		a = keyboard.nextDouble();
		System.out.print("B Value = ");
		b = keyboard.nextDouble();
		System.out.print("C Value = ");
		c = keyboard.nextDouble();
		d = (b * b) - (4 * a * c);
		if (d > 0) {
			System.out.print("Two Solutions. Discriminant Value = ");
			System.out.println(d);
		} else if (d < 0) {
			System.out.print("No Real Solutions. Discriminant Value = ");
			System.out.println(d);
		} else {
			System.out.print("One Solution. Discriminant Value = ");
			System.out.println(d);
		}
	}
}
