class Solution {
    public List<Integer> majorityElement(int[] nums) {
         List<Integer>ll=new ArrayList<>();
        // if(nums.length==1){
        //      ll.add(nums[0]);
        //     return ll;
        // }
        // List<Integer>ll=new ArrayList<>();
        int c1=0,c2=0;
        int ele1=0,ele2=0;
        // System.out.print(ele2);
        for(int i=0;i<nums.length;i++){
            if(c1==0 && nums[i]!=ele2){
                c1=1;
                ele1=nums[i];
            }
            else if(c2==0 && nums[i]!=ele1){
                c2=1;
                ele2=nums[i];
            }
            else if(ele1==nums[i]){
                c1++;
            }
            else if(ele2==nums[i]){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=0;c2=0;
        for(int i=0;i<nums.length;i++){
            if(ele1==nums[i]) c1++;
            else if(ele2==nums[i]) c2++;
        }
        int maj=nums.length/3;
        if(c1>maj){
            ll.add(ele1);
        }
         // ll.add(ele1);
        if(c2>maj){
            ll.add(ele2);
        }
        // ll.add(ele2);
        // System.out.println(ll);
        return ll;
    }
}