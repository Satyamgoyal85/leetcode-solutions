class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=1;
        int j=numbers.length;
        int [] arr= new int [2];
        while(i<j){
            if ((numbers[i-1]+numbers[j-1])==target){
                arr[0]=i;
                arr[1]=j;
                return arr;
            }else if((numbers[i-1]+numbers[j-1])>target) {
                 j--;
            }else{
                i++;
            }
        }
        return arr;
        }
}