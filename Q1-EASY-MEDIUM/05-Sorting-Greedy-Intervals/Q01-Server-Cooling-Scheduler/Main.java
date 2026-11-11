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

        int[] s = new int[n];
        int[] e = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            e[i] = Integer.parseInt(st.nextToken());
        }

        // TODO: Read input - Completed above

        // TODO: Process test cases if specified (Single testcase)

        // TODO: Implement the solution
        // Strategy hint:
        // - Do we need to pair start and end times together, or can we track events chronologically?
        // - If we sort start times and end times independently, how does a two-pointer approach track concurrent demand?
        // - Remember condition: if s[i] <= e[j], an extra rack is needed.

        int minRacks = 0;

        // TODO: Print output
        System.out.println(minRacks);
    }
}

