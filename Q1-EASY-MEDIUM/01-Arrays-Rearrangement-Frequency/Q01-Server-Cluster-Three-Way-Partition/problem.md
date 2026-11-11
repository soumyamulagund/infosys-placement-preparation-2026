# Q01: Server Cluster Three-Way Partitioning

> **Assessment Metadata**
> - **Target Role:** DSE (Digital Specialist Engineer)
> - **Reported Period:** 2023 On-Campus Assessment
> - **Verification Status:** Verified PYQ
> - **Difficulty Tier:** Easy
> - **Source Reference:** Infosys DSE Server Health Partitioning Assessment

---

## Problem Statement
A cloud reliability orchestrator monitors a cluster of $N$ compute nodes. Each server reports an integer health state:
- `0`: Critical hardware failure (needs immediate triage).
- `1`: Warning state (elevated memory/CPU pressure).
- `2`: Healthy state (optimal throughput).

The orchestrator must rearrange the server health records in-place so that all Critical nodes (`0`) appear first, followed by all Warning nodes (`1`), and finally all Healthy nodes (`2`).

To satisfy real-time kernel latency limits, the rearrangement must be performed in **a single pass** ($O(N)$ time) using **$O(1)$ auxiliary space**. You are not allowed to use language library sorting methods (`Arrays.sort`).

---

## Input Format
- The first line contains an integer $N$, denoting the number of servers.
- The second line contains $N$ space-separated integers, each being `0`, `1`, or `2`.

## Output Format
- Print $N$ space-separated integers representing the rearranged server states.

---

## Constraints
- $1 \le N \le 2 \times 10^5$
- Each element is strictly $0$, $1$, or $2$.
- Must run in $O(N)$ time with $O(1)$ extra memory.

---

## Sample 1
### Sample Input
```text
6
2 0 2 1 1 0
```

### Sample Output
```text
0 0 1 1 2 2
```

### Explanation
All critical servers (`0`) are grouped at indices 0..1, warning servers (`1`) at indices 2..3, and healthy servers (`2`) at indices 4..5.

---

## Sample 2
### Sample Input
```text
3
2 0 1
```

### Sample Output
```text
0 1 2
```

---

## Additional Test Cases

### Test Case 3 (All identical)
**Input:**
```text
4
1 1 1 1
```
**Output:**
```text
1 1 1 1
```

### Test Case 4 (Already sorted)
**Input:**
```text
5
0 0 1 2 2
```
**Output:**
```text
0 0 1 2 2
```

---

## Expected Time Complexity
$O(N)$ single pass, $O(1)$ auxiliary space.

## Difficulty Level
Easy

---

## Edge Cases to Consider
- All elements identical (e.g. only 0s or only 2s)
- Array already sorted
- Array in reverse sorted order (`2, 2, 1, 0, 0`)
- Single element array ($N = 1$)

