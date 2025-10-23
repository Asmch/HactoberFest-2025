class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int []arr=new int[2];
        Map <Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int a=nums[i];
            int more=target-a;
            if(mpp.containsKey(more))
            {
                arr[0]=mpp.get(more);
                arr[1]=i;
            }
            mpp.put(nums[i],i);
        }
        return arr;
    }
}
