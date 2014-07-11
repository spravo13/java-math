import java.util.Scanner;
public class quadraticFormula {
	public void quadraticFormula(){
		double a, b, c, d, e, s1, s2;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("A Value = ");
		a = keyboard.nextDouble();
		System.out.print("B Value = ");
		b = keyboard.nextDouble();
		System.out.print("C Value = ");
		c = keyboard.nextDouble();
		d = (b * b) - (4 * a * c);
		e = Math.sqrt(d);
		s1 = (-b + e) / 2 * a;
		s2 = (-b - e) / 2 * a;
		System.out.printf("Solution 1 = (");
		System.out.print(s1);
		System.out.println(",0)");
		System.out.printf("Solution 2 = (");
		System.out.print(s2);
		System.out.println(",0)");
	}
}

