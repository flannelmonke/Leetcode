/**
 * plusone
 */
public class plusone {
    public static void main(String[] args) {
        //
    }
    //main function that is called to add one to the last digit of an array of digits.
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        //checks if all the digits are nines, this is the only case where we need to change the size of the whole array
        if(allNines(digits) == true){
                int arr[] = new int[digits.length +1];
                arr[0]=1;
                for(int j=1;j<digits.length;j++){
                    arr[j]=0;
                }
                digits=arr;
                return digits;
        }
        //if the array is not all nines, we add one to the last digit of the array
        digits[i] += 1;
        //from here we check if there is a two digit number after our first operation,, if there is we change the last digit to 0 and carry over the one
        while(digitsGood(digits)==false){
            digits[i]=0;
            if(i>0){
                i--;
            }
            digits[i]+=1;
        }
        return digits;
    }
    //checks if the array has any two digit numebers
    public boolean digitsGood(int[] digits){
        for(int i=0;i<digits.length;i++){
            int length = String.valueOf(digits[i]).length();
            if(length>1){return false;}
        }
        return true;
    }
    //checks if all the digits are nines
    public boolean allNines(int[] digits){
        boolean darn = false;
        for(int i =0; i<digits.length;i++){
            if(digits[i]==9){
                darn = true;
            }else{
                darn = false;
                break;
            }
        }
        if(darn == true){
            return true;
        }
        return false;
    }
}