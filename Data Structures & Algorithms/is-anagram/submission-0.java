class Solution {
    public boolean isAnagram(String s, String t) {
        /* Brute force approach: 
        Convert both the string to character arrays and then check the equality 
        both these arrays via equals() */ 
        
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        return Arrays.equals(sCharArray, tCharArray);
    }
}
