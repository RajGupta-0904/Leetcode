class Solution {
    public long[] sumOfThree(long num) {
        long arr[]=new long[3];
        if(num%3==0){
            arr[0]=num/3-1;
            arr[1]=num/3;
            arr[2]=num/3+1;
        }else{
          long arr1[]={};
            return arr1;
        }
        return arr;
    }
}