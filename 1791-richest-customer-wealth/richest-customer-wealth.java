class Solution {
    public int maximumWealth(int[][] accounts) {
        int i=0;
        int m=accounts.length;
        int n= accounts[i].length;
        int [] maxi= new int [m];
        int max=0;
        for (i=0; i<m; i++){
            int sum=0;
            for (int j=0; j<n; j++){
                sum+=accounts[i][j];
            }
            maxi[i]=sum;
            if(maxi[i]>max){
                max=maxi[i];
            }
        }
        return max;
    }
}