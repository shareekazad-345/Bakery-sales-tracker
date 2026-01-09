import java.util.Scanner;

public class BakerySalesTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int days = scanner.nextInt();

        double[] sales = new double[days];
        double total = 0;

        // Input daily sales
        for (int i = 0; i < days; i++) {
            System.out.print("Enter sales for day " + (i + 1) + ": Rs ");
            sales[i] = scanner.nextDouble();
            total += sales[i];
        }

        // Calculate average
        double average = total / days;

        // Display results
        System.out.println("\n--- Bakery Sales Report ---");
        System.out.println("Total sales: Rs " + total);
        System.out.println("Average daily sales: Rs " + average);

        scanner.close();
    }
}