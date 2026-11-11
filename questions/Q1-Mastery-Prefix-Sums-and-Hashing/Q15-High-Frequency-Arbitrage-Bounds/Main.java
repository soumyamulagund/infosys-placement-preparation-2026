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
        long lower = Long.parseLong(st.nextToken());
        long upper = Long.parseLong(st.nextToken());

        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        // TODO: Read input - Completed above

        // TODO: Process test cases if specified (Single testcase)

        // TODO: Implement the solution
        // Strategy Options:
        // - Subtask 1 (50% test cases): Compute prefix sums array in O(N).
        //   Run two nested loops to check (prefix[j+1] - prefix[i]) in [lower, upper].
        //   Takes O(N^2) time -> Guaranteed 50% partial points on Infosys SP!
        // - Subtask 2 (100% test cases): Use Divide & Conquer (Merge Sort) on prefix sums
        //   to count valid pairs (i, j) in O(N log N).

        long validSubarrays = 0;

        // TODO: Print output
        System.out.println(validSubarrays);
    }
}

