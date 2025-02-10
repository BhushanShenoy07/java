import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class triplet {
    public static Set<List<Integer>> findTripletsWithSum(int[] arr, int targetSum) {
        int n = arr.length;
        Set<List<Integer>> triplets = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == targetSum) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(arr[i]);
                        triplet.add(arr[j]);
                        triplet.add(arr[k]);
                        triplets.add(triplet);
                    }
                }
            }
        }

        return triplets;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arrayEl = scanner.nextInt();

        int[] array = new int[arrayEl];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arrayEl; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter target sum: ");
        int targetSum = scanner.nextInt();

        Set<List<Integer>> result = findTripletsWithSum(array, targetSum);
        if (!result.isEmpty()) {
            int count = 0;
            System.out.println("Triplets with the sum of " + targetSum + " are:");
            for (List<Integer> triplet : result) {
                System.out.println(triplet);
                count++;
            }
            System.out.println("Number of pairs: " + count);
        } else {
            System.out.println("No triplets found with the sum of " + targetSum);
        }

        scanner.close();
    }
}