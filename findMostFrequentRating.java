import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of ratings
        System.out.print("Enter the number of product ratings: ");
        int n = scanner.nextInt();

        int[] ratings = new int[n];

        // Taking input for ratings
        System.out.println("Enter the ratings:");
        for (int i = 0; i < n; i++) {
            ratings[i] = scanner.nextInt();
        }

        // Finding the most frequent rating
        int mostFrequent = findMostFrequentRating(ratings);

        // Displaying the result
        System.out.println("The most frequent rating is: " + mostFrequent);

        // Closing scanner
        scanner.close();
    }

    public static int findMostFrequentRating(int[] ratings) {
        Arrays.sort(ratings); // Sort the array first

        int mostFrequent = ratings[0];
        int maxCount = 1, currentCount = 1;

        // Iterate through the sorted array to find the most frequent element
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] == ratings[i - 1]) {
                currentCount++; // Increase count for the same rating
            } else {
                currentCount = 1; // Reset count for a new rating
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                mostFrequent = ratings[i];
            }
        }

        return mostFrequent;
    }
}