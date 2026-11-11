import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
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
        // Requirements:
        // - In-place rearrangement: a[0] >= a[1] <= a[2] >= a[3] ...
        // - O(N) time without sorting
        // - O(1) extra space
        // Hint: Traverse all even indices i (0, 2, 4, ...).
        // Ensure arr[i] >= arr[i-1] (if i > 0) and arr[i] >= arr[i+1] (if i < n-1) by swapping when needed.

        // TODO: Print output
        for (int i = 0; i < n; i++) {
            out.print(arr[i] + (i == n - 1 ? "" : " "));
        }
        out.println();
        out.flush();
    }
}

