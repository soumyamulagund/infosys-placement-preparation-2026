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
        // 1. Compute total sum of all elements in long.
        // 2. Iterate through array while maintaining leftSum.
        // 3. For each index i, rightSum = totalSum - leftSum - arr[i].
        // 4. If leftSum == rightSum, return i.

        int equilibriumIndex = -1;

        // TODO: Print output
        System.out.println(equilibriumIndex);
    }
}

