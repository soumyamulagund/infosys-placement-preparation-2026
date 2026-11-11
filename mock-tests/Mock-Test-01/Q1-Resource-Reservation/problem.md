# Q1: Cloud Server Resource Reservation

## Problem Statement
A high-performance cloud data center manages compute jobs. Each job requires an allocation of CPU cores across a specific time interval. You are given $N$ jobs, where the $i$-th job starts at timestamp $S_i$, ends at timestamp $E_i$, and requires $C_i$ CPU cores throughout its runtime.

The time intervals are inclusive of the start time and exclusive of the end time $[S_i, E_i)$. That is, a job running from 2 to 5 occupies cores during time 2, 3, and 4, but releases them at time 5.

Your task is to compute the **peak number of CPU cores** concurrently utilized across all timestamps.

---

## Input Format
- The first line contains an integer $N$, denoting the number of jobs.
- The next $N$ lines each contain three space-separated integers: $S_i$, $E_i$, and $C_i$.

## Output Format
- Print a single integer representing the peak number of CPU cores required at any instant.

---

## Constraints
- $1 \le N \le 10^5$
- $1 \le S_i < E_i \le 10^9$
- $1 \le C_i \le 10^4$
- The peak sum can exceed $2^{31}-1$; use 64-bit integers (`long`) in Java.

---

## Sample 1
### Sample Input
```text
3
1 5 10
2 4 15
4 7 20
```

### Sample Output
```text
25
```

### Explanation
- From $t = 1$ to $2$: Job 1 runs $\to 10$ cores.
- From $t = 2$ to $4$: Job 1 ($10$) and Job 2 ($15$) run concurrently $\to 25$ cores.
- At $t = 4$: Job 2 ends. Job 3 starts ($20$) and Job 1 continues ($10$) $\to 30$? Wait, Job 2 ends at 4, but Job 1 runs till 5 ($10$ cores) + Job 3 starts at 4 ($20$ cores) $\to 30$ cores!
Wait, let's trace:
At $t = 1$: +10 (total 10)
At $t = 2$: +15 (total 25)
At $t = 4$: Job 2 ends (-15), Job 3 starts (+20) -> net at $t=4$ is $25 - 15 + 20 = 30$!
Let's double-check:
If at $t = 4$, Job 2 finishes and releases 15 cores before Job 3 takes 20 cores, then:
Job 1: runs [1, 5) -> active at t=1, 2, 3, 4.
Job 2: runs [2, 4) -> active at t=2, 3.
Job 3: runs [4, 7) -> active at t=4, 5, 6.
At t=2, 3: Job 1 (10) + Job 2 (15) = 25.
At t=4: Job 1 (10) + Job 3 (20) = 30.
Max is 30!
Let's adjust sample input to match 25 or output 30.
Let's make sample input:
```text
3
1 4 10
2 5 15
5 8 20
```
Trace:
Job 1: [1, 4), cores = 10
Job 2: [2, 5), cores = 15
Job 3: [5, 8), cores = 20
- t in [1, 2): Job 1 = 10
- t in [2, 4): Job 1 (10) + Job 2 (15) = 25
- t in [4, 5): Job 2 = 15
- t in [5, 8): Job 3 = 20
Peak = 25!
```

---

## Sample 1 (Updated)
### Sample Input
```text
3
1 4 10
2 5 15
5 8 20
```

### Sample Output
```text
25
```

### Explanation
- From $t = 1$ to $2$: Job 1 is active (10 cores).
- From $t = 2$ to $4$: Job 1 and Job 2 are active (10 + 15 = 25 cores).
- From $t = 4$ to $5$: Only Job 2 is active (15 cores).
- From $t = 5$ to $8$: Only Job 3 is active (20 cores).
The peak number of cores required is 25.

---

## Sample 2
### Sample Input
```text
2
1 10 50
10 20 60
```

### Sample Output
```text
60
```

### Explanation
Job 1 ends at $t = 10$ and releases 50 cores. Job 2 starts at $t = 10$ needing 60 cores. Because intervals are $[S_i, E_i)$, they do not overlap at $t = 10$. Maximum cores at any instant is $\max(50, 60) = 60$.

---

## Expected Time Complexity
$O(N \log N)$ using Coordinate Compression / Event Sweep-line.

## Difficulty Level
Easy–Medium

## Topic and Pattern
Sorting & Intervals / Event Sweep-line

