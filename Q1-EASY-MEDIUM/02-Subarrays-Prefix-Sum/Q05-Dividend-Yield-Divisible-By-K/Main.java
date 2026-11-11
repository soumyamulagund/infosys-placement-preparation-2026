import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) {
            return;
        }

        StringTokenizer st = new StringTokenizer(line);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        // TODO: Read input - Completed above

        // TODO: Process test cases if specified (Single test case)

        // TODO: Implement the solution
        // Mathematical Insight:
        // (prefix[j] - prefix[i]) % k == 0 <=> prefix[j] % k == prefix[i] % k
        // Important: Handle negative modulo using: rem = ((sum % k) + k) % k
        // Maintain counts of each remainder seen so far.
        // Remainder 0 starts with count 1 (for subarrays starting at index 0).

        long validIntervals = 0;

        // TODO: Print output
        System.out.println(validIntervals);
    }
}

