# Q04: Battery Storage Target Count

> **Assessment Metadata**
> - **Target Role:** Specialist Programmer
> - **Reported Period:** 2023 Specialist Programmer Assessment
> - **Verification Status:** Verified PYQ
> - **Difficulty Tier:** Easy–Medium
> - **Source Reference:** Infosys SP Battery Power Cycle Target Match

---

## Problem Statement
A grid-scale renewable energy storage facility monitors continuous charging and discharging cycles. Over $N$ time blocks, the facility logs net power exchange values $B_1, B_2, \dots, B_N$ in kilowatt-hours (kWh). Positive values indicate charging into the battery reserves, while negative values indicate power drawn by the regional grid.

The grid controller wants to find the **total number of contiguous time windows** during which the cumulative energy exchange was **exactly $K$ kWh**.

---

## Input Format
- The first line contains two space-separated integers, $N$ (number of recorded blocks) and $K$ (target cumulative energy).
- The second line contains $N$ space-separated integers, $B_1, B_2, \dots, B_N$.

## Output Format
- Print a single 64-bit integer (`long`) representing the total count of contiguous intervals whose sum equals $K$.

---

## Constraints
- $1 \le N \le 2 \times 10^5$
- $-10^9 \le B_i \le 10^9$
- $-10^{14} \le K \le 10^{14}$
- The total count of matching subarrays can reach $N(N+1)/2 \approx 2 \times 10^{10}$, so the counter must be a `long`.

---

## Sample 1
### Sample Input
```text
5 -10
10 2 -2 -20 10
```

### Sample Output
```text
3
```

### Explanation
The 3 contiguous windows summing to $-10$ are:
1. Indices $0$ to $3$: $[10, 2, -2, -20] \to \text{Sum} = -10$
2. Indices $1$ to $4$: $[2, -2, -20, 10] \to \text{Sum} = -10$
3. Indices $3$ to $4$: $[-20, 10] \to \text{Sum} = -10$

Total count = 3.

---

## Sample 2
### Sample Input
```text
3 2
1 1 1
```

### Sample Output
```text
2
```

### Explanation
Subarrays with sum 2 are $[1, 1]$ (indices 0..1) and $[1, 1]$ (indices 1..2). Total = 2.

---

## Additional Test Cases

### Test Case 3 (Target not reachable)
**Input:**
```text
4 100
1 2 3 4
```
**Output:**
```text
0
```

### Test Case 4 (Target 0 with multiple zeroes)
**Input:**
```text
3 0
0 0 0
```
**Output:**
```text
6
```

---

## Expected Time Complexity
$O(N)$ using Prefix Sum + Frequency Map (`HashMap<Long, Long>`).

## Difficulty Level
Easyâ€“Medium

---

## Edge Cases to Consider
- Negative target K
- Consecutive zero exchanges inflating counts
- Total count exceeds 2^31 - 1


