import java.util.Scanner;
public class interest {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 // Input principal amount, number of years, and rate of interest
 System.out.print("Enter Principal Amount: ");
 double principal = scanner.nextDouble();
 System.out.print("Enter No. of Years: ");
 double years = scanner.nextDouble();
 System.out.print("Enter Rate of Interest: ");
 double rate = scanner.nextDouble();
 // Calculate interest
 double interest = (principal * years * rate) / 100;
 // Calculate final amount
 double finalAmount = principal + interest;
 // Display results
 System.out.println("Calculated Interest: " + interest);
 System.out.println("Final Amount: " + finalAmount);
 }
}