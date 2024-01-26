/**
 * first_occ_take_two
 */
public class first_occ_take_two {
    public static void main(String[] args) {
        String haystack = "a";
        String needle = "a";
        System.out.println(strStr(haystack, needle));
        int i = 0;
        int needleEndPoint = needle.length();
        String needleSub = haystack.substring(i, needleEndPoint);
        System.out.println(needleSub);
        System.out.println(needleSub.equals(needle));
        

    }

    public static int strStr(String haystack, String needle) {
        int needleEndPoint = needle.length();
        for (int i = 0; i < haystack.length(); i++) {
            System.out.println("NIGGA WE MADE IT");
            String needleSub = haystack.substring(i, needleEndPoint);
            System.out.println(needleSub);
            if (needleSub.equals(needle)) {
                return i;
            }
            needleEndPoint++;
        }
        return -1;
    }
}