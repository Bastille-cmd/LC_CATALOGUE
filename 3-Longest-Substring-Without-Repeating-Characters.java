class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ar[]=new int[256];
        Arrays.fill(ar,-1);
        int i=0;
        int max=0;
        int n=s.length();
        for(int j=0;j<n;j++)
        {
            char ch=s.charAt(j);
            int index=(int)ch;
            if(ar[index]==-1)
            {
                ar[index]=j;
            }
            else
            {
                max=Math.max(max,j-i);
                i=ar[index]+1;
                ar[index]=j;
                for(int x=0;x<256;x++)
                {
                    if(ar[x]<i) ar[x]=-1;
                }
                // i=j;
            }
        }
        System.out.println(max);
        return Math.max(max,n-i);
    }
}