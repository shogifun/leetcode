/**
 * Created by user on 22.03.2017.
 */
public class Problem268 {
    public int missingNumber(int[] nums) {
        int sum=0;
        for (int i:nums){
            sum+=i;
        }
        return sumProgr(nums.length)-sum;
    }
    private int sumProgr(int n){
        return (0+n)*(n+1)/2;
    }
}
