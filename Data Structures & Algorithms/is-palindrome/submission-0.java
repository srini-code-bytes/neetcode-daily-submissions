class Solution {
    public boolean isPalindrome(String s) {
        char[] sCharArr = s.toCharArray();
        int i = 0, j = sCharArr.length - 1;
        while (i < j) {
            // Skip the char if it is not a letter or digit
            if (!Character.isLetterOrDigit(sCharArr[i])) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(sCharArr[j])) {
                j--;
                continue;
            }
            // Convert to lower case and then compare
            if (Character.toLowerCase(sCharArr[i]) == Character.toLowerCase(sCharArr[j])) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
