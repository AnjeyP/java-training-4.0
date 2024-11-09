/**
 * ArrayUtil exercises.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        Set<String> set1 = new HashSet<>();
        Set<String> commonElements = new HashSet<>();

        // Add all elements of the first array to the set
        Collections.addAll ( set1, array1 );

        // Check for common elements in the second array
        for (String s : array2) {
            if (set1.contains(s)) {
                commonElements.add(s);
            }
        }

        // Convert the set of common elements to an array
        return commonElements.toArray(new String[0]);
    }
}