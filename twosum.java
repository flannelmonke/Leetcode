public class twosum {
    public static void main(String[] args) {
        int nums[] = {3,3};
        int target = 6;

        System.out.println(twoSum(nums, target));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }else{
                    continue;
                }
            }
        }
        return result;
    }
}
