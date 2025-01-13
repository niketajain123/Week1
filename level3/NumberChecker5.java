import java.util.Scanner;

public class NumberChecker5 {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

         int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

     public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 1]; // Largest factor is the last element in the sorted array
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static long productOfCubeOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number; // Exclude the number itself
        return sum == number;
    }

    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number; // Exclude the number itself
        return sum > number;
    }

    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number; // Exclude the number itself
        return sum < number;
    }

    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == originalNumber;
    }

    private static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": " + java.util.Arrays.toString(factors));
        System.out.println("Greatest factor of " + number + ": " + greatestFactor(number));
        System.out.println("Sum of factors of " + number + ": " + sumOfFactors(factors));
        System.out.println("Product of factors of " + number + ": " + productOfFactors(factors));
        System.out.println("Product of cube of factors of " + number + ": " + productOfCubeOfFactors(factors));
        System.out.println(number + " is a perfect number: " + isPerfectNumber(number));
        System.out.println(number + " is an abundant number: " + isAbundantNumber(number));
        System.out.println(number + " is a deficient number: " + isDeficientNumber(number));
        System.out.println(number + " is a strong number: " + isStrongNumber(number));
		//closing sc
        sc.close();
    }
}