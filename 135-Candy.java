class Solution {
    public int candy(int[] ratings) {
        int[] arr=new int[ratings.length];
        Arrays.fill(arr,1);
        for(int i=0;i<ratings.length-1;i++){
            if(ratings[i]>ratings[i+1]){
                if(arr[i]>arr[i+1]){
                    continue;
                }
                else arr[i]++;
            }
            if(ratings[i]<ratings[i+1]){
                arr[i+1]=arr[i]+1;
            }
        }
        for(int i=ratings.length-1;i>0;i--){
            if(ratings[i]<ratings[i-1]){
                if(arr[i]<arr[i-1]){
                    continue;
                }
                if(arr[i]>=arr[i-1]){
                    arr[i-1]=arr[i]+1;
                }
            }
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}