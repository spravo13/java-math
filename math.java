import java.util.Scanner;
public class math {
	public static void main(String args[]) {
	while (0 == 0){
		Scanner keyboard = new Scanner(System.in);
		String program;
		System.out.print("Select A Program: ");
		program = keyboard.next();
		switch (program){
//area of parallelogram
		case "aop":
			areaParallelogram areaParallelogramObject = new areaParallelogram(); 
			areaParallelogramObject.areaParallelogram();
			break;
//area of circle
		case "aoc":
			areaCircle areaCircleObject = new areaCircle();
			areaCircleObject.areaCircle();
			break;
//area of trapezoid
		case "aot":
			areaTrapezoid areaTrapezoidObject = new areaTrapezoid();
			areaTrapezoidObject.areaTrapezoid();
			break;
//area of triangle
		case "aotr":
			areaTriangle areaTriangleObject = new areaTriangle();
			areaTriangleObject.areaTriangle();
			break;
//surface area of cylinder
		case "saoc":
			saCylinder saCylinderObject = new saCylinder();
			saCylinderObject.saCylinder();
			break;
//volume of cylinder
		case "voc":
			volumeCylinder volumeCylinderObject = new volumeCylinder();
			volumeCylinderObject.volumeCylinder();
			break;
//surface area of sphere
		case "saos":
			saSphere saSphereObject = new saSphere();
			saSphereObject.saSphere();
			break;
//volume of sphere
		case "vos":
			volumeSphere volumeSphereObject = new volumeSphere();
			volumeSphereObject.volumeSphere();
			break;
//circumference 
		case "c":
			circumference circumferenceObject = new circumference();
			circumferenceObject.circumference();
			break;
//length of arc
		case "loc":
			lengthArc lengthArcObject = new lengthArc();
			lengthArcObject.lengthArc();
			break;
//area of sector
		case "aos":
			areaSector areaSectorObject = new areaSector();
			areaSectorObject.areaSector();
			break;
//discriminant
		case "d":
			discriminant discriminantObject = new discriminant();
			discriminantObject.discriminant();
			break;
//quadratic formula 
		case "qf":
			quadraticFormula quadraticFormulaObject = new quadraticFormula();
			quadraticFormulaObject.quadraticFormula();
			break;
//if all else fails
		default:
			System.out.println("That Is Not A Program");
		break;
			}
		}
	}
}
