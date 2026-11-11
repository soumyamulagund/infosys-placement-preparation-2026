# Q09: Trapped Cooling Water Reservoir

> **Assessment Metadata**
> - **Target Role:** Both (DSE / Specialist Programmer)
> - **Reported Period:** 2024 Assessment Drive
> - **Verification Status:** Verified PYQ
> - **Difficulty Tier:** Easy–Medium
> - **Source Reference:** Infosys SP/DSE Hydraulic Server Reservoir Problem

---

## Problem Statement
A specialized cryogenic cooling facility is partitioned by $N$ contiguous thermal baffle plates of width $1$ each. The elevation profile of the baffle plates is recorded in an array $H$, where $H_i \ge 0$ represents the height of the $i$-th baffle plate.

During coolant flushing, fluid accumulates in the depressions between plates. A unit of coolant is trapped at position $i$ if there exist taller baffle plates to its left and to its right.

Calculate the **total volume of coolant fluid** trapped between the baffle plates.

To meet embedded micro-benchmark criteria, compute this in **$O(N)$ time** using strictly **$O(1)$ auxiliary memory** (without allocating left-max and right-max prefix arrays).

---

## Input Format
- The first line contains an integer $N$, denoting the number of baffle plates.
- The second line contains $N$ space-separated integers, $H_0, H_1, \dots, H_{N-1}$.

## Output Format
- Print a single 64-bit integer (`long`) representing the total trapped fluid volume.

---

## Constraints
- $1 \le N \le 2 \times 10^5$
- $0 \le H_i \le 10^5$
- Total volume can exceed $2^{31}-1$; use `long` in Java.
- Auxiliary Space: strictly $O(1)$ (Two-pointer approach).

---

## Sample 1
### Sample Input
```text
12
0 1 0 2 1 0 1 3 2 1 2 1
```

### Sample Output
```text
6
```

### Explanation
Coolant fluid is trapped in the crevices:
- 1 unit at index 2
- 1 unit at index 4
- 2 units at index 5
- 1 unit at index 6
- 1 unit at index 9
Total trapped volume = $1 + 1 + 2 + 1 + 1 = 6$ units.

---

## Sample 2
### Sample Input
```text
6
4 2 0 3 2 5
```

### Sample Output
```text
9
```

---

## Additional Test Cases

### Test Case 3 (Monotonically increasing or decreasing - no water trapped)
**Input:**
```text
4
1 2 3 4
```
**Output:**
```text
0
```

### Test Case 4 (Two plates)
**Input:**
```text
2
5 2
```
**Output:**
```text
0
```

---

## Expected Time Complexity
$O(N)$ time with $O(1)$ auxiliary space using two pointers from opposite ends.

## Difficulty Level
Easy–Medium

---

## Edge Cases to Consider
- $N < 3$ (no water can be trapped)
- Array sorted ascending or descending (0 trapped)
- Flat terrain (all heights identical $\to 0$ trapped)
- Large accumulation exceeding 32-bit integer range

