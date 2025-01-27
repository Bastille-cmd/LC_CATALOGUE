class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        char res='%';
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]==target){
                start=mid+1;
            }
            else if(letters[mid]>target){
                res=letters[end];
                end=end-1;
            }
            else{
                start=mid+1;
            }
        }
        return (res=='%')?letters[0]:res;
    }
}