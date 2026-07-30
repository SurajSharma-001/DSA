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

// -------------Another Method-----------------
/*
class Solution {
    public String reverseWords(String s) {
        // 1. Trim leading/trailing spaces and split by one or more whitespace characters
        String[] arr = s.trim().split("\\s+"); 
        
        StringBuilder sb = new StringBuilder();
        
        // 2. Append words in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i > 0) {
                sb.append(" "); // Add space between words (prevents extra trailing space)
            }
        }
        
        return sb.toString();
    }
}
*/