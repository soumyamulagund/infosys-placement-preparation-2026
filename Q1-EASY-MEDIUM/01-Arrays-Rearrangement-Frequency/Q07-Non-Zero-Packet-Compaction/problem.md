# Q07: Non-Zero Packet Compaction

> **Assessment Metadata**
> - **Target Role:** DSE (Digital Specialist Engineer)
> - **Reported Period:** 2023 On-Campus Assessment
> - **Verification Status:** Verified PYQ
> - **Difficulty Tier:** Easy
> - **Source Reference:** Infosys DSE Packet Buffer Zero Compaction

---

## Problem Statement
A networking hardware compression ASIC receives a memory buffer of $N$ integers representing packet header words $P_1, P_2, \dots, P_N$.

Due to transmission fragmentation, some entries have value `0` (denoting idle padding / null packets), while non-zero values denote active packet payloads.

To optimize downstream processing, the ASIC must compact the buffer **in-place**:
1. Move all `0`s to the end of the array.
2. Maintain the **exact relative ordering** of all non-zero payload values.
3. Use **$O(1)$ auxiliary memory** (do not allocate a second array).
4. Run in **$O(N)$ linear time**.

---

## Input Format
- The first line contains an integer $N$, denoting the size of the buffer.
- The second line contains $N$ space-separated integers, $P_1, P_2, \dots, P_N$.

## Output Format
- Print $N$ space-separated integers representing the compacted array.

---

## Constraints
- $1 \le N \le 2 \times 10^5$
- $-10^9 \le P_i \le 10^9$
- In-place modification with $O(1)$ extra space is required.

---

## Sample 1
### Sample Input
```text
5
0 1 0 3 12
```

### Sample Output
```text
1 3 12 0 0
```

### Explanation
Non-zero elements are 1, 3, and 12 in order. The two zeros are shifted to the end.

---

## Sample 2
### Sample Input
```text
1
0
```

### Sample Output
```text
0
```

---

## Additional Test Cases

### Test Case 3 (No zeros)
**Input:**
```text
3
4 5 6
```
**Output:**
```text
4 5 6
```

### Test Case 4 (All zeros)
**Input:**
```text
4
0 0 0 0
```
**Output:**
```text
0 0 0 0
```

---

## Expected Time Complexity
$O(N)$ time with $O(1)$ space using two-pointer index compaction.

## Difficulty Level
Easy

---

## Edge Cases to Consider
- All elements are 0
- No zeros present in the array
- Negative non-zero values (must not be treated as zero)
- Array of size 1

