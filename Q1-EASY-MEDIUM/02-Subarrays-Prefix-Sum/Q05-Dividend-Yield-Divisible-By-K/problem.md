# Q05: Dividend Yield Divisible by K

> **Assessment Metadata**
> - **Target Role:** Both (DSE / Specialist Programmer)
> - **Reported Period:** 2024 National Qualifier
> - **Verification Status:** Candidate-reported PYQ
> - **Difficulty Tier:** Easy–Medium
> - **Source Reference:** Infosys Investment Dividend Modulo Batching Problem

---

## Problem Statement
An institutional wealth management firm distributes daily dividend returns to mutual fund clients over $N$ consecutive business days. Each day's net payout $P_i$ can be positive, negative (due to capital adjustments), or zero.

To package returns into standardized investment tranches of batch size $K$, the auditing department needs to compute the **total number of non-empty contiguous time intervals** where the aggregate sum of dividends is **strictly divisible by $K$** (i.e., $(\sum_{m=i}^j P_m) \pmod K = 0$).

---

## Input Format
- The first line contains two space-separated integers, $N$ (number of days) and $K$ (tranche divisor).
- The second line contains $N$ space-separated integers, $P_1, P_2, \dots, P_N$.

## Output Format
- Print a single 64-bit integer (`long`) representing the total number of contiguous day intervals with a sum divisible by $K$.

---

## Constraints
- $1 \le N \le 2 \times 10^5$
- $1 \le K \le 10^5$
- $-10^9 \le P_i \le 10^9$
- **Critical Java Caveat:** In Java, `(-7) % 5` evaluates to `-2` rather than `3`. To map negative sums correctly to the canonical remainder range $[0, K-1]$, use the standardized formula:
  $$\text{rem} = ((\text{sum} \pmod K) + K) \pmod K$$

---

## Sample 1
### Sample Input
```text
6 5
4 5 0 -2 -3 1
```

### Sample Output
```text
7
```

### Explanation
The 7 contiguous subarrays with sum divisible by 5 are:
1. $[4, 5, 0, -2, -3, 1] \to \text{Sum} = 5$ (divisible by 5)
2. $[5] \to \text{Sum} = 5$
3. $[5, 0] \to \text{Sum} = 5$
4. $[5, 0, -2, -3] \to \text{Sum} = 0$
5. $[0] \to \text{Sum} = 0$
6. $[0, -2, -3] \to \text{Sum} = -5$
7. $[-2, -3] \to \text{Sum} = -5$

Total = 7.

---

## Sample 2
### Sample Input
```text
5 5
5 5 5 5 5
```

### Sample Output
```text
15
```

### Explanation
Every possible non-empty subarray is a multiple of 5. Count = $5 \times 6 / 2 = 15$.

---

## Additional Test Cases

### Test Case 3
**Input:**
```text
3 3
1 2 3
```
**Output:**
```text
3
```
*(Subarrays: [1, 2] sum=3, [3] sum=3, [1, 2, 3] sum=6)*

---

## Expected Time Complexity
$O(N)$ using Prefix Sum Modulo + Frequency Array / Map of size $K$.

## Difficulty Level
Easyâ€“Medium

---

## Edge Cases to Consider
- Negative dividend sums resulting in negative Java modulo
- Subarray sum equals 0 (0 is divisible by any K)
- All elements multiples of K


