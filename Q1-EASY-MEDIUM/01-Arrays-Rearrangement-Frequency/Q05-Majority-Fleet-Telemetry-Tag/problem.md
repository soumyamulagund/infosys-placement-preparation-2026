# Q05: Majority Fleet Telemetry Tag

> **Assessment Metadata**
> - **Target Role:** DSE (Digital Specialist Engineer)
> - **Reported Period:** 2024 Assessment Drive
> - **Verification Status:** Verified PYQ
> - **Difficulty Tier:** Easy
> - **Source Reference:** Infosys DSE Autonomous Fleet Majority Identifier

---

## Problem Statement
A logistics operations center tracks an autonomous vehicle fleet through $N$ broadcast telemetry pings. Each ping conveys a vehicle fleet group ID $V_i$.

Due to routing rules, one dominant vehicle fleet group represents **more than $\lfloor N / 2 \rfloor$** of all broadcast pings received during an operational cycle. This is known as the **majority fleet group**.

Find the majority fleet group ID.

To run inside an edge micro-controller, your algorithm must run in **$O(N)$ time** and strictly **$O(1)$ auxiliary space**. Using a hash table or sorting is disallowed due to memory constraints.

---

## Input Format
- The first line contains an integer $N$, denoting the total number of telemetry pings.
- The second line contains $N$ space-separated integers, $V_1, V_2, \dots, V_N$.

## Output Format
- Print a single integer representing the majority fleet group ID.

---

## Constraints
- $1 \le N \le 2 \times 10^5$
- $-10^9 \le V_i \le 10^9$
- It is guaranteed that a majority element strictly appearing $> \lfloor N / 2 \rfloor$ times always exists.
- Auxiliary Space: strictly $O(1)$.

---

## Sample 1
### Sample Input
```text
7
2 2 1 1 1 2 2
```

### Sample Output
```text
2
```

### Explanation
$N = 7$. $\lfloor 7 / 2 \rfloor = 3$. The element 2 appears 4 times, which is $> 3$.

---

## Sample 2
### Sample Input
```text
3
3 2 3
```

### Sample Output
```text
3
```

---

## Additional Test Cases

### Test Case 3 (Single element)
**Input:**
```text
1
42
```
**Output:**
```text
42
```

### Test Case 4 (Negative numbers)
**Input:**
```text
5
-5 -5 10 -5 20
```
**Output:**
```text
-5
```

---

## Expected Time Complexity
$O(N)$ time with $O(1)$ auxiliary memory using Boyer-Moore Voting Algorithm.

## Difficulty Level
Easy

---

## Edge Cases to Consider
- $N = 1$ (single element is trivially the majority)
- Negative ID numbers
- Majority element alternating with other elements

