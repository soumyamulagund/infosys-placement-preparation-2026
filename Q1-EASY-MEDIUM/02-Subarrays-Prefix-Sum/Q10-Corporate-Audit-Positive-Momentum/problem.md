# Q10: Corporate Audit Positive Momentum

> **Assessment Metadata**
> - **Target Role:** Both (DSE / Specialist Programmer)
> - **Reported Period:** 2024 SP Coding Test
> - **Verification Status:** Candidate-reported PYQ
> - **Difficulty Tier:** Easy–Medium
> - **Source Reference:** Infosys Specialist Programmer Quarterly Multiplier Audit

---

## Problem Statement
A forensic accounting auditor is inspecting $N$ sequential fiscal quarters of a multinational conglomerate. The performance of each quarter is evaluated as an integer multiplier $M_i$:
- $M_i > 0$ denotes growth acceleration.
- $M_i < 0$ denotes currency hedging loss / market contraction.
- $M_i = 0$ denotes a restructuring bankruptcy freeze.

The auditor wants to find the **maximum length of a contiguous sequence of fiscal quarters** such that the cumulative product of the quarterly multipliers is **strictly positive** ($\prod M_k > 0$).

If no contiguous sequence with a strictly positive product exists, output `0`.

---

## Input Format
- The first line contains an integer $N$, denoting the number of quarters.
- The second line contains $N$ space-separated integers, $M_1, M_2, \dots, M_N$.

## Output Format
- Print a single integer representing the maximum length of a contiguous subarray whose product is strictly positive.

---

## Constraints
- $1 \le N \le 2 \times 10^5$
- $-10^9 \le M_i \le 10^9$
- **Notice on Overflow:** Do not compute the actual product of numbers, as multiplying large integers will quickly overflow even 64-bit `long`. Only the signs ($+$, $-$, and $0$) matter.

---

## Sample 1
### Sample Input
```text
4
1 -2 -3 4
```

### Sample Output
```text
4
```

### Explanation
The entire array $[1, -2, -3, 4]$ has product $1 \times (-2) \times (-3) \times 4 = 24 > 0$. The length is 4.

---

## Sample 2
### Sample Input
```text
3
0 1 -2
```

### Sample Output
```text
1
```

### Explanation
The only positive subarray is $[1]$ of length 1.

---

## Sample 3
### Sample Input
```text
5
-1 -2 -3 0 1
```

### Sample Output
```text
2
```

### Explanation
Subarrays $[-1, -2]$ and $[-2, -3]$ both have positive products and length 2.

---

## Expected Time Complexity
$O(N)$ with $O(1)$ space by tracking positive and negative run lengths.

## Difficulty Level
Easyâ€“Medium

---

## Edge Cases to Consider
- Zeroes splitting arrays into independent zones
- Odd count of negative multipliers
- No positive product subarray (output 0)


