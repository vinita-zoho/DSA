package string;

public class FirstNonRepeatingChar {

    // Function to find the index of the first non-repeating
    // character
    public static int firstUniqChar(String s)
    {
        // Step 1: Initialize frequency array for 26
        // lowercase letters
        int[] freq = new int[26];

        // Step 2: Populate the frequency array
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Step 3: Find the first character with frequency 1
        for (int i = 0; i < s.length(); ++i) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
