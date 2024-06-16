package Arrays;
import java.util.Arrays;

public class SortArrayIndex {
		public static void main(String[] args) {
        int[] numbers = {54, 26, 93, 17, 77, 31, 44, 55, 20, 88}; // Sample array

        // Create a map to store the previous indices
        int[] previousIndices = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            previousIndices[i] = i;
        }

        // Sort the array and update the previous indices accordingly
        Integer[] numbersWithIndices = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersWithIndices[i] = i;
        }
        Arrays.sort(numbersWithIndices, (i1, i2) -> Integer.compare(numbers[i1], numbers[i2]));

        // Print the sorted array and previous indices
        for (int i = 0; i < numbers.length; i++) {
            int index = numbersWithIndices[i];
            System.out.println(numbers[index] + " (previous index: " + previousIndices[index] + ")");
            previousIndices[index] = -1; // Mark as printed
        }
    }
}

