# Q04: Duplicate Signal Trap

> **Assessment Metadata**
> - **Target Role:** Both (DSE / Specialist Programmer)
> - **Reported Period:** 2024 Candidate-reported Qualifier
> - **Verification Status:** Candidate-reported PYQ
> - **Difficulty Tier:** Easy–Medium
> - **Source Reference:** Infosys DSE/SP Signal Collision Problem

---

## Problem Statement
A telecommunications RF spectrum scanner logs an array $S$ of $N + 1$ signal channel tags. According to communication protocol specs, each tag is an integer strictly in the range from $1$ to $N$ inclusive ($1 \le S_i \le N$).

By the Pigeonhole Principle, there is guaranteed to be **at least one duplicate signal tag** (it may appear two or more times).

You must identify the duplicate signal tag under strict hardware conditions:
1. You **must not modify the array** (it resides in read-only EEPROM).
2. You must use only **$O(1)$ auxiliary memory** (no HashSets or frequency arrays).
3. The runtime must be strictly **$O(N)$**.

---

## Input Format
- The first line contains an integer $N$ (the array has length $N + 1$).
- The second line contains $N + 1$ space-separated integers, $S_0, S_1, \dots, S_N$.

## Output Format
- Print a single integer representing the duplicate signal tag.

---

## Constraints
- $1 \le N \le 2 \times 10^5$
- Array contains $N + 1$ elements.
- Each element $S_i$ satisfies $1 \le S_i \le N$.
- Exactly one number is duplicated, but it may repeat more than once.
- Auxiliary Space: strictly $O(1)$.
- Read-only array: do not mutate the input values.

---

## Sample 1
### Sample Input
```text
4
1 3 4 2 2
```

### Sample Output
```text
2
```

### Explanation
$N = 4$. Array length is $N + 1 = 5$. The tag 2 is duplicated.

---

## Sample 2
### Sample Input
```text
4
3 1 3 4 2
```

### Sample Output
```text
3
```

---

## Additional Test Cases

### Test Case 3 (Duplicated more than twice)
**Input:**
```text
3
1 1 1 1
```
**Output:**
```text
1
```

### Test Case 4 (Two elements)
**Input:**
```text
1
1 1
```
**Output:**
```text
1
```

---

## Expected Time Complexity
$O(N)$ time with $O(1)$ auxiliary space using Floyd's Tortoise and Hare Cycle Detection.

## Difficulty Level
Easy–Medium

---

## Edge Cases to Consider
- The duplicate element appears more than 2 times
- $N = 1$ (array has length 2: `[1, 1]`)
- Array must remain unmutated (cannot mark visited with negative sign if array is read-only)

