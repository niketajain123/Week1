import java.util.Scanner;

public class MarksCalculation{
    // generating randomo marks
    public int[][] generateRandomScores(int n){
        int[][] scores = new int[n][3];
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                scores[i][j] = (int)(Math.random()*100);
            }
        }
        return scores;
    }

    public double[][] calculateTotalAveragePercentage(int[][] scores){
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total; // Total
            results[i][1] = Math.round(average * 100.0) / 100.0; // Average rounded to 2 digits
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage rounded to 2 digits
        }
        return results;
    }
	//storing grades
    public String[] calculateGrade(double[][] percentages){
        String[] grades = new String[percentages.length];
        for (int i = 0; i < percentages.length; i++) {
            double percentage = percentages[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }
	
	//printing result
   public void displayScorecard(int[][] scores, double[][] results, String[] grades) {
     System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
    
    for (int i = 0; i < scores.length; i++) {
        System.out.println(
            (i + 1) + "\t" + 
            scores[i][0] + "\t" + 
            scores[i][1] + "\t\t" + 
            scores[i][2] + "\t" + 
            (int)results[i][0] + "\t" + 
            results[i][1] + "\t" + 
            results[i][2] + "\t\t" + 
            grades[i]
        );
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//taking input
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
		//method calling
		MarksCalculation marks=new MarksCalculation();
		int[][] pcmScores = marks.generateRandomScores(numberOfStudents);
		double[][] results = marks.calculateTotalAveragePercentage(pcmScores);
		String[] grades = marks.calculateGrade(results);
		System.out.println("Students result:");
        marks.displayScorecard(pcmScores, results, grades);
		//closing sc
        sc.close();
    }
}