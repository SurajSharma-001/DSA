class Solution {
    public String reverseWords(String s) {
        
        // \\ --> for skip 
        //  s --> for space
        //  + --> for multiple
        String[] arr = s.split("\\s+"); 

        StringBuilder sb = new StringBuilder("");

        for(int i=arr.length-1; i>=0; i--){
            sb.append(arr[i] + " ");
        }

        String ans = sb.toString();

        // trim() --> it removes the leading and trailing spaces

        ans = ans.trim();

        return ans;
    }
}