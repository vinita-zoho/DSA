package array;

import java.util.HashMap;

/*
Given an array arr of positive integers and another number target.
Determine whether two elements exist in arr whose sum is exactly target or not.
Return a boolean value true if two elements exist in arr else return false.

Input: arr[] = [1, 4, 45, 6, 10, 8], target =16
Output: true
Explanation: arr[3] + arr[4] = 6 + 10 = 16
 */
public class TwoSum {

    // Function to check if array has 2 elements
    // whose sum is equal to the given value
    boolean twoSum(int arr[], int target) {
        int n = arr.length;
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int numberToFind = target - arr[i];
            // if numberToFind is found in map, return them
            if (hash.containsKey(numberToFind)) {
                return true;
            }
            // number was not found. Put it in the map.
            hash.put(arr[i], i);
        }
        return false;
    }
}
