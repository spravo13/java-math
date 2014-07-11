import java.util.Scanner;
public class saSphere {
	public void saSphere(){
		double r, sa;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Radius = ");
		r = keyboard.nextDouble();
	    sa = 4 * Math.PI * r * r;
		System.out.print("Surface Area = ");
		System.out.println(sa);
	}
}
