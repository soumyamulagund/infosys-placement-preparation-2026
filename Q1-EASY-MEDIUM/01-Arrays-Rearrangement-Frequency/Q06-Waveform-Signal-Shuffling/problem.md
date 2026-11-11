# Q06: Waveform Signal Shuffling

> **Assessment Metadata**
> - **Target Role:** DSE (Digital Specialist Engineer)
> - **Reported Period:** 2024 Candidate-reported Drive
> - **Verification Status:** Candidate-reported PYQ
> - **Difficulty Tier:** Easy
> - **Source Reference:** Infosys DSE Audio DSP Amplitude Waveform

---

## Problem Statement
An audio DSP (Digital Signal Processing) chip receives a stream of $N$ discrete frequency amplitude levels $A_1, A_2, \dots, A_N$.

To generate a balanced acoustic waveform, the chip must reorder the amplitudes into a **wave pattern** such that:
$$A_0 \ge A_1 \le A_2 \ge A_3 \le A_4 \dots$$
That is, every even-indexed element is greater than or equal to its immediate adjacent odd-indexed neighbors.

Sorting the array and swapping pairs achieves this in $O(N \log N)$ time, but the real-time DSP audio frame requires an **$O(N)$ linear time solution** with **$O(1)$ extra memory**.

---

## Input Format
- The first line contains an integer $N$, denoting the number of amplitude samples.
- The second line contains $N$ space-separated integers, $A_1, A_2, \dots, A_N$.

## Output Format
- Print $N$ space-separated integers representing any valid wave-ordered configuration.

---

## Constraints
- $1 \le N \le 2 \times 10^5$
- $-10^9 \le A_i \le 10^9$
- Time complexity must be strictly $O(N)$ (do not sort).
- Auxiliary memory must be $O(1)$.

---

## Sample 1
### Sample Input
```text
5
1 2 3 4 5
```

### Sample Output
```text
2 1 4 3 5
```

### Explanation
Checking the condition:
- $A_0 = 2 \ge A_1 = 1$ (Satisfied)
- $A_1 = 1 \le A_2 = 4$ (Satisfied)
- $A_2 = 4 \ge A_3 = 3$ (Satisfied)
- $A_3 = 3 \le A_4 = 5$ (Satisfied)
The array is in valid wave form.

---

## Sample 2
### Sample Input
```text
4
10 90 49 2
```

### Sample Output
```text
90 10 49 2
```

---

## Expected Time Complexity
$O(N)$ single pass, $O(1)$ auxiliary space.

## Difficulty Level
Easy

---

## Edge Cases to Consider
- $N = 1$ (already in wave form)
- All elements identical
- Array already in reverse order

