class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set= new HashSet<>();
        for (int val:nums1){
            set.add(val);
        }
        HashSet <Integer> resultSet= new HashSet<>();
        for (int val:nums2){
            if(set.contains(val)) resultSet.add(val);
        }
        int [] arr= new int[resultSet.size()];
        int i=0;
        for(int val:resultSet){
            arr[i]=val;
            i++;
        }
        return arr;
    }
}