import java.util.*;

public class longest_common_prefix {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        ArrayList<String> letters = new ArrayList();
        // an array list of letter's that repeat throughout all Strings
        // if the array list is of size one. there is no prefix.
        // If the array list at least of size two, return the concatenation of that list
        int shortest_word = 0;
        // find index of longest word
        for (int i = 1; i < strs.length; i++) {
            if (strs[shortest_word].length() > strs[i].length()) {
                shortest_word = i;
            }
        }

        for (int i = 0; i < strs[shortest_word].length(); i++) {
            boolean let_ = true;
            for (int j = 0; j < strs.length; j++) {
                try {
                    if (strs[j].charAt(i) != strs[j - 1].charAt(i)) {
                        let_ = false;
                        break;
                    }
                } catch (Exception e) {
                    continue;
                }

            }
            if (let_) {
                letters.add(strs[i].charAt(i) + "");
            }
        }

        return concat(letters);

    }

    public static String concat(ArrayList<String> chars) {
        String result = "";
        for (int i = 0; i < chars.size(); i++) {
            result = result + chars.get(i);
        }
        return result;
    }
}
