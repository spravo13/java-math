import java.util.Scanner;
public class volumeSphere {
	public void volumeSphere(){
		double r, v;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Radius = ");
		r = keyboard.nextDouble();
		v = (4/3) * (Math.PI * r * r *r);
		System.out.print("Volume = ");
		System.out.println(v);
	}
}

