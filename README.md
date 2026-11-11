# Infosys DSE & Specialist Programmer 20-Day PYQ Preparation Workspace
### Target: Infosys Digital Specialist Engineer (DSE) & Specialist Programmer (SP)
**Language:** Java 17 | **Sprint Duration:** 20 Days | **Focus:** Real Assessment PYQs & Story-Based Competitive Programming

---

## 🎯 Target Assessment Strategy

The Infosys Specialist Programmer & DSE online coding assessments feature 3 competitive programming problems within a **3-hour testing window**:

| Problem Slot | Target Role | Expected Difficulty | Strategy & Goal | Impact |
|---|---|---|---|---|
| **Question 1** | **Digital Specialist Engineer (DSE)** | Easy–Medium | **100% Test Cases Passed** | **Guarantees DSE Interview Shortlist** |
| **Question 2** | **Specialist Programmer (SP)** | Medium | **$\ge$ 50% Test Cases Passed** (towards 100%) | **Elevates to Specialist Programmer Shortlist** |
| **Question 3** | High-Tier SP Booster | Medium–Hard / Hard | Low priority initially / Partial score if time permits | Maximum score booster |

> [!IMPORTANT]
> **No Beginner Modules:** This repository does NOT contain beginner programming tutorials (loops, syntax, basic patterns). It is strictly curated for **competitive programming problem-solving patterns** appearing in actual Infosys assessments.

---

## 📂 Repository Architecture

The workspace is organized into **exactly two primary sections** containing topic-wise modules in a Tap Academy-style format:

```
infosys-placement-preparation-2026/
├── README.md                                          # System overview & execution guidelines
├── ROADMAP.md                                         # 20-Day PYQ-mapped daily preparation plan
├── PROGRESS.md                                        # Master question checklist & test case tracker
├── DAILY-LOG.md                                       # Daily log template (hours, concepts, mistakes)
├── SCORECARD.md                                       # Real-time metrics: accuracy %, marks, success rate
├── WEAK-AREAS.md                                      # Mistake catalog, TLE/overflow prevention
│
├── Q1-EASY-MEDIUM/                                    # QUESTION 1 MASTERY (Target: 100% Test Cases)
│   ├── 01-Arrays-Rearrangement-Frequency/            # [Target: 12 Qs] In-place rotation, Dutch Flag
│   ├── 02-Subarrays-Prefix-Sum/                      # [Target: 15 Qs] 15 Complete High-Priority PYQs
│   ├── 03-Hashing-Counting/                          # [Target: 10 Qs] Frequency balancing, pair lookups
│   ├── 04-Strings-Pattern-Matching/                  # [Target: 10 Qs] Sliding window, anagram grouping
│   ├── 05-Sorting-Greedy-Intervals/                  # [Target: 10 Qs] Interval scheduling, cool-down
│   ├── 06-Two-Pointers-Sliding-Window/               # [Target: 12 Qs] Opposite-end sweeps, drone pairs
│   └── 07-Binary-Search/                             # [Target: 8 Qs] Rotated search, bounds, frequency
│
└── Q2-MEDIUM/                                         # QUESTION 2 MASTERY (Target: >= 50% Test Cases)
    ├── 01-Advanced-Prefix-Sum-Hashing/                # [Target: 8 Qs] Bounded subarray ranges [L, R]
    ├── 02-Advanced-Sliding-Window/                    # [Target: 8 Qs] At most K replacements, min windows
    ├── 03-Binary-Search-on-Answer/                    # [Target: 8 Qs] Capacity allocation, monotonic check
    ├── 04-Greedy-Interval-Optimization/               # [Target: 8 Qs] Non-overlapping intervals, priority queues
    ├── 05-Matrix-and-2D-Prefix-Sum/                   # [Target: 6 Qs] 2D power grid subgrid queries
    ├── 06-Dynamic-Programming/                        # [Target: 8 Qs] 1D state transitions, LIS O(N log N)
    ├── 07-Graphs-and-Connectivity/                    # [Target: 6 Qs] BFS/DFS connected server clusters
    └── 08-Bit-Manipulation-XOR/                       # [Target: 6 Qs] Prefix XOR zero-cancellation
```

---

## 🏷️ Tap Academy-Style Module Organization

Inside every module folder, there is an interactive `README.md` tracking dashboard and individual question subdirectories:

```
02-Subarrays-Prefix-Sum/
├── README.md                   # Module dashboard: Total, Solved, Attempted, Marks, Completion %
├── Q01-Subarray-Energy-Balance/
│   ├── problem.md              # Full competitive programming statement + PYQ metadata
│   ├── Main.java               # Java 17 compilable starter template with TODOs
│   └── NOTES.md                # Personal intuition, complexity analysis, and debugging log
├── Q02-Zero-Loss-Trading-Window/
└── ...
```

---

## 🔍 PYQ Verification & Metadata Standards

Every question documents its assessment provenance:
- **Role:** Specialist Programmer / DSE / Both.
- **Reported Period:** e.g., 2023, 2024, 2025 assessment drives.
- **Verification Status:**
  - `Verified PYQ`: Confirmed past assessment problem.
  - `Candidate-reported PYQ`: Reconstructed from candidate interview recollections.
  - `PYQ-style`: Carefully constructed original problem matching exact assessment patterns.
- **Source Reference:** Assessment platform context (HackerEarth / InfyTQ).

---

## 💻 How to Practice & Run in Java 17

1. Navigate to a question directory:
   ```powershell
   cd Q1-EASY-MEDIUM/02-Subarrays-Prefix-Sum/Q01-Subarray-Energy-Balance
   ```

2. Open `problem.md` and review the scenario, input/output formats, constraints, and edge cases.

3. Complete the `// TODO:` block in `Main.java`. Keep class name as `Main`.

4. Compile and run:
   ```powershell
   javac Main.java
   java Main
   ```

5. When done, report your results (compilation, test cases passed, time taken, hints used) to update [PROGRESS.md](file:///c:/Users/Administrator/infosys-placement-preparation-2026/PROGRESS.md) and [SCORECARD.md](file:///c:/Users/Administrator/infosys-placement-preparation-2026/SCORECARD.md).
