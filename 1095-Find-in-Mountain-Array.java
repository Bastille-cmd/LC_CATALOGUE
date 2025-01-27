/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start=0;
        int end=mountainArr.length();
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            int cur=mountainArr.get(mid);
            if(mid!=0 && mid!=mountainArr.length()-1 && cur>mountainArr.get(mid+1) && cur>mountainArr.get(mid-1)){
                if(cur==target){
                    return mid;
                }
                break;
            }
            if(mid!=mountainArr.length()-1 && cur<mountainArr.get(mid+1)){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        start=0;
        end=mid-1;
        while(start<=end){
            int m=start+(end-start)/2;
            int cur=mountainArr.get(m);
            if(cur==target){
                return m;
            }
            if(cur<target){
                start=m+1;
            }
            if(cur>target){
                end=m-1;
            }
        }
        start=mid+1;
        end=mountainArr.length()-1;
        while(start<=end){
            int m=start+(end-start)/2;
            int cur=mountainArr.get(m);
            if(cur==target){
                return m;
            }
            if(cur<target){
                end=m-1;
            }
            if(cur>target){
                start=m+1;
            }
        }
        return -1;
    }
}