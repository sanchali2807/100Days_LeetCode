# 🚀 Day 7 of 100 – LeetCode Challenge

Welcome to Day 7 of my #100DaysOfCode journey!  
Today, I focused on two foundational problems that deepened my understanding of arrays and helped reinforce efficient data manipulation techniques.

---

## 📌 Problems Solved

### 1. 🔄 Rotate Array

- **Problem Link**: [Rotate Array – LeetCode](https://leetcode.com/problems/rotate-array/)
- **Difficulty**: Medium
- **Topic Tags**: Array, Two Pointers, In-Place Algorithm

#### 🧠 Problem:
Given an array `nums`, rotate the array to the right by `k` steps.

#### 🛠️ Solution Approach:
- Reverse the whole array.
- Reverse the first `k` elements.
- Reverse the rest (`n - k` elements).


# 🔍 Contains Duplicate

## 📄 Problem Description

Given an integer array `nums`, return `true` if any value appears **at least twice**, and return `false` if every element is distinct.

> LeetCode Link: [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)  
> Difficulty: Easy  
> Topics: Array, Hash Table

## 🧠 Approach

We use a **HashSet** to track elements we've seen. If we encounter a number that already exists in the set, we return `true`.

### ✅ Time Complexity:
- **O(n)** — We traverse the array once.

### ✅ Space Complexity:
- **O(n)** — For storing elements in the `HashSet`.
