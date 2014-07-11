import java.util.Scanner;
public class saCylinder {
	public void saCylinder(){
		double r, h, sa;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Radius Of Cylinder = ");
		r = keyboard.nextDouble();
		System.out.print("Height Of Cylinder = ");
		h = keyboard.nextDouble();
		sa = ((2 * Math.PI * r) * h) + (( Math.PI * r * r) *2);
		System.out.print("Surface Area Is = ");
		System.out.println(sa);
	}
}
