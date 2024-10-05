import java.util.HashSet;
import java.util.Set;

public class DiverseArray {
    public static int arraySum(int[] array){
        int sum = 0;
        for(int num : array){ //iterates through each element num, calculates the sum of all elements
            sum += num; //add each element of the array to the sum
        }
        return sum;
    }

    public static int[] rowSums(int[][] array2d) {
        int[] sums = new int[array2d.length];
        for (int i = 0; i < array2d.length; i++) { // iterates over each row of array2d
            sums[i] = arraySum(array2d[i]);
        }
        return sums;
    }
    // Method to determine if a two-dimensional array is diverse VV
    public static boolean isDiverse(int[][] array2d) {
        int[] rowSums = rowSums(array2d);
        Set<Integer> sumSet = new HashSet<>(); // Create a set to store unique row sums
        for (int sum : rowSums) {
            if (sumSet.contains(sum)) {
                return false; // If duplicate sum found, array is not diverse
            } else {
                sumSet.add(sum);
            }
        }
        return true; // If all row sums are unique, array is diverse
    }
}
