class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=m;
        while(k<m+n){
            if(nums1[i]<nums2[j]){
                nums1[k]=nums2[j];
            }else{
                nums1[k]=nums1[i];
                nums1[i]=nums2[j];
            }
            i++;
            j++;
            k++;
        }
        Arrays.sort(nums1);
    }
}