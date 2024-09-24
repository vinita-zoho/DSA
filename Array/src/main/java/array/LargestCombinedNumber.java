package array;

import java.util.Arrays;
import java.util.Comparator;

public class LargestCombinedNumber {

    public static String largestNumber(String[] arr)
    {
        // Custom comparator to compare concatenated strings
        Comparator<String> myCompare
                = (X, Y) -> (X + Y).compareTo(Y + X);

        // Sort the array using the custom comparator
        Arrays.sort(arr, myCompare.reversed());

        // Handle the case where all numbers are zero
        if (arr[0].equals("0")) {
            return "0";
        }

        // Concatenate the sorted array
        StringBuilder result = new StringBuilder();
        for (String num : arr) {
            result.append(num);
        }

        return result.toString();
    }
}
