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
        int k = Integer.parseInt(st.nextToken());
        
        long[] tasks = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            tasks[i] = Long.parseLong(st.nextToken());
        }
        
        // TODO: Determine search space boundaries (low and high)
        // low = maximum individual task execution time
        // high = sum of all task execution times
        
        // TODO: Implement binary search on the answer space
        
        // TODO: Write a greedy helper/predicate function to check if workload limit is achievable with <= K workers
        
        // TODO: Print the minimum possible maximum workload
    }
}

