public class firstOccurence {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "pi";
        System.out.println(strStr(haystack, needle));
        System.out.println(haystack.substring(1, 2));
        haystack.equals(needle);
    }

    public static int strStr(String haystack, String needle) {
        int needleIndex = 0;
        int haystackIndex = 0;
        int firstOccurrence = -1;
        while (haystackIndex < haystack.length()) {
            // chars match
            System.out.println();
            if (haystack.charAt(haystackIndex) == needle.charAt(needleIndex)) {
                // if no first index has already been set
                if (firstOccurrence == -1) {
                    System.out.println("Match found for hay: " + haystack.charAt(haystackIndex) + " and needle: "
                            + needle.charAt(needleIndex));
                    firstOccurrence = haystackIndex;
                    needleIndex++;
                    System.out.println("first occurrence = " + firstOccurrence);
                }
                // if first index has already been set
                else {
                    System.out.println("Match found for hay: " + haystack.charAt(haystackIndex) + " and needle: "
                            + needle.charAt(needleIndex));
                    System.out.println("not first occurrence");
                    needleIndex++;
                }
                // when we've matched the last letter of the word we know its our word
                if (needleIndex == needle.length()) {
                    System.out.println("whole word matched");
                    return firstOccurrence;
                }
            } // when the chars do not match
            else {
                if (firstOccurrence == -1) {
                    System.out.println(
                            "no match at " + haystack.charAt(haystackIndex) + " with " + needle.charAt(needleIndex));
                    System.out.println("no first occurrence");
                    needleIndex = 0;
                } else {
                    haystackIndex = firstOccurrence + 1;
                    needleIndex = 0;
                    firstOccurrence = -1;
                    continue;
                }
            }
            haystackIndex++;
        }
        if (needleIndex < needle.length()) {
            firstOccurrence = -1;
        }
        return firstOccurrence;
    }
}