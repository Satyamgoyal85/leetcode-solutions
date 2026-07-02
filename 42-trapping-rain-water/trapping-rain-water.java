class Solution {
    public int trap(int[] h) {
       int [] left=new int [h.length];
       int [] right=new int [h.length];
       left[0]=h[0];
       right[right.length-1]=h[h.length-1];
       int i=1;
       int j=h.length-2;
       while(i<h.length){
        left[i]=Math.max(h[i],left[i-1]);
        i++;
       }
       while(j>=0){
        right[j]=Math.max(h[j],right[j+1]);
        j--;
       }
       int k=0;
       int trap=0;
       if(h.length<3) return 0;
       while(k<h.length){
            int waterLvl=Math.min(left[k],right[k]);
            if((waterLvl-h[k])>0){
                trap+=(waterLvl-h[k]);
            }else{
                trap+=0;
            }
            k++;
       }
       return trap;
    }
}