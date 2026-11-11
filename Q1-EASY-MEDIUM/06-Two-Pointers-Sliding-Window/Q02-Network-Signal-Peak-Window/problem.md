# Q003: Network Signal Peak Window

## Problem Statement
A telecommunication monitoring base station receives a continuous telemetry stream of signal packet types represented as a string $S$ of lowercase English characters (`a`–`z`).

To ensure accurate signal analysis, the station's spectrum analyzer can only monitor a contiguous packet window if the window contains **at most $K$ distinct signal types**.

Your task is to find the **maximum length** of a contiguous sub-segment of packets in $S$ that contains at most $K$ distinct signal types.

---

## Input Format
- The first line contains an integer $K$, denoting the maximum allowed number of distinct signal types.
- The second line contains the string $S$, denoting the incoming signal stream.

## Output Format
- Print a single integer representing the maximum length of a contiguous substring containing at most $K$ distinct characters. If no such valid substring can be formed, print `0`.

---

## Constraints
- $1 \le |S| \le 2 \times 10^5$
- $1 \le K \le 26$
- $S$ contains only lowercase English letters (`a` through `z`).

---

## Sample 1
### Sample Input
```text
2
eceba
```

### Sample Output
```text
3
```

### Explanation
The substring `"ece"` contains 2 distinct characters (`'e'` and `'c'`) and has length 3. Any longer substring, such as `"eceb"`, contains 3 distinct characters (`'e'`, `'c'`, `'b'`), which exceeds $K = 2$.
Therefore, the maximum length is 3.

---

## Sample 2
### Sample Input
```text
1
aaabbb
```

### Sample Output
```text
3
```

### Explanation
Substrings with at most 1 distinct character include `"aaa"` (length 3) and `"bbb"` (length 3). The maximum length is 3.

---

## Sample 3
### Sample Input
```text
3
abcadcacacaca
```

### Sample Output
```text
11
```

### Explanation
The substring `"cadcacacaca"` contains 3 distinct characters (`'c'`, `'a'`, and `'d'`) and has length 11.

---

## Additional Test Cases

### Test Case 4 (All unique characters, K small)
**Input:**
```text
2
abcdef
```
**Output:**
```text
2
```
*(Explanation: Any 2 adjacent characters form a valid window of length 2)*

### Test Case 5 (K larger than total distinct characters in string)
**Input:**
```text
5
ababbab
```
**Output:**
```text
7
```
*(Explanation: The string has only 2 distinct characters, which is $\le 5$. The entire string of length 7 is valid)*

### Test Case 6 (Single character string)
**Input:**
```text
1
z
```
**Output:**
```text
1
```

---

## Expected Time Complexity
$O(|S|)$ using a Dynamic Sliding Window (Two Pointers) and an array of frequency counts of size 26.
An $O(|S|^2)$ approach will encounter **Time Limit Exceeded (TLE)** on the $2 \times 10^5$ constraint.

## Difficulty Level
Easy–Medium

## Topic and Pattern
Sliding Window (Variable Size) / Hash Array & Frequency Map

