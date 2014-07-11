import java.util.Scanner;
public class areaSector {
	public void areaSector(){
		double r, a, sa;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Radius = ");
		r = keyboard.nextDouble();
		System.out.print("Angle Measure = ");
		a = keyboard.nextDouble();
		sa = (Math.PI * r * r) * (a / 360);
			if (a > 360 || a < 0){
				System.out.println("Angle Measure Is Impossible");
			}else{
				System.out.print("Area Of Sector = ");
				System.out.println(sa);
		}
	}
}
