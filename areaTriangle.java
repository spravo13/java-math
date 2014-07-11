import java.util.Scanner;
public class areaTriangle {
	public void areaTriangle(){
		double b, h, a;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Length Of Base = ");
		b = keyboard.nextDouble();
		System.out.print("Height = ");
		h = keyboard.nextDouble();
		a = (b * h)/2 ;			
		System.out.print("Area = ");
		System.out.println(a);
	}
}
