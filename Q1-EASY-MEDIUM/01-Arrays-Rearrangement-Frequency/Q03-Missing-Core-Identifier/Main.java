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
        // Requirements:
        // - Find missing number in range [1, N+1]
        // - O(N) time
        // - O(1) space
        // - Beware of overflow if using arithmetic sum formula (N*(N+1)/2 exceeds 2^31-1 for N=200,000!)
        // - Consider Bitwise XOR: X ^ X = 0 and X ^ 0 = X

        long missingCore = 0;

        // TODO: Print output
        System.out.println(missingCore);
    }
}

