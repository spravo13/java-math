import java.util.Scanner;
public class volumeCylinder {
	public void volumeCylinder(){
		double r, h, v;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Radius Of Cylinder = ");
		r = keyboard.nextDouble();
		System.out.print("Height Of Cylinder = ");
		h = keyboard.nextDouble();
	    v = Math.PI * r * r * h;
		System.out.print("Volume = ");
		System.out.println(v);
	}
}
