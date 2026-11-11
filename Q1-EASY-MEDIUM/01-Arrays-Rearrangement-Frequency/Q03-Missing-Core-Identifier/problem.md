# Q03: Missing Core Identifier

> **Assessment Metadata**
> - **Target Role:** DSE (Digital Specialist Engineer)
> - **Reported Period:** 2023 DSE Online Test
> - **Verification Status:** Verified PYQ
> - **Difficulty Tier:** Easy
> - **Source Reference:** Infosys DSE Embedded Hardware Diagnostic

---

## Problem Statement
An embedded multiprocessor SoC (System-on-Chip) contains $N + 1$ specialized compute cores, numbered consecutively from $1$ to $N + 1$.

During power-on self-test (POST), each active core registers its unique integer ID with the master diagnostic bus. Due to an interconnect fault, exactly **one core fails to respond**. The diagnostic bus records an array $C$ containing the IDs of the $N$ responsive cores.

All IDs in $C$ are distinct and lie within the range $[1, N + 1]$.

Your task is to identify the **ID of the missing non-responsive core**. Because this runs in kernel ROM, you must achieve this in **$O(N)$ time** using **$O(1)$ auxiliary memory** without causing 32-bit arithmetic overflow.

---

## Input Format
- The first line contains an integer $N$, denoting the number of responding cores.
- The second line contains $N$ space-separated integers, representing the responsive core IDs.

## Output Format
- Print a single integer representing the ID of the missing core.

---

## Constraints
- $1 \le N \le 2 \times 10^5$
- Array length is $N$.
- Elements are distinct and within the range $[1, N + 1]$.
- Auxiliary Memory: strictly $O(1)$.

---

## Sample 1
### Sample Input
```text
4
1 2 4 5
```

### Sample Output
```text
3
```

### Explanation
The complete core set is $\{1, 2, 3, 4, 5\}$. The ID 3 is missing from the received array.

---

## Sample 2
### Sample Input
```text
1
2
```

### Sample Output
```text
1
```

### Explanation
For $N = 1$, expected cores are $\{1, 2\}$. Only core 2 responded, so core 1 is missing.

---

## Additional Test Cases

### Test Case 3 (Missing the last element)
**Input:**
```text
3
1 2 3
```
**Output:**
```text
4
```

### Test Case 4 (Unsorted input)
**Input:**
```text
5
6 4 1 2 5
```
**Output:**
```text
3
```

---

## Expected Time Complexity
$O(N)$ time with $O(1)$ auxiliary space (e.g. using bitwise XOR cancellation).

## Difficulty Level
Easy

---

## Edge Cases to Consider
- Missing element is $1$ (first element)
- Missing element is $N + 1$ (last element)
- Input is completely unsorted
- Sum of integers up to $N+1$ exceeds $2^{31}-1$ (XOR avoids integer overflow entirely)

