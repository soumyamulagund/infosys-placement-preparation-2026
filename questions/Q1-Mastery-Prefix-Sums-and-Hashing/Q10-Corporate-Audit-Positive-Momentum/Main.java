import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) {
            return;
        }

        int n = Integer.parseInt(line.trim());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // TODO: Read input - Completed above

        // TODO: Process test cases if specified (Single testcase)

        // TODO: Implement the solution
        // Crucial Insight:
        // Do NOT compute products directly (overflow!).
        // Track:
        // - posLen: length of longest subarray ending here with positive product
        // - negLen: length of longest subarray ending here with negative product
        // Reset both to 0 when encountering 0.
        // Update maxLen with posLen at each step.

        int maxLen = 0;

        // TODO: Print output
        System.out.println(maxLen);
    }
}

