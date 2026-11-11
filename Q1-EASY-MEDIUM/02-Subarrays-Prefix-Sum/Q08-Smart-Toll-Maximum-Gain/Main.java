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
        long[] arr = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        // TODO: Read input - Completed above

        // TODO: Process test cases if specified (Single testcase)

        // TODO: Implement the solution
        // Hint:
        // - Initialize maxSoFar = arr[0] and currentSum = arr[0] (handle all-negative arrays!).
        // - For each i from 1 to n-1:
        //     currentSum = Math.max(arr[i], currentSum + arr[i]);
        //     maxSoFar = Math.max(maxSoFar, currentSum);

        long maxSubarraySum = arr[0];

        // TODO: Print output
        System.out.println(maxSubarraySum);
    }
}

