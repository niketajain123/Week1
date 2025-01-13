import java.util.Scanner;

public class DistanceBetweenPoints {

     public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2]; 
        if (x1 != x2) {
            double slope = (y2 - y1) / (x2 - x1);
            double yIntercept = y1 - slope * x1;

            result[0] = slope;      
            result[1] = yIntercept;   
        } else {
            result[0] = Double.POSITIVE_INFINITY; 
            result[1] = Double.NaN;               
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coordinates for two points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance +"%n");

        // Calculate the equation of the line
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        if (x1 != x2) {
            System.out.println("Equation of the line: y = " + lineEquation[0] +"x" + lineEquation[1] + "%n");
        } else {
            System.out.println("The line is vertical with undefined slope.");
        }

        sc.close();
    }
}