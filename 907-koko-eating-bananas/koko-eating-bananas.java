class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max =0;
        for(int ele:piles){
            if(ele>max) max=ele;
        }
        int l=1;
        int r=max;
        double ans=Integer.MAX_VALUE;
        while(l<=r){
            int mid=(int)l+((r-l)/2);
            double modVal=0;
            for(double ele:piles){
                modVal=modVal+Math.ceil(ele/mid);
            }
            if(modVal<=h){
                ans=Math.min(ans,mid);
                r=mid-1;
            }
            else if(modVal>h){
                l=mid+1;
            }
        }
        return (int)ans;
    }
}