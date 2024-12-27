# Day 1: 27 dec
## 1. [Second Largest](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735)
### approach: <br/>
  - If the array has less than 2 elements, return -1. <br/>
  - Initialise largest and second_largest to 0. <br/>
  - Iterate thru the array, if current element is greater than largest.. update second_largest to largest and largest to the current element. else if the current element is greater than second_largest and not equal to largest, update second_largest to current. <br/>
  - After the loop, if second_largest value has not changed, (eg if elements are 12 12 12) return -1. else return second_largest
### challenge: <br/>
  - at first when i submitted the ansr i forgot to check if the value in second_largest had updated, and returned second_largest. so when the input is [12 12 12] it returns 0 and not -1. then i changed it.
  - i had initially put largest= arr[0] and second_largest= arr[1] but it will give wrong ansrs if there are only 2 elements
### status:✅
## 2. [Move Zeros to End](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751)
### approach: <br/>
- print all the non zero elements first and then fill the remaining length with zeros
### challenge: <br/>
- this was fairly easier than the last one but i first tried swapping the numbers which didnt work out well
### status:✅
## Week 1 summary
- total qstns solved: 2
- topics covered: arrays
