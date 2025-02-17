class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();  //converting string to character array
        String vowels = "aeiouAEIOU";
        int left = 0;
        int right = c.length-1;

        while (left < right){
            while (left < right && vowels.indexOf(c[left]) == -1){  //indexOf returns the first occurence of a character. -1 if false. so if its false, i.e c[left] is not un vowels
                left++;
            }
            while (left < right && vowels.indexOf(c[right]) == -1){
                right--;
            }
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;

            left++;  //dont forget this
            right--;
        }
        return new String(c);  //converts char array back to string 
    }
}
