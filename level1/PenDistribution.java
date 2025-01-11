public class PenDistribution{
	public static void main(String[]args){
		//create a variable pens to indicate number of pens
		int pens=14;
		//create a variable students to indicate number of students
		int students=3;
		//create a variable penPerStudent to indicate number of pens per student
		//logic used for penPerStudent=>pens/students
		int penPerStudent=pens/students;
		//create a variable remainingPen to indicate remaining non-distributed pen
		//logic used for remainingPen=> pens%students
		int remainingPen=pens%students;
		//printing pen per student and remaining non-distributed pens 
		System.out.println("The Pen Per Student is "+penPerStudent+" and the remaining pen not distributed is "+remainingPen);
	}
}