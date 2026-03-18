/**
 * Name: James Ash
 * Date: 03-18-2026
 * Assignment: SDC230 Performance Assessment - Calculations & Unique Numbers
 * 
 * Description: This application collects 10 integer values from the user,
 * stores them in an array, extracts unique values into an ArrayList,
 * and calculates count, sum, and average for both collections.
 **/

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Step 1: Print heading
        System.out.println("\nJames Ash - Week 3 PA Calculations & Unique Numbers.\n");

        Scanner scanner = new Scanner(System.in);

        // Step 2: Create array
        int[] numbers = new int[10];

        // Step 3: Create ArrayList for unique numbers
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        // Step 4: Get user input
        System.out.println("Please enter 10 integer values:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            // Add to ArrayList only if not already present
            if (!uniqueNumbers.contains(numbers[i])) {
                uniqueNumbers.add(numbers[i]);
            }
        }

        // Step 5: Display results for array
        System.out.println("\n--- Array Results ---");
        displayStats(numbers);

        // Step 6: Display results for ArrayList
        System.out.println("\n--- Unique Numbers (ArrayList) Results ---");
        displayStats(uniqueNumbers);

        scanner.close();
    }

    // Method to display stats for array
    public static void displayStats(int[] arr) {
        int count = arr.length;
        int sum = calculateSum(arr);
        double average = (double) sum / count;

        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    // Method to display stats for ArrayList
    public static void displayStats(ArrayList<Integer> list) {
        int count = list.size();
        int sum = calculateSum(list);
        double average = (double) sum / count;

        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    // Method to calculate sum of array
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Overloaded method to calculate sum of ArrayList
    public static int calculateSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}