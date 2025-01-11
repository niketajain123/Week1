public class SamPercentage{
	public static void main(String[]args){
		//create a variable mathMarks to indicate marks in math's
		int mathMarks=94;
		//create a variable physicsMarks to indicate marks in physics		
		int physicsMarks=95;
		//create a variable chemistryMarks to indicate marks in chemistry
		int chemistryMarks=96;
		//create a variable maxMarks to indicate maximum marks in every subjects
		int maxMarks=100;
		//create a variable avgPercent to indicate average percent marks 
		//logic used is => total obtained marks/total maximum marks *100
		double avgPercent=(double)(mathMarks+physicsMarks+chemistryMarks)/300*100;
		//printing average percent marks in PCM 
		System.out.println("Sam's average mark in PCM is "+avgPercent);
	}
}