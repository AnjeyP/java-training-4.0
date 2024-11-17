import java.util.Arrays;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        // TODO replace return with your code
        return Arrays.stream(numbers)
                // Filter for even numbers
                .filter(n -> n % 2 == 0)
                // Square each even number
                .map(n -> n * n)
                // Sum of all squared values
                .sum();
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        // TODO replace return with your code
        return Arrays.stream(numbers)
                // Filter for odd numbers
                .filter(n -> n % 2 != 0)
                // Sorting in ascending order
                .sorted()
                // Convert sorted values into integer array
                .toArray();
    }
}