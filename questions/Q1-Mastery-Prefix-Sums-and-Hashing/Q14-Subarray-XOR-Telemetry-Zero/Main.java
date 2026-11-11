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
        // Property:
        // xor(i..j) == 0 <=> prefixXOR[j] == prefixXOR[i-1]
        // Maintain frequency map of prefix XOR values seen so far.
        // Initialize map with {0: 1L}.

        long zeroXorCount = 0;

        // TODO: Print output
        System.out.println(zeroXorCount);
    }
}

