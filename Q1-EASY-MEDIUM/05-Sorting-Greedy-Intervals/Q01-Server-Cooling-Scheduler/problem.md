# Q004: Server Cooling Scheduler

## Problem Statement
A high-density cloud computing facility runs $N$ intensive AI model training workloads. The $i$-th workload starts executing at timestamp $S_i$ and completes at timestamp $E_i$.

Throughout its execution interval $[S_i, E_i]$, each workload requires dedicated access to a specialized liquid-cooling rack.

Due to thermal dissipation cycles, if a workload completes at time $E_i$, its cooling rack cannot be immediately reused by another workload starting at the exact same timestamp $E_i$. Another workload can only safely reuse the rack if its start time $S_j$ is **strictly greater than** $E_i$ ($S_j > E_i$). If $S_j \le E_i$, an additional cooling rack must be deployed.

Given the start and end times for all $N$ workloads, determine the **minimum number of cooling racks** the facility must provision so that no workload is stalled.

---

## Input Format
- The first line contains an integer $N$, denoting the number of training workloads.
- The second line contains $N$ space-separated integers, $S_1, S_2, \dots, S_N$, representing the start times of the workloads.
- The third line contains $N$ space-separated integers, $E_1, E_2, \dots, E_N$, representing the end times of the workloads.

## Output Format
- Print a single integer representing the minimum number of cooling racks needed.

---

## Constraints
- $1 \le N \le 10^5$
- $0 \le S_i \le E_i \le 10^9$
- Arrays $S$ and $E$ are not necessarily given in sorted order.

---

## Sample 1
### Sample Input
```text
6
900 940 950 1100 1500 1800
910 1200 1120 1130 1900 2000
```

### Sample Output
```text
3
```

### Explanation
Timeline analysis:
- At time 900: Workload 1 starts $\to 1$ rack active.
- At time 910: Workload 1 completes $\to 1$ rack freed ($0$ racks active).
- At time 940: Workload 2 starts $\to 1$ rack active.
- At time 950: Workload 3 starts $\to 2$ racks active.
- At time 1100: Workload 4 starts $\to 3$ racks active (Peak concurrent demand).
- At time 1120: Workload 3 completes $\to 2$ racks active.
- At time 1130: Workload 4 completes $\to 1$ rack active.
- At time 1200: Workload 2 completes $\to 0$ racks active.
- At time 1500: Workload 5 starts $\to 1$ rack active.
- At time 1800: Workload 6 starts $\to 2$ racks active.
- At time 1900: Workload 5 completes $\to 1$ rack active.
- At time 2000: Workload 6 completes $\to 0$ racks active.

The maximum concurrent cooling rack requirement at any point in time is 3.

---

## Sample 2
### Sample Input
```text
3
1 5 10
4 8 12
```

### Sample Output
```text
1
```

### Explanation
- Workload 1 runs from 1 to 4.
- Workload 2 starts at 5 ($5 > 4$), so it reuses the same rack until 8.
- Workload 3 starts at 10 ($10 > 8$), so it again reuses the same rack.
Only 1 rack is needed.

---

## Additional Test Cases

### Test Case 3 (All completely overlapping)
**Input:**
```text
3
1 2 3
10 10 10
```
**Output:**
```text
3
```
*(Explanation: All 3 workloads run simultaneously between times 3 and 10, requiring 3 distinct racks)*

### Test Case 4 (Simultaneous start and end at same timestamp)
**Input:**
```text
2
1 5
5 10
```
**Output:**
```text
2
```
*(Explanation: Since $S_2 = 5 \le E_1 = 5$, the cooling unit cannot be transferred instantaneously; 2 racks are required)*

### Test Case 5 (Single workload)
**Input:**
```text
1
100
200
```
**Output:**
```text
1
```

---

## Expected Time Complexity
$O(N \log N)$ by sorting start and end times independently, followed by an $O(N)$ sweep.

## Difficulty Level
Easy–Medium

## Topic and Pattern
Sorting & Greedy / Interval Overlap (Two Pointers Sweep)

