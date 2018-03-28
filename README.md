This repository contains  the coding challenges and problems which I have solved. Each file contains the problem statement, sample inputs and expected outputs.

## Problem 1
Given an array of numbers in ascending order, return a string which contains clubs consecutive numbers (atleast 3) into a range.. For non-consecutive numbers, the numbers should be directly appended.

#### Input:
2,3,4,5,6,7,8,9,11,13

#### Output:
2-4,5,6,7-9,11,13

## Problem 2

Given a string, return the first valid US phone number in the string. If none is present, return "NONE".Valid patterns of US phone numbers are "123-456-7890" and "(123) 456-7890".

#### Input 1:
xx000-000-1111xxx

#### Output 1:
000-000-1111

#### Input 2:
123-456-7890(000) 000-0000

#### Output 2:
123-456-7890

#### Input 3:
1234567890

#### Output 3:
NONE

## Problem 3

Given a string and a chunk size, perform deduplication on it. The process of deduplication returns an intermediate string. The intermediate string is then used to perform reduplication. The process of reduplication gives back the original string. Follow the below steps:

- Break the string into chunks of the given size (Values of chunk size can be 1KB,10KB and so on).
- Find the unique chunks and make a note of where these chunks occur in the string.
- The intermediate string should contain the unique strings and their positions.
- This string alone should be used to perform reduplication, which constructs the original string.

#### Input:
abcdexyzvwabcde
chunk size: 5 bytes

#### Output after deduplication:
abcde-0-2,xyzvw1

#### Output after reduplication:
abcdexyzvwabcde

## Inspiration
[HackerRank](https://www.hackerrank.com/)
