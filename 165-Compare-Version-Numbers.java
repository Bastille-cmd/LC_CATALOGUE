class Solution {
    public int compareVersion(String version1, String version2) {
        String arr1[]=version1.split(\\\\\.\);
        String arr2[]=version2.split(\\\\\.\);
        for(int i=0;i<arr1.length || i<arr2.length;i++){
            if(i>=arr1.length){
                if(Integer.parseInt(arr2[i])>0){
                    return -1;
                }
            }
            if(i>=arr2.length){
                if(Integer.parseInt(arr1[i])>0){
                    return 1;
                }
            }
            if(arr1.length>i && arr2.length>i){ 
                if(Integer.parseInt(arr1[i])>Integer.parseInt(arr2[i])){
                    return 1;
                }
                if(Integer.parseInt(arr1[i])<Integer.parseInt(arr2[i])){
                    return -1;
                }
            }
        }
        return 0;
    }
}