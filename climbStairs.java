public class climbStairs {
    public int climbStair(int n) {
        int numberOfWays[] = new int[n+1];
        for(int i =0; i <=n; i++){
            if(i==0)
            numberOfWays[i] = 1;
            else if(i==1)
            numberOfWays[i] = 1;
            else{
                numberOfWays[i] = numberOfWays[i-1] + numberOfWays[i-2];
            }
        }
        return numberOfWays[n];
    }
}
