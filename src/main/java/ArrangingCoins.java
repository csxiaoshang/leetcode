package main.java;

public class ArrangingCoins {
    public int arrangCoins(int n){
        int l=0,h=n;
        while(l<=h){
            int mid=l+(h-l)/2;
            long sum=(mid+1l)*mid/2;
            if (sum==n)
                return mid;
            else if (sum<n)
                l=mid+1;
            else h=mid-1;
        }
        return h;
    }
}
