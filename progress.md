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

# Day 2: 28 dec
## 1. [Rotate Array](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/rotate-array-by-n-elements-1587115621)✅
### approach: <br/>
- reverse 0 to d-1, reverse d to n-1, reverse the whole final array (0 to n-1) where n is the length
### challenge: <br/>
- i approached it in a diff way but ended up being arrayOutOfBounds as usual. what i did was, i put the values of index 0 to n-d in a[len-d] till d and then put the rest of values from the start of the final array but thats not right
- the second last o/p i submitted didnt have d=d%n and that was a minor but big mistake
### takeaways <br/>
- observe the output carefully and see if we can reverse shit and use while loop

## 2. [Next Permutation](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/next-permutation5226)❌
### logic: <br/>
- traverse thru the array from the right
- find a number which is less than the next number arr[k]<arr[k+1]
- swap that digit with the next largest number on the right side
- now reverse the rest of the digits in the right side
- if no such element is present where arr[k]<arr[k+1], just reverse the whole thing
### challenge: <br/>
- took me half an hour to figure out what next permutation meant
- i couldnt complete the code i was writin cause it felt real complex, like i was getting nowhere so i stopped
- ill get back to this later

# Day 3: 29 dec
## 1. [Majority element](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/majority-vote)✅
### approach: <br/>
- i used hashing here. theres also one more algorithm we can use i'll work on it tomorrow.
### challenge: <br/>
- i dont quite understand hashing and its fnsshould work more on it.











## Week 1 summary
- total qstns solved: 5
- topics covered: arrays
