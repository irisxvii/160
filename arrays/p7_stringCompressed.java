class Solution {
    public int compress(char[] chars) {
        int i=0;
        int write=0;
        while(i < chars.length)
        {
            int count=0;
            char current=chars[i]; //holds the current character being checked
            while(i < chars.length && chars[i] == current){
                count++;
                i++;
            }
            chars[write] = current;
            write++;
            if(count>1)
            {
                String convert = Integer.toString(count);
                for(int j=0;j<convert.length();j++){  //cause if theres 12 b's it should be written as '1''2'
                chars[write] = convert.charAt(j);
                write++;
                }
            }
        }
        return write;
    }
}
