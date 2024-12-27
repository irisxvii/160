# Day 1: 27 dec
## 1. [Second Largest](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735)✅
### approach: <br/>
  - If the array has less than 2 elements, return -1. <br/>
  - largest = second_largest = 0. <br/>
  - Iterate thru the array, if current element is greater than largest.. update second_largest to largest and largest to the current element. else if the current element is greater than second_largest and not equal to largest, update second_largest to current. <br/>
  - After the loop, if second_largest value has not changed, (eg if elements are 12 12 12) return -1. else return second_largest
### challenge: <br/>
  - at first when i submitted the ansr i forgot to check if the value in second_largest had updated, and returned second_largest. so when the input is [12 12 12] it returns 0 and not -1. then i changed it.
  - i had initially put largest= arr[0] and second_largest= arr[1] but it will give wrong ansrs if there are only 2 elements

## 2. [Move Zeros to End](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751)✅
### approach: <br/>
- print all the non zero elements first and then fill the remaining length with zeros
### challenge: <br/>
- this was fairly easier than the last one but i first tried swapping the numbers which didnt work out well

## 3. [Reverse Array](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/reverse-an-array)✅
### approach: <br/>
- left=0; right=n-1
- swap the right and left values
### challenge: <br/>
- even tho ive been reversing arrays all my life.. i forgot to use temp to switch and swapped using sm other stupid way initially and got arrayOutOfBoundsException

## Week 1 summary
- total qstns solved: 3
- topics covered: arrays
