import java.util.Scanner;
public class areaParallelogram {
	public void areaParallelogram(){
		double l, h, a;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Length Of Base = ");
		l = keyboard.nextDouble();
		System.out.print("Height = ");
		h = keyboard.nextDouble();
		a = l * h;			
		System.out.print("Area = ");
		System.out.println(a);
	}
}
