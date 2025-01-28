import java.util.StringTokenizer;
class Solution {
    public String reverseWords(String s) {
        StringBuilder ss=new StringBuilder();
        StringTokenizer str=new StringTokenizer(s, \ \);
        while(str.hasMoreTokens()){
            ss.insert(0, str.nextToken());
            if(str.hasMoreTokens()){
                ss.insert(0, \ \);
            }
        }
        return ss.toString();
    }
}