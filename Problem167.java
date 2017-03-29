/**
 * Created by user on 28.03.2017.
 */
public class Problem167 {
    public int[] twoSum(int[] numbers, int target) {
        int []res=new int[2];
        int start=0;
        int end=numbers.length-1;
        while (start<end){
            if (numbers[start]+numbers[end]==target){
                res[0]=start+1;
                res[1]=end+1;
                return res;
            }
            if (numbers[start]+numbers[end]<target){
                start++;
                continue;
            }
            if (numbers[start]+numbers[end]>target){
                end--;
                continue;
            }
        }
        return res;
    }
}
