package DSA;

import java.util.Scanner;

public class Right_angletriangle_or_not {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter three numbers:");
		        double a = scanner.nextDouble();
		        double b = scanner.nextDouble();
		        double c = scanner.nextDouble();

		        boolean isRightAngleTriangle = isRightAngleTriangle(a, b, c);

		        if (isRightAngleTriangle) {
		            System.out.println("Yes, it can form a right-angle triangle.");
		        } else {
		            System.out.println("No, it cannot form a right-angle triangle.");
		        }
		    }

		    public static boolean isRightAngleTriangle(double a, double b, double c) {
		        double epsilon = 1e-6; 
		        return Math.abs((a * a + b * b) - c * c) < epsilon;
		    }
		}


	
