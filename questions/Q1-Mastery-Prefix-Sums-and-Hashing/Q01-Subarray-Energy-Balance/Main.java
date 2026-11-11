import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) {
            return;
        }

        int t = Integer.parseInt(line.trim());

        // TODO: Process test cases if specified
        for (int tc = 0; tc < t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long k = Long.parseLong(st.nextToken());

            long[] arr = new long[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(st.nextToken());
            }

            // TODO: Read input - Completed above

            // TODO: Implement the solution
            // Track prefix sum and earliest index where each sum was seen.
            // Be mindful of:
            // 1. Negative numbers and zero in the array.
            // 2. Large constraints: O(N) required.
            // 3. 64-bit integer overflow (use Long).

            int maxLen = 0;

            // TODO: Print output
            System.out.println(maxLen);
        }
    }
}

