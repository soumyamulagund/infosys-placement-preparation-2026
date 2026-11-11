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

        // TODO: Process test cases if specified (Single test case)

        // TODO: Implement the solution
        // Hint:
        // - A subarray sum from index (i+1) to j is 0 if and only if prefix[j] == prefix[i].
        // - Count frequency of each seen prefix sum using a Map<Long, Long>.
        // - Be sure to initialize prefix sum 0 with frequency 1!

        long zeroSumCount = 0;

        // TODO: Print output
        System.out.println(zeroSumCount);
    }
}

