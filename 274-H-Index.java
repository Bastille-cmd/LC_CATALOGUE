class Solution {
    public int hIndex(int[] citations) {
        int[] arr=new int[citations.length+1];
        int count=0;
        for(int i=0;i<citations.length;i++){
            if(citations[i]>citations.length){
                arr[citations.length]++;
            }
            else{
                arr[citations[i]]++;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            count=count+arr[i];
            if(count>=i) return i;
        }
        return 0;
    }
}