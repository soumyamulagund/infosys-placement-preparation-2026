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
        long h = Long.parseLong(st.nextToken());

        long[] a = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }

        // TODO: Read input - Completed above

        // TODO: Process test cases if specified (Single testcase)

        // TODO: Implement the solution
        // Strategy hint:
        // - Can we binary search on the minimum valid speed V?
        // - What is the lower bound (low) for V? (e.g. 1)
        // - What is the upper bound (high) for V? (e.g. max packet backlog in array)
        // - Be careful of integer ceiling formula: (x + mid - 1) / mid
        // - Accumulate total hours using long to prevent overflow.

        long answer = -1;

        // TODO: Print output
        System.out.println(answer);
    }
}

