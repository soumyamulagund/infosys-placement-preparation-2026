# Q06: Thermal Equilibrium Pivot

## Problem Statement
A high-performance AI compute chassis contains a linear array of $N$ thermal sensors indexed from $0$ to $N - 1$. Each sensor logs a thermal differential score $T_i$ indicating heat flux relative to ambient baseline (can be positive, negative, or zero).

To optimize bidirectional ventilation fans, the automated climate controller must identify an **equilibrium pivot index** $P$ such that the sum of thermal scores strictly to the left of index $P$ is exactly equal to the sum of scores strictly to the right of index $P$:
$$\sum_{i=0}^{P-1} T_i = \sum_{i=P+1}^{N-1} T_i$$

- If $P = 0$, the left sum is defined as $0$.
- If $P = N - 1$, the right sum is defined as $0$.
- If multiple equilibrium indices exist, return the **smallest (leftmost)** valid index.
- If no such equilibrium index exists, return `-1`.

---

## Input Format
- The first line contains an integer $N$, denoting the number of sensors.
- The second line contains $N$ space-separated integers, $T_0, T_1, \dots, T_{N-1}$.

## Output Format
- Print a single integer representing the leftmost equilibrium index, or `-1` if none exists.

---

## Constraints
- $1 \le N \le 2 \times 10^5$
- $-10^9 \le T_i \le 10^9$
- Total sum can exceed $2^{31}-1$; use 64-bit integers (`long` in Java).

---

## Sample 1
### Sample Input
```text
7
-7 1 5 2 -4 3 0
```

### Sample Output
```text
3
```

### Explanation
At index $P = 3$ (value $2$):
- Left sum = $(-7) + 1 + 5 = -1$
- Right sum = $(-4) + 3 + 0 = -1$
Since $\text{Left Sum} = \text{Right Sum} = -1$, index 3 is a valid equilibrium point.

---

## Sample 2
### Sample Input
```text
3
1 2 3
```

### Sample Output
```text
-1
```

### Explanation
- At $P = 0$: Left = 0, Right = 5 (No)
- At $P = 1$: Left = 1, Right = 3 (No)
- At $P = 2$: Left = 3, Right = 0 (No)
No equilibrium index exists.

---

## Sample 3
### Sample Input
```text
3
2 1 -1
```

### Sample Output
```text
0
```

### Explanation
At $P = 0$:
- Left sum = $0$
- Right sum = $1 + (-1) = 0$
Left sum equals right sum, so index 0 is valid.

---

## Expected Time Complexity
$O(N)$ with $O(1)$ auxiliary space by computing total sum first and maintaining a running left sum.

## Difficulty Level
Easy

## Topic and Pattern
Prefix Sum / Equilibrium Index (Pivot Finding)

