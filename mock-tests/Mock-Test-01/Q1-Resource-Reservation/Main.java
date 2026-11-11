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
        
        // TODO: Read the N jobs (start time, end time, cores required)
        
        // TODO: Model events for sweep-line (start adds cores, end removes cores)
        
        // TODO: Sort events chronologically (handle tie-breaking: end before start at same timestamp)
        
        // TODO: Sweep through events and track peak concurrent core requirement
        
        // TODO: Print the peak core requirement
    }
}

