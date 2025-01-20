class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int[] arr1=new int[mat.length];
        int[] arr2=new int[mat[0].length];
        HashMap<Integer, int[]> map=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                map.put(mat[i][j],new int[]{i,j});
            }
        }
        int i;
        for(i=0;i<arr.length;i++){
            int[] indexes=map.get(arr[i]);
            arr1[indexes[0]]++;
            arr2[indexes[1]]++;
            if(arr1[indexes[0]]==mat[0].length || arr2[indexes[1]]==mat.length)
            return i;
        }
        return i;
    }
}