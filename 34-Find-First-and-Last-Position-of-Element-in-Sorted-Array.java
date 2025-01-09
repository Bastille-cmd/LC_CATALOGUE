class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        int first=binarysearch(nums,target,true);
        int last=binarysearch(nums,target,false);
        res[0]=first;
        res[1]=last;
        return res;
    }
    static int binarysearch(int[] arr, int target, boolean TrueFalse){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){   
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                if(TrueFalse){
                    end=mid-1;
                    }
                else{
                    start=mid+1;
                    }
            }
            else if(arr[mid]<target){
                start=mid+1;
                }
            else{
                end=mid-1;
            }
        }
        return ans;
        }
    }