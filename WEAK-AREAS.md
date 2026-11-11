# Weak Areas & Mistake Diagnostic Tracker
### Infosys DSE & Specialist Programmer 20-Day PYQ Sprint

This document records recurring mistakes, missed edge cases, algorithmic pitfalls, and specific action plans to eliminate them during assessment conditions.

---

## 🛑 Common Pitfalls Checklist for Infosys Assessments

Keep this mental checklist before submitting any solution:

- [ ] **Integer Overflow:** Did I use `int` for sums, products, or accumulated frequencies that can exceed $2 \times 10^9$? *(Always use `long` when $N \le 2 \times 10^5$ and $A[i] \le 10^9$)*.
- [ ] **Negative Modulo in Java:** Did I handle negative remainders with `((sum % k) + k) % k`? *(In Java, `-7 % 5` is `-2`, which breaks hash lookups)*.
- [ ] **Negative Values in Subarray Sums:** Did I assume prefix sums are monotonic? *(If array contains negative values, binary search or two-pointer sliding window does NOT work; HashMap prefix sum is required)*.
- [ ] **I/O Bottleneck:** Is $N \ge 2 \times 10^5$? *(Standard `Scanner` can take 1.2+ seconds just parsing input in Java; switch to `BufferedReader` + `StringTokenizer`)*.
- [ ] **String Concatenation in Loops:** Did I use `s += ch`? *(Creates $O(N^2)$ garbage; always use `StringBuilder`)*.
- [ ] **Binary Search Bounds:** Did I avoid integer overflow in midpoint calculation? *(Use `int mid = low + (high - low) / 2`)*.
- [ ] **Edge Cases Tested:**
  - $N = 1$ (single element)
  - All elements equal or all zero
  - Negative numbers balancing positive values
  - Target value not present (output 0 or -1 as specified)
  - Capacity / target equals maximum possible or 0.

---

## 🔍 Logged Weak Areas & Bug Patterns

| Log ID | Date | Question ID | Category | Specific Mistake / Symptom | Root Cause | Preventive Action / Rule | Revision Done? |
|---|---|---|---|---|---|---|:---:|
| *Sample* | *2026-11-11* | *Q05* | *Modulo Arithmetic* | *Failed test cases with negative inputs* | *Java `%` returned negative remainder* | *Use `((sum % k) + k) % k`* | *Yes* |
| **W01** | | | | | | | [ ] |
| **W02** | | | | | | | [ ] |
| **W03** | | | | | | | [ ] |
| **W04** | | | | | | | [ ] |
| **W05** | | | | | | | [ ] |

---

## 🛠️ Topic-Wise Remediation Plan

### 1. Subarrays & Prefix Sums
- **Common Failure:** Assuming non-negative inputs or missing prefix sum 0 base initialization.
- **Rule:** If $A[i] < 0$, cannot use two pointers for target sum. Store earliest prefix sum index in `HashMap<Long, Integer>`. Always initialize `map.put(0L, -1)` for index lookups or `map.put(0L, 1L)` for count lookups.

### 2. Difference Arrays & Range Updates
- **Common Failure:** Forgetting that updates are 1-based or forgetting `diff[R+1] -= V`.
- **Rule:** Allocate array of size `N + 2` to avoid `ArrayIndexOutOfBoundsException` at $R+1$.

### 3. Binary Search on Answer Space
- **Common Failure:** Incorrect search boundaries `low` and `high`, or integer division truncation.
- **Rule:** Use `(val + mid - 1) / mid` for integer ceiling division $\lceil val / mid \rceil$. Check feasibility using `long` accumulator.

### 4. Greedy & Sorting
- **Common Failure:** Sorting only by start time without handling simultaneous completions.
- **Rule:** Verify if $S_j > E_i$ (strict cool-down) vs $S_j \ge E_i$ (instant reuse).
