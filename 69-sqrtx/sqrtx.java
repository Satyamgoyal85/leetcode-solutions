class Solution {
    public int mySqrt(int x) {
    //    int y=(int)Math.sqrt(x);
    //    return y;
    if(x==0 || x==1) return x;
    int k=0;
    int low=1;
    int high=x;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(mid==x/mid) return mid;
        else if(mid<x/mid){
            low=mid+1;
            k=mid;
        }
        else high=mid-1;
    }
    return k;
    }
}