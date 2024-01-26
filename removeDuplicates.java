public class removeDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,1,2};
        int dupedArr[] = removeDuplicates(arr);
        for (int i = 0; i < dupedArr.length; i++) {
            System.out.println(dupedArr[i]);
        }
    }
    public static int[] removeDuplicates(int[] nums) {
        int dupedArr[] = new int[nums.length];
        int dupePoint = 0;
        for (int numsIndex = 0; numsIndex < nums.length; numsIndex++) {
            boolean add = true;
            for (int dupedIndex = 0; dupedIndex < nums.length; dupedIndex++) {
                if (nums[numsIndex] == dupedArr[dupedIndex]) {
                    add = false;
                    continue;
                }
            }
            if (add == true) {
                dupedArr[dupePoint] = nums[numsIndex];
            }
        }
        return dupedArr;
    }
}
