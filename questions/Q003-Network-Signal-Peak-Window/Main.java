import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) {
            return;
        }

        int k = Integer.parseInt(line.trim());
        String s = br.readLine();
        if (s == null) {
            s = "";
        } else {
            s = s.trim();
        }

        // TODO: Read input - Completed above

        // TODO: Process test cases if specified (Single test case)

        // TODO: Implement the solution
        // Target: Longest substring with at most k distinct characters.
        // Considerations:
        // - Use a sliding window with left and right boundaries.
        // - Track character counts efficiently (an int[26] array is much faster than HashMap).
        // - Expand with right pointer; contract with left pointer when distinct > k.

        int maxLen = 0;

        // TODO: Print output
        System.out.println(maxLen);
    }
}

