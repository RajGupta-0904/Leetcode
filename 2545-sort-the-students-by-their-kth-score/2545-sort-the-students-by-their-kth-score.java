class Solution {
    public int[][] sortTheStudents(int[][] arr, int k) {
//         first two loop n-1 tk chla h kyoki k<n hoga given h constrainst
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j][k]<arr[j+1][k]){
//                     swaping
//                     loop for given column index sort
                    for(int a=0;a<arr[0].length;a++){
                        int temp =arr[j][a];
                        arr[j][a]=arr[j+1][a];
                        arr[j+1][a]=temp;
                    }
                }
            }
        }
        return arr;
    }
}