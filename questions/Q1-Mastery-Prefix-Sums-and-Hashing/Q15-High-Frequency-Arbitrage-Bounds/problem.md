# Q15: High-Frequency Arbitrage Bounds

## Problem Statement
A quantitative execution engine evaluates a chronological sequence of $N$ high-frequency arbitrage yield variances $A_1, A_2, \dots, A_N$ (expressed as integers, which can be positive, negative, or zero).

The risk oversight algorithm flags trading intervals whose aggregate net return falls strictly within a target safe volatility band $[L, R]$:
$$L \le \sum_{k=i}^j A_k \le R$$

Count the **total number of contiguous subsegments** whose sum lies within the inclusive range $[L, R]$.

---

## Input Format
- The first line contains three space-separated integers: $N$ (number of yield variances), $L$ (lower bound), and $R$ (upper bound).
- The second line contains $N$ space-separated integers, $A_1, A_2, \dots, A_N$.

## Output Format
- Print a single 64-bit integer (`long`) representing the total number of valid contiguous intervals.

---

## Constraints
- $1 \le N \le 10^5$
- $-10^9 \le L \le R \le 10^9$
- $-10^9 \le A_i \le 10^9$

### Subtask Scoring (Specialist Programmer Exam Pattern):
- **Subtask 1 (50% test cases):** $N \le 2000$. An $O(N^2)$ prefix sum approach easily passes all Subtask 1 test cases to secure 50 marks!
- **Subtask 2 (50% test cases):** $N \le 10^5$. Requires an $O(N \log N)$ approach (Merge Sort counting or Fenwick Tree over prefix sums).

---

## Sample 1
### Sample Input
```text
3 -2 2
0 2 -1
```

### Sample Output
```text
6
```

### Explanation
We evaluate all 6 possible non-empty contiguous subarrays:
- $[0] \to \text{Sum} = 0 \in [-2, 2]$
- $[2] \to \text{Sum} = 2 \in [-2, 2]$
- $[-1] \to \text{Sum} = -1 \in [-2, 2]$
- $[0, 2] \to \text{Sum} = 2 \in [-2, 2]$
- $[2, -1] \to \text{Sum} = 1 \in [-2, 2]$
- $[0, 2, -1] \to \text{Sum} = 1 \in [-2, 2]$

All 6 subarrays satisfy the condition. Total = 6.

---

## Sample 2
### Sample Input
```text
4 3 6
1 2 3 4
```

### Sample Output
```text
5
```

### Explanation
Subarrays with sum between 3 and 6:
- $[3] \to 3$
- $[4] \to 4$
- $[1, 2] \to 3$
- $[2, 3] \to 5$
- $[1, 2, 3] \to 6$
Total count = 5.

---

## Expected Time Complexity
- Partial solution (50% points): $O(N^2)$
- Optimal solution (100% points): $O(N \log N)$

## Difficulty Level
Medium (Specialist Programmer Tier)

## Topic and Pattern
Prefix Sums / Range-Bounded Subarray Sums

