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
        long capacity = Long.parseLong(st.nextToken());

        int maxStop = 100001;
        long[] stopDelta = new long[maxStop + 1];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            long passengers = Long.parseLong(st.nextToken());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            // TODO: Apply difference array updates at from and to
        }

        // TODO: Sweep through stopDelta and compute running sum
        // If running sum > capacity at any point, set possible = false

        boolean possible = true;

        // TODO: Print output
        System.out.println(possible ? "POSSIBLE" : "OVERLOAD");
    }
}

