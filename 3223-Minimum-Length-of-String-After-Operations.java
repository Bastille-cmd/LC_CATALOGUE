class Solution {
    public int minimumLength(String s) {
        int count=0;
        int total=s.length();
        for(int i=97;i<123;i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==i) count++;
            }
            if(count%2==0 && count>2) total=total-count+2;
            if(count%2!=0 && count>2) total=total-count+1;
            count=0;
        }
        return total;
    }
}