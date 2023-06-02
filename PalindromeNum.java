/**
 * PalindromeNum
 */
public class PalindromeNum {
    public static void main(String[] args) {
        int x = 1000000001;
        int y = (int)(Math.log10(x) + 1);
        System.out.println(y);
        System.out.println(isPalindrome(x));
        // System.out.println((x%10)/1); // last digit
        // System.out.println((x%100)/10); //digit before last digit
        // System.out.println((x%1000)/100); // digit before the digit that comes before the last digit
        // System.out.println((x%10000)/1000); // digit before the digit that comes before tha- you get the point
        // System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x){
        int length = 0;
        if(x!=0){
        length = (int)(Math.log10(x) + 1);
        }else{
            return true;
        }
        int arr[] = new int[length];
        boolean result = false;
        for(int i = 1; i <= length; i++){
            int start = i-1;
            arr[start] = (x % powerOf(10, (length-start)))/(powerOf(10, (length-start))/10);
        }
        int marker = 0;
        if(length%2==1){
            marker = (length/2) + 1;
        }else{
            marker = length/2;
        }
        for(int i = 1; i <= marker; i++){
            int start = i-1;
            int end = length -1;
            if((arr[start])== (arr[(end-start)])){
                result = true;
            }
            else{
                result = false;
                break;
            }
        }
        

        return result;
    }
    public static int powerOf(int input, int power){
        int original = input;
        if(power == 0){
            return 1;
        }
        for (int i = 1; i < power; i++){
            input = input * original;
    }
     return input;
}
}




// if((length%2)==1){
        //     length = (length/2) + 1;
        // }else{
        //     length = length/2;
        // }
        // for(int i = 0; i <= length; i++){
        //     System.out.println("First op "+ (x % powerOf(10, i+1))/(powerOf(10, i+1)/10));
        //     System.out.println("Second op :"+ (x % powerOf(10, (length-i)))/(powerOf(10, (length-i))/10));
            
            
        //     if(((x % powerOf(10, i+1))/(powerOf(10, i+1)/10)) == 
        //     (x % powerOf(10, (length-i)))/(powerOf(10, (length-i))/10)){
        //         result = true;
        //     }else{
        //         result = false;
        //         break;
        //     }
        // }