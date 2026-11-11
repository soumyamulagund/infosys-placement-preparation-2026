# Q08: Next Permutation Task Priority

> **Assessment Metadata**
> - **Target Role:** Both (DSE / Specialist Programmer)
> - **Reported Period:** 2024 Candidate-reported Drive
> - **Verification Status:** Candidate-reported PYQ
> - **Difficulty Tier:** Easy–Medium
> - **Source Reference:** Infosys SP/DSE Task Scheduling Lexicographical Order

---

## Problem Statement
A real-time operating system scheduler maintains an active task execution queue represented as an array of $N$ integer priority tokens $P_1, P_2, \dots, P_N$.

To balance load across consecutive processor ticks, the scheduler needs to transition the current priority sequence to the **lexicographically next greater permutation** of numbers.

- If the next greater permutation exists, rearrange the array into that permutation in-place.
- If no greater permutation is possible (the array is sorted in descending order), rearrange it into the **lowest possible order** (sorted in ascending order).

The transition must be completed **in-place** using **$O(1)$ auxiliary space** and **$O(N)$ time**.

---

## Input Format
- The first line contains an integer $N$, denoting the length of the priority sequence.
- The second line contains $N$ space-separated integers, $P_1, P_2, \dots, P_N$.

## Output Format
- Print $N$ space-separated integers representing the next permutation.

---

## Constraints
- $1 \le N \le 10^5$
- $0 \le P_i \le 100$
- In-place modification with $O(1)$ extra space.

---

## Sample 1
### Sample Input
```text
3
1 2 3
```

### Sample Output
```text
1 3 2
```

### Explanation
The lexicographically next permutation after $[1, 2, 3]$ is $[1, 3, 2]$.

---

## Sample 2
### Sample Input
```text
3
3 2 1
```

### Sample Output
```text
1 2 3
```

### Explanation
$[3, 2, 1]$ is the highest possible permutation, so it wraps around to the lowest order $[1, 2, 3]$.

---

## Sample 3
### Sample Input
```text
3
1 1 5
```

### Sample Output
```text
1 5 1
```

---

## Expected Time Complexity
$O(N)$ time with $O(1)$ auxiliary memory.

## Difficulty Level
Easy–Medium

---

## Edge Cases to Consider
- Array strictly descending (must invert to ascending)
- Duplicate elements (e.g. $[1, 1, 5] \to [1, 5, 1]$)
- Array of size 1

