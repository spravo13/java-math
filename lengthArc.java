import java.util.Scanner;
public class lengthArc {
	public void lengthArc(){
		double d, a, l;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Diameter = ");
		d = keyboard.nextDouble();
		System.out.print("Angle Measure = ");
		a = keyboard.nextDouble();
		l = (Math.PI * d) * (a / 360);
			if (a > 360 || a < 0){
				System.out.println("Angle Measure Is Impossible");
			}else{
				System.out.print("Circumference = ");
				System.out.println(l);
		}
	}
}
