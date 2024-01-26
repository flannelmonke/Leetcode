public class find_repeated_substrings {
    public static void main(String[] args) {
        String s = "abca";
        int x = 'a';
        x += 'b';
        int y = x*6;
        double huh = y/x;
        System.out.println(huh);
        System.out.println(huh%1);
    }
    public static boolean repeated_substring_pattern(String s){
        int nums[] = create_sub_string(s);
        double comp = nums[1]/nums[0];
        if((comp % 1)==0){
            return true;
        }
        return false;
    }
    public static int[] create_sub_string(String s){
        String sub = ""+s.charAt(0);
        int[] numerical_values = {s.charAt(0), s.charAt(0)};
        
        for (int i = 1; i < s.length(); i++) {
            numerical_values[1] = numerical_values[1]+s.charAt(i);
            for (int j = 0; j < sub.length(); j++) {
                if(s.charAt(i)==sub.charAt(j)){
                    break;
                }else if(s.charAt(i)!=sub.charAt(j) && j==(sub.length()-1)){
                    sub = sub + s.charAt(i);
                    numerical_values[0] = numerical_values[0] + s.charAt(i);
                }else if(s.charAt(i)!=sub.charAt(j)){
                    continue;
                }
            }    
        }
        return numerical_values;
    }
}
