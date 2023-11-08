public class mergeSortedLists {
    public static void main(String[] args) {
        int[] nums1 = {-12,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] nums2 = {-49,-45,-42,-41,-40,-39,-39,-39,-38,-36,-34,-34,-33,-33,-32,-31,-29,-28,-26,-26,-24,-21,-20,-20,-18,-16,-16,-14,-11,-7,-6,-5,-4,-4,-3,-3,-2,-2,-1,0,0,0,2,2,6,7,7,8,10,10,13,13,15,15,16,17,17,19,19,20,20,20,21,21,22,22,24,24,25,26,27,29,30,30,30,35,36,36,36,37,39,40,41,42,45,46,46,46,47,48};
        int m = 1;
        int n = 90;
        merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }    
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int marker1=0;
        int marker2=0;
        for(marker1=0; marker1<(m+n);marker1++){
            if(n==0){
                break;
            }
            if(m==0){
                addNums(nums1, nums2[marker2], marker1);
                break;
            }
            if(emptySpaceCondition(nums1, m, nums2, n, marker1, marker2)){
                addNums(nums1, nums2[marker2], marker1);
                marker2++;
                continue;
            }
            if(marker2<n){
                if(nums1[marker1]>nums2[marker2]){
                    addNums(nums1, nums2[marker2], marker1);
                    marker2++;
                }
            }
            marker1++;
        }
    }
    public static boolean emptySpaceCondition(int[] nums1, int m, int[] nums2, int n, int marker1, int marker2){
        if(marker1>m){
            //if(nums1[marker1]<nums1[(marker1-1)]){
            return true;
            //}
        }
        return false;
    }
    public static int[] addNums(int[] nums, int numberToAdd, int index){
            for(int i=index; i<nums.length; i++){
                int saved = nums[i];
                nums[i] = numberToAdd;
                numberToAdd = saved;
            }
            return nums;
        }
    }
        // debug print
            // System.out.println("one "+marker1);
            // System.out.println("two "+marker2);
            // for (int i = 0; i < nums1.length; i++) {
            //     System.out.println(nums1[i]);
            // }
        
    // int last = i;
    //         while(j<(n+m)){
    //             if(nums1[i]==0){
    //                 break;
    //             }else if(nums2[j]==0){
    //                 addNums(nums1, nums2[i], j);
    //                 break;
    //             }
            