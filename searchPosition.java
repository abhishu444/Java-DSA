public class searchPosition {
    public static int search(int[] nums,int target)
    { 
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        { 
            int mid=((start+end)/2);
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return start;
    }
        public static void main(String[] args)
        {
            int nums[]={1,2,3,4,5};
            int target=4;
            int position=search(nums,target);
            System.out.println(position);
        }
    
}
