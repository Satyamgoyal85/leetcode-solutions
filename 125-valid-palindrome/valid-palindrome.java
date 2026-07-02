class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.toLowerCase().trim();
        int i=0;
        int j=s1.length()-1;
        while(i<j){
            char leftChar= s1.charAt(i);
            char rightChar= s1.charAt(j);
            if(!Character.isLetterOrDigit(leftChar)) i++;
            else if(!Character.isLetterOrDigit(rightChar)) j--;
            else{
                if(leftChar!=rightChar){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}