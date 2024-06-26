class Solution {
    public int numRescueBoats(int[] people, int limit) {
               int n = people.length;
        Arrays.sort(people);
        int count=0;
        int i=0,j=n-1;
        while(i<=j){
            if(people[i]+people[j]<=limit){ 
                i++;
            }
            j--;
            count++;
        }
        return count++; 
    }
}