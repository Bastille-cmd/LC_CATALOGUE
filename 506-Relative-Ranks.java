class Solution {
    public String[] findRelativeRanks(int[] score) {
        int max=0;
        String[] arr=new String[score.length];
        for(int i=0;i<score.length;i++){
            if(score[i]>max){
                max=score[i];
            }
        }
        int[] arr1=new int[max+1];
        for(int i=0;i<score.length;i++){
            arr1[score[i]]=i+1;
        }
        int rank=1;
        for(int i=arr1.length-1;i>=0;i--){
            if(arr1[i]!=0){
                int index=arr1[i]-1; 
                    if(rank==1){
                        arr[index]=\Gold Medal\;
                    }
                    else if(rank==2){
                        arr[index]=\Silver Medal\;
                    }
                    else if(rank==3){
                        arr[index]=\Bronze Medal\;
                    }
                else{
                    arr[index]=Integer.toString(rank);
                }
                rank++;
                if(rank>score.length) break;
            }
        }
        return arr;
    }
}