class Solution {
    public int getSecondLargest(int[] arr) {
        
        if(arr.length<2)
        return -1;
        
        int largest= 0;
        int second_largest= 0;
        
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]>largest)
            {
                second_largest=largest;
                largest= arr[i];
            }
            else if(arr[i]>second_largest && arr[i]!=largest)
            {
                second_largest=arr[i];
            }
        }
        return second_largest == 0 ? -1 : second_largest;
    }
}
